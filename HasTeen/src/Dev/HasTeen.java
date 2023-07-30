/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class HasTeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first integer:");
        int a = input.nextInt();
        System.out.println("Please enter second integer:");
        int b = input.nextInt();
        System.out.println("Please enter third integer:");
        int c = input.nextInt();

        boolean result = hasTeen(a, b, c);
        System.out.println("Result: " + result);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
               (b >= 13 && b <= 19) ||
               (c >= 13 && c <= 19);
    }
}
