/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.io.*;

/**
 *
 * @author aswit
 */
public class SleepIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        System.out.println("sleepIn(false, false)->"+sleepIn(false, false));
        System.out.println("weekday = "+true+", vacation="+false+", sleepIn()="+sleepIn(true, false));
        System.out.println("weekday = "+false+", vacation="+true+", sleepIn()="+sleepIn(false, true));
    }
    
    public static boolean sleepIn(boolean weekday, boolean vacation)
    {
        boolean result;
        
        result = !weekday || vacation;
        return result;
    }
}
