/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import displayutils.Scene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author bowen
 */
public class GameScene extends Scene {

    private boolean isBlack = false;
    
    
    public GameScene(int xsize, int ysize) {
        super(xsize, ysize);
        this.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                isBlack = !isBlack;
            }
        });
        
    }
    
    

    @Override
    protected void beforePaint() {
        
    }

    @Override
    protected void prePaint() {
        
    }

    @Override
    protected void onPaint(Graphics g) {
        if (isBlack) {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(0, 0, this.xsize, this.ysize);
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 50, 50);
    }

    @Override
    protected void postPaint() {
        
    }

    @Override
    protected void afterPaint() {
        
    }
    
}
