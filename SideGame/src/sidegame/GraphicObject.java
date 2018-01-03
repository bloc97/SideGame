/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidegame;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author panbe
 */
public class GraphicObject {

    private final Rectangle2D rec;
    
    public GraphicObject(int x, int y, int width, int height) {
        rec = new Rectangle(x, y, width, height);
    }
    
    public boolean isWithinObject(Point2D point) {
        return rec.contains(point);
    }
    
    public boolean isColliding(Rectangle2D rec) {
        return rec.intersects(rec);
    }

    public Rectangle2D getRectangle2D() {
        return rec;
    }
    
    
}
