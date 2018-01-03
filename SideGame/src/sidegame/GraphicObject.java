/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author panbe
 */
public class GraphicObject {

    private Rectangle rec;
    
    public GraphicObject(int x, int y, int height, int width ) {
        rec.y = y;
        rec.x = x;
        rec.width = width;
        rec.height = height;
    }
    
    public boolean isClicked(Point point) {
        if (rec.x <=point.x && rec.x+rec.width >= point.x && rec.y <= point.y && rec.y+rec.height >= point.y) {
            return true;
        }
        else { return false;
        
        }
    }
    
    
    
}
