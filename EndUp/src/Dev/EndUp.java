/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dev;

/**
 *
 * @author Aswitha
 */
public class EndUp {
    public static String uppercaseLastThree(String input) {
        int length = input.length();
        if (length <= 3) {
            return input.toUpperCase();
        } else {
            String prefix = input.substring(0, length - 3);
            String lastThree = input.substring(length - 3).toUpperCase();
            return prefix + lastThree;
        }
    }

    public static void main(String[] args) {
        String input = "example";
        String result = uppercaseLastThree(input);
        System.out.println(result);
    }
}
