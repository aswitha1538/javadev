/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class Nearhundred {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = num.nextInt();

        boolean result = nearHundred(n);
        System.out.println("Result = " + result);
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}