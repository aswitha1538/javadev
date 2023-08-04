/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dev;

/**
 *
 * @author Aswitha
 */
public class Max1020 {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 19;
        int result = getLargerInRange(num1, num2);
        System.out.println("The larger value in the range 10..20 is: " + result);
    }

    /**
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range.
     *
     * @param a
     * @param b
     * @return
     */
    public static int getLargerInRange(int a, int b) {
        boolean aInRange = a >= 10 && a <= 20;
        boolean bInRange = b >= 10 && b <= 20;

        if (!aInRange && !bInRange) {
            return 0;
        }

        if (aInRange && !bInRange) {
            return a;
        } else if (!aInRange && bInRange) {
            return b;
        }

        return Math.max(a, b);
    }
}
