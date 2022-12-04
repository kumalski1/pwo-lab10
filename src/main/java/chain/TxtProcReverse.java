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
 public class TxtProcReverse extends TxtProc {

 public static String ACTION = "REVERSE";

 @Override
 public String processRequest(Request request){
 if(request.action.toUpperCase().equals(ACTION)){
 return new
 StringBuilder(request.text).reverse().toString();
 } else return next(request);
 }
 }
