/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyetrackingsystem.User;

/**
 *
 * @author mannu
 */
public class Validation {
     
    public static String ContactNo(String contact)
        {
          //  Regex re = new Regex("[0-9]{10}");

             boolean b;
             b=contact.matches("[0-9]{10}");
            if (b)
            {
                return "";
            }
            else
            {
                return "Invalid Contact No";
            }
        }


    
}
