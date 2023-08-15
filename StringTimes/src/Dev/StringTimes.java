/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dev;

/**
 *
 * @author Aswitha
 */
public class StringTimes {
    public static void main(String[] args) {
        String originalString = "Malluru";
        int n = 3;
        String largerString = repeatString(originalString, n);
        System.out.println(largerString);
    }

    public static String repeatString(String str, int n) {
        if (n <= 0) {
            return ""; 
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str); 
        }
        return result.toString();
    }
}
