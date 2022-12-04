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
 public class TxtCyfra extends TxtProc {

 public static String ACTION = "CYFRA";

 public static String removeAllDigit(String str)
    {
        // Converting the given string
        // into a character array
        char[] charArray = str.toCharArray();
        String result = "";
 
        // Traverse the character array
        for (int i = 0; i < charArray.length; i++) {
 
            // Check if the specified character is not digit
            // then add this character into result variable
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
 
        // Return result
        return result;
    }
 
 @Override
 public String processRequest(Request request){

 if(request.action.toUpperCase().equals(ACTION)){
 String text1=request.text;
 String text2=removeAllDigit(text1);
 
 return request.text.replace(request.text,text2);
 
 } else return next(request);
 }
 }