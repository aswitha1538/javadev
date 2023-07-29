/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class BackAround
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        String result = backAround(inputString);
        System.out.println("Result: " + result);
    }

    /**
     *
     * Given a string, take the last char and return a new string with the last
     * char added at the front and back so "cat" yields "tcatt". The original
     * string will be length 1 or more.
     *
     * @param str
     * @return
     */
    public static String backAround(String str)
    {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}
