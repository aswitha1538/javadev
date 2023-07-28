/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class Makes10 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Please enter the first integer:");
        int a = num.nextInt();
        System.out.println("Please enter the second integer:");
        int b = num.nextInt();

        boolean result = makes10(a, b);
        System.out.println("Result: " + result);
    }
/**
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 * @param a
 * @param b
 * @return 
 */
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }
}
