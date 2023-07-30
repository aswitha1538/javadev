/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

/**
 *
 * @author aswit
 */
public class LoneTeen
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first value:");
        int a = input.nextInt();
        System.out.println("Please enter second value:");
        int b = input.nextInt();

        boolean result = loneTeen(a, b);
        System.out.println(result); // Output: true
    }

    public static boolean loneTeen(int a, int b)
    {
        boolean aIsTeen = (a >= 13 && a <= 19);
        boolean bIsTeen = (b >= 13 && b <= 19);

        return (aIsTeen && !bIsTeen) || (!aIsTeen && bIsTeen);
    }
}
