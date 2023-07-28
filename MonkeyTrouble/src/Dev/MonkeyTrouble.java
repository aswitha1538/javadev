/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

/**
 *
 * @author aswit
 */
public class MonkeyTrouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("aSmile = " + false + ", bSmile = " + false + 
                           ",monkeyTrouble()=" + monkeyTrouble(false, false));

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile || !bSmile) {
            return true;
        }

        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }

}
