/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class StartHi {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = input.nextLine();

        boolean startsWithHi = startHi(inputString);
        System.out.println("" + startsWithHi);
    }

    public static boolean startHi(String str) {
        if (str.length() < 2) return false;

        String firstTwo = str.substring(0, 2);

        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }
}
