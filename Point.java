/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2kouma.ahamadou2ir;

/**
 *
 * @author KAH
 */
public class Point {
    float y;
    float x;
    
    public Point (){
        x = 0;
        y = 0;
    }
 public Point (float x, float y) {
     this.x = x;
     this.y = y;
 }  
 public void setX(float x){
     this.x = x;
 }
 public void setY(float y){
     this.y = y;
 }
 public float getX (){
     return x;
 }
 
 public float getY () {
     return y;
 }
}

