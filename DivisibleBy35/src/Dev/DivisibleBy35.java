/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

/**
 *
 * @author aswit
 */
import java.util.Scanner;

public class DivisibleBy35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a non-negative number:");
        int n = input.nextInt();

        boolean result = or35(n);
        System.out.println("Result: " + result);
    }

    public static boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
