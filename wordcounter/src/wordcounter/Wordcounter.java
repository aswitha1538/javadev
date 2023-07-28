/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcounter;

import java.util.Scanner;

/**
 *
 * @author aswit
 */
public class Wordcounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sentence = new Scanner(System.in);
        System.out.println("Please Enter a Sentence: ");
        String input = sentence.nextLine().trim();
        int wordCount = countWords(input);
        System.out.println("Number of words in the Sentence: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;

        }
        String[] words = sentence.split("\\s+");
        return words.length;

    }

}
