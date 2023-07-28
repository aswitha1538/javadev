/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlength;
import java.util.Scanner;
/**
 *
 * @author aswit
 */
public class Stringlength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputReader=new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput=inputReader.nextLine();
        int length=userInput.length();
        System.out.println("The data string: "+userInput+", length of the string: " +length);
    }
    
}
