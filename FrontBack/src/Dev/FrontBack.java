/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

/**
 *
 * @author aswit
 */
public class FrontBack
{

    public static String frontBack(String str)
    {
        int length = str.length();
        if (length <= 1) {
            return str;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(length - 1);
        String middleChars = str.substring(1, length - 1);
        return lastChar + middleChars + firstChar;
    }

    /**
     * Given a string, return a new string where the first and last chars have
     * been exchanged.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        String result = frontBack(inputString);
        System.out.println("Result: " + result);

    }
}
