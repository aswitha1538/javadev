/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class IcyHot
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first temperature:");
        int a = input.nextInt();
        System.out.println("Please enter second temperature:");
        int b = input.nextInt();

        boolean result = icyHot(a, b);
        System.out.println("Result: " + result);
    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other
     * is greater than 100.
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean icyHot(int a, int b)
    {
        if ((a < 0 && b > 100) || (a > 0 && b < 100)) {
            return true;
        } else {
            return false;
        }
    }
}
