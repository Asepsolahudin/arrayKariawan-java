/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraykariawan;
import java.io.*;

/**
 *
 * @author Apsalboy
 */
public class myinput {
    public String bacaString()
    {
        BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in),1);
        String string ="";
        try
        {
            string = bfr.readLine();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
        return string;
    }
        public int bacaInt()
        {
            return Integer.parseInt(bacaString());
        }
    }
    

