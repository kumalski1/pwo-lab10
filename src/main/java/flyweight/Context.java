/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

 public class Context {

 private double x, y;

 public Context(double x, double y) {
 this.x = x;
 this.y = y;
 }

 public void setX(double x) {this.x = x;}
 
 public void setY(double y) {this.y = y;}

 public double getX() {return x;}

 public double getY() {return y;}
 }
 