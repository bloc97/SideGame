/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayutils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.swing.JPanel;

/**
 *
 * @author bowen
 */
public abstract class DisplayPanelSingleThread extends JPanel {
    
    private ScheduledFuture updateFuture;
    
    private ScheduledExecutorService executorService;
    
    private volatile long lastTickTimeNanos;
    private int fps;
    
    public DisplayPanelSingleThread(ScheduledExecutorService executorService, int fps) {
        this.executorService = executorService;
        this.lastTickTimeNanos = System.nanoTime();
        this.fps = fps;
    }

    public ScheduledExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ScheduledExecutorService executorService) {
        this.executorService = executorService;
        if (isRenderRunning()) {
            stopRender();
            startRender();
        }
    }
    
    public boolean isRenderRunning() {
        if (updateFuture != null) {
            return !updateFuture.isDone();
        }
        return false;
    }
    
    public boolean startRender() {
        if (!isRenderRunning()) {
            this.lastTickTimeNanos = System.nanoTime();
            updateFuture = executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    update();
                }
            }, TimeUnit.SECONDS.toNanos(1)/(500), TimeUnit.SECONDS.toNanos(1)/fps, TimeUnit.NANOSECONDS);
            return true;
        }
        return false;
    }
    
    public boolean stopRender() {
        if (updateFuture != null) {
            if (updateFuture.cancel(true)) {
                updateFuture = null;
                return true;
            }
        }
        return false;
    }

    public boolean setFPS(int fps) {
        this.fps = fps;
        if (isRenderRunning()) {
            stopRender();
            return startRender();
        }
        return true;
    }

    public int getFPS() {
        return fps;
    }
    
    public final void update() {
        long currentNanos = System.nanoTime();
        PreciseTime dt = new PreciseTime(currentNanos - lastTickTimeNanos, TimeUnit.NANOSECONDS);
        lastTickTimeNanos = currentNanos;
        
        //repaint();
        prePaint(dt);
        Graphics g = getGraphics();
        if (g != null) {
            onPaint(g, dt);
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
        }
        postPaint(dt);
        Toolkit.getDefaultToolkit().sync();
    }
    
    public abstract void prePaint(PreciseTime dt);
    public abstract void onPaint(Graphics g, PreciseTime dt);
    public abstract void postPaint(PreciseTime dt);
    
    
}
