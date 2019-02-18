/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2kouma.ahamadou2ir;

/**
 *
 * @author Muhamedhine
 */
public class Triangle  implements FormeGeometrique {
    
    Point[] tab;
    public Triangle () {
        tab = new Point [3];
        
    }
    public Triangle (Point a, Point b, Point c) {
        
        tab[0]= a;  tab[1] = b; tab[2] = c;
    }
  
    public float CaluclulPerimetre () {
        return 0;
      
    }
    
    public float CalculeSurface () {
        return 0;
        
    }
    public Point [] getPoint () {
        return tab;
    }

    @Override
    public float CalculPerimetre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float CalculSurface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point[] GetPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
