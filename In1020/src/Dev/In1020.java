/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class In1020 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first value:");
        int a = input.nextInt();
        System.out.println("Please enter second value:");
        int b = input.nextInt();

        boolean result = in1020(a, b);
        System.out.println("Result: " + result);
    }

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
}
