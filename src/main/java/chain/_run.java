/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chain;

/**
 *
 * @author Michal
 */
 public class _run {

 public static void main(String[] args) {

 TxtProc procChain = new TxtProcUp();
 procChain.add(new TxtProcDown());
 procChain.add(new TxtProcReverse());
 procChain.add(new TxtCyfra());

 Request request0 = new Request("Al3a Ma445 Kota1", "cyfra");
 Request request1 = new Request("Ala Ma Kota", "up");
 Request request2 = new Request("Ala Ma Kota", "down");
 Request request3 = new Request("Ala Ma Kota", "reverse");
 Request request4 = new Request("Ala Ma Kota", "?");

 System.out.println(procChain.processRequest(request0));
 System.out.println(procChain.processRequest(request1));
 System.out.println(procChain.processRequest(request2));
 System.out.println(procChain.processRequest(request3));
 System.out.println(procChain.processRequest(request4));
 }
 }
