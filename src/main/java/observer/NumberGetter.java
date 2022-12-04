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
 import java.util.Scanner;

 public class NumberGetter extends Publisher {

 Scanner scanner = new Scanner(System.in);

 public void getNumbers(int N){
 int x;
 do{
 System.out.print("Wprowadź liczbę: ");
 try{ x = scanner.nextInt(); }
 catch(Exception ex) {
 scanner.nextLine();
 continue;
}
 notifySubscribers(x);
 N--;
 }while(N>0);

 scanner.close();
 }
 
 
 
 } 