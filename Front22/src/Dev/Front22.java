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
import java.util.Scanner;

public class Front22
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        String result = frontAndBack(inputString);
        System.out.println(result);
    }

    /**
     * Given a string, take the first 2 chars and return the string with the 2
     * chars added at both the front and back, so "kitten" yields"kikittenki".
     * If the string length is less than 2, use whatever chars are there
     *
     * @param str
     * @return
     */
    public static String frontAndBack(String str)
    {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + str + firstTwoChars;
        }
    }
}
