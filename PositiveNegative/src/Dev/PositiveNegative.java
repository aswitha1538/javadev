/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 1st number:");
        int a = input.nextInt();
        System.out.println("Please enter 2nd number:"); 
        int b = input.nextInt();

        boolean result = posNeg(a, b); 
        System.out.println("Result = " + result);
    }
/**
 * Given 2 int values, return true if one is negative and one is positive. 
 * Except if the parameter "negative" is true, then return true only if both are negative.
 * @param a
 * @param b
 * @return 
 */
    public static boolean posNeg(int a, int b) { 
        if (a < 0 && b < 0) {
            return true; // Both numbers are negative
        } else if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return true; // One number is negative and the other is positive
        } else {
            return false; // Both numbers are positive
        }
    }
}
