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
public class _run {

 public static void main(String[] args) {

 NumberGetter numberGetter = new NumberGetter();

 MaxFinder maxFinder = new MaxFinder();
 SumFinder sumFinder = new SumFinder();

 numberGetter.add(maxFinder);
 numberGetter.add(sumFinder);

 numberGetter.getNumbers(3);

 System.out.println("Max: " + maxFinder.getMax());
 System.out.println("Sum: " + sumFinder.getSum());
 //Obliczanie sredniej
 System.out.println("Avg: " + sumFinder.getAvg(3));
 }
 }