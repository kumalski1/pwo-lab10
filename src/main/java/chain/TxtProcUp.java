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
 public class TxtProcUp extends TxtProc {

 public static String ACTION = "UP";

 @Override
 public String processRequest(Request request){

 if(request.action.toUpperCase().equals(ACTION)){
 return request.text.toUpperCase();
 } else return next(request);
 }
 }