/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dev;

/**
 *
 * @author Aswitha
 */
public class EveryNth {

       public static String everyNth(String input, int N) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i += N) {
            result.append(input.charAt(i));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "MALLURU";
        int N = 4;
        String result = everyNth(input, N);
        System.out.println(result); 
    }
}
