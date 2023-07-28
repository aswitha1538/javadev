/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dev;

import java.util.Scanner;

public class ParrotTrouble
{

    public static void main(String[] args)
    {
        Scanner time = new Scanner(System.in);

        System.out.println("Please enter the hour:");
        int hour = time.nextInt();
        boolean isTalking = true;
        boolean isParrotInTrouble = parrotTrouble(isTalking, hour);
        System.out.println("Is the parrot in trouble? " + isParrotInTrouble);
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour
     * time in the range 0..23. We are in trouble if the parrot is talking and
     * the hour is before 7 or after 20. Return true if we are in trouble.
     *
     *
     * @param talking
     * @param time
     * @return
     */
    public static boolean parrotTrouble(boolean talking, int time)
    {
        return (talking && (time < 7 || time > 20));
    }
}
