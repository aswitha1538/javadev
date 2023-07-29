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

public class NotString
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = input.nextLine();
        String result = addNotToFront(inputString);
        System.out.println("Result: " + result);
    }

    /**
     * Given a string, return a new string where "not " has been added to the
     * front. However, if the string already begins with "not", return the
     * string unchanged. Note: use .equals() to compare 2 strings
     *
     * @param input
     * @return
     */
    public static String addNotToFront(String input)
    {
        if (input.equals("not") || input.startsWith("not ")) {
            return input;
        } else {
            return "not " + input;
        }
    }
}
