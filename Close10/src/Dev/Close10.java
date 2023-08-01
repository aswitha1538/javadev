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
public class Close10
{

    public static int Close10(int a, int b)
    {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        } else {
            return 0;
        }
    }

    /**
     * Given 2 int values, return whichever value is nearest to the value 10, or
     * return 0 in the event of a tie. Note that Math.abs(n) returns the
     * absolute value of a number
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int value1 = 7;
        int value2 = 12;
        int result = Close10(value1, value2);
        System.out.println("The value nearest to 10 is: " + result);
    }
}
