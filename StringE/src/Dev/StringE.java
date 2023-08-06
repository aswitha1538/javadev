/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dev;

/**
 *
 * @author Aswitha
 */
public class StringE {
    public static boolean containsBetween1And3Es(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'e' || c == 'E') {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return count >= 1;
    }
/**Return true if the given string contains between 1 and 3 'e' chars.
 * 
 * @param args 
 */
    public static void main(String[] args) {
        String testString = "aswi";
        boolean result = containsBetween1And3Es(testString);
        System.out.println(result);
    }
}
