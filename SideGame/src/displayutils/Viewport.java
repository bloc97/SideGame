/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayutils;

import javax.swing.JFrame;

/**
 *
 * @author bowen
 */
public class Viewport extends JFrame {
    private Scene scene;
    
    private boolean fullScreen = false;
    private int lastX, lastY, lastW, lastH;
    
    public Viewport(String titleName, int xsize, int ysize) {
        this.setSize(xsize, ysize);
        
        this.setVisible(true);
        this.setTitle(titleName);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public Scene getScene() {
        return scene;
    }
    public void setScene(Scene scene) {
        if (this.scene != null) {
            this.scene.stopRender();
            this.scene.setViewport(null);
            this.scene.setFocusable(false);
            this.remove(this.scene);
        }
        this.scene = scene;
        this.add(scene);
        this.scene.setViewport(this);
        this.scene.setFocusable(true);
        this.scene.startRender();
    }
    
    public void toggleFullScreen() {
        if (fullScreen) {
            dispose();
            setUndecorated(false);
            setVisible(true);
            setBounds(lastX, lastY, lastW, lastH);
            
            fullScreen = false;
        } else {
            lastX = getX();
            lastY = getY();
            lastW = getWidth();
            lastH = getHeight();
            dispose();
            setUndecorated(true);
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setVisible(true);
            fullScreen = true;
        }
    }
}
