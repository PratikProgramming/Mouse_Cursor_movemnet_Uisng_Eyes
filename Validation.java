/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyetrackingsystem;

import eyetrackingsystem.User.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mannu
 */
public class Validation {
     

     public static String valid(String name,String contact)
        {
          //  Regex re = new Regex("[0-9]{10}");

            
        if("".equals(name))
             return "Invalid Name ...";
       
        CharSequence inputStr = name;
        Pattern pattern = Pattern.compile("^[a-zA-Z \\s]*$");
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches())
        {
        }
        else
        {
             return "Invalid Name ...";
         }
            
            boolean  c=contact.matches("[0-9]{10}");
            if(c==false)
            {
                return "Invalid Contact ...";
            }
            
          //  [a-zA-Z ]"
            
           
         
            
            return "";
        }

    
    
}
