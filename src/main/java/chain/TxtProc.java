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
 public abstract class TxtProc implements
 Request.RequestHandler {

 protected TxtProc next = null;

 public void add(TxtProc txtProc){
 if(next==null) next = txtProc; else next.add(txtProc);
 }

 protected String next(Request request){
 if(next!=null) return next.processRequest(request);
 else return null;
 }
 }
