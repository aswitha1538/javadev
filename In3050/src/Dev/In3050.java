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
public class In3050
{

    public static boolean areBothInRange(int a, int b)
    {
        boolean range1 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean range2 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        return range1 || range2;
    }

    /**
     * Given 2 int values, return true if they are both in the range 30..40
     * inclusive, or they are both in the range 40..50 inclusive.
     *
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int value1 = 35;
        int value2 = 40;
        boolean result = areBothInRange(value1, value2);
        System.out.println("Both values are in the required range: " + result);
    }
}
