/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class MixStart
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();

        boolean result = mixStart(inputString);
        System.out.println(result);
    }

    /**
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     *
     * @param str
     * @return
     */
    public static boolean mixStart(String str)
    {
        if (str.length() >= 3) {
            String prefix = str.substring(1, 3);
            return prefix.equals("ix");
        }
        return false;
    }
}
