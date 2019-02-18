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
public class Main {
    public static void main(String [] agrs) {
        
        
        
        Point P1 = new Point ();
        Point P2 = new Point ();
        Point P3 = new Point ();
        
        
        Point P4 = new Point ();
        Point P5 = new Point ();
        Point P6 = new Point ();
        Point P7 = new Point ();
        
        //Donnez des point au differents //
        
        FormeGeometrique [] tab = new FormeGeometrique[2];
        tab [0] = new Triangle (P1,P2,P3);
        tab [1] = new Carre (P4,P5,P6,P7);
        
        System.out.println(tab[0].CalculPerimetre());
        System.out.println(tab[1].CalculPerimetre());
        
        
        
        System.out.println(tab[0].CalculSurface());
        System.out.println(tab[0].CalculSurface());
    }
    
}
