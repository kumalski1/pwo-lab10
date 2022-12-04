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
 public class Request {

 public interface RequestHandler{
 String processRequest(Request request);
 }

 public final String text;
 public final String action;

 public Request(String text, String action) {
 this.text = text;
 this.action = action;
 }
 }
