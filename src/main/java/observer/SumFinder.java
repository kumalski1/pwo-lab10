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

 public class SumFinder implements Subscriber {

 Integer sum = null;

 @Override
 public void action(int x) {
 sum = sum==null ? x : sum+x;
 }

 public int getSum() { return sum; }
 
public int getAvg(int N) { return sum/N; }
 
 }
