/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayutils;

import java.awt.Rectangle;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.concurrent.ScheduledExecutorService;

/**
 *
 * @author bowen
 */
public abstract class Scene extends DisplayPanelSingleThread {
    
    protected Camera camera;
    protected Viewport viewport;
    
    
    public Scene(ScheduledExecutorService executorService, int fps) {
        super(executorService, fps);
        this.camera = new Camera(this, getWidth(), getHeight());
        
        this.setLayout(null);
        this.setVisible(true);
        
        
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Rectangle r = e.getComponent().getBounds();
                int w = r.width;
                int h = r.height;
                Scene thisScene = ((Scene)(e.getComponent()));
                Camera thisCamera = thisScene.getCamera();
                thisCamera.setScreenSize(w, h);
            }
        });
        
    }
    
    
    public Viewport viewport() {
        return viewport;
    }
    
    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }
    
    public Camera getCamera() {
        return camera;
    }

}
