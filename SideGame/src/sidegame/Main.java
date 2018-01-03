/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import displayutils.Scene;
import displayutils.Viewport;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author bowen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(); //Find the screen size
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        int defaultW = width;
        int defaultH = height*19/20; //Show a window that is a bit shorter than full-screen
        
        //Build the Frame, Panel and light thread
        Viewport frame = new Viewport("SideGame", defaultW, defaultH);
        Scene panel = new GameScene(defaultW, defaultH);
        frame.add(panel);
        
        panel.setFocusable(true);
        panel.start();
    }
    
}
