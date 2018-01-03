/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import displayutils.Scene;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.event.MouseInputAdapter;

/**
 *
 * @author bowen
 */
public class GameScene extends Scene {

    private List<GraphicObject> listGraphicObj = new LinkedList<>();
    private boolean isBlack = false;
    private boolean inArea = false;
    
    private int xPos = 30;
    
    public GameScene(int xsize, int ysize) {
        super(xsize, ysize);
        this.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                isBlack = !isBlack;
                
                if (e.getX()>= 0 && e.getX()<= 50 && e.getY() >= 0 && e.getY() <= 50) {
                    inArea = !inArea;
                }
                
                
            }
        });
        
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                if (e.getKeyCode() == KeyEvent.VK_D) {
                    xPos += 10;
                } else if (e.getKeyCode() == KeyEvent.VK_A) {
                    xPos -= 10;
                }
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
        if (inArea) {
            g.setColor(Color.GREEN);
        }
        g.fillRect(0, 0, 50, 50);
        g.setColor(Color.red);
        g.fillRect(xPos, 80, 50, 50);
    }

    @Override
    protected void postPaint() {
        
    }

    @Override
    protected void afterPaint() {
        
    }
    
}
