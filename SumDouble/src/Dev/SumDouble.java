package Dev;

import java.util.Scanner;

public class SumDouble
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first integer value : ");
        int a = scanner.nextInt();
        System.out.print("Please enter second integer value: ");
        int b = scanner.nextInt();
        SumDouble objSumDouble = new SumDouble();
        int result = objSumDouble.sumDouble(a, b);

        System.out.println("Sum: " + result);
    }

    /**
     * Given two int values, return their sum. Unless the two values are the
     * same, then return double their sum
     *
     * @param a: First int parameter
     * @param b: Second int parameter
     * @return sum
     */
    public int sumDouble(int a, int b)
    {
        int sum = a + b;

        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }
}
