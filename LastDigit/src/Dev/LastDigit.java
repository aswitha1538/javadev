/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dev;

/**
 *
 * @author Aswitha
 */
public class LastDigit {
    public static boolean haveSameLastDigit(int num1, int num2) {
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        return lastDigit1 == lastDigit2;
    }

    public static void main(String[] args) {
        int num1 = 27;
        int num2 = 57;
        boolean result = haveSameLastDigit(num1, num2);
        System.out.println(result);
    }
}
