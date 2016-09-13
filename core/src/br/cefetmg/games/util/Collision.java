package br.cefetmg.games.util;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;

/**
 * Utilitário para verificação de colisão.
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {
   public static final boolean circlesOverlap(Circle c1, Circle c2) {
       if(Math.pow(c1.radius+c2.radius, 2) > (Math.pow(c1.x-c2.x, 2) + Math.pow(c1.y-c2.y, 2))){
           return true;
       } 
       return false;
    }
    
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        if(((r1.x < r2.x && r1.x+r1.width > r2.x) || (r1.x > r2.x && r2.x+r2.width > r1.x)) &&
            ((r1.y < r2.y && r1.y+r1.height > r2.y) || (r1.y > r2.y && r2.y+r2.height > r1.y))){
            return true;
        }
        return false;
    }
    
}
