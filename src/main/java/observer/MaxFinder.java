/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer;

/**
 *
 * @author Michal
 */
 import observer.Publisher.Subscriber;

 public class MaxFinder implements Subscriber {

 Integer max = null;

 @Override
 public void action(int x) {
 if(max==null || max<x) max = x;
 }
 


 public int getMax(){ return max; }
 }