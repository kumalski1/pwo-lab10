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

 public class TxtProcDown extends TxtProc {

 public static String ACTION = "DOWN";

 @Override
 public String processRequest(Request request){

 if(request.action.toUpperCase().equals(ACTION)){
 return request.text.toLowerCase();
 } else return next(request);
 }
 }
