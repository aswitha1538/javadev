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

public class MissingChar
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();

        System.out.println("Enter the index value to remove character (0 to " + (inputString.length() - 1) + "): ");
        int n = input.nextInt();

        String result = missingChar(inputString, n);
        System.out.println("Result: " + result);
    }

    /**
     *
     * Given a non-empty string and an int n, return a new string where the char
     * at index n has been removed. The value of n will be a valid index of a
     * char in the original string (i.e. n will be in the range
     * 0..str.length()-1 inclusive).
     *
     * @param str
     * @param n
     * @return
     */

    public static String missingChar(String str, int n)
    {
        if (n >= 0 && n < str.length()) {
            return str.substring(0, n) + str.substring(n + 1);
        } else {
            return str;
        }
    }
}
