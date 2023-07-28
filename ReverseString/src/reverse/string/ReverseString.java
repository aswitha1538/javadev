/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.string;

import java.util.*;
import java.lang.StringBuilder;


/**
 *
 * @author aswit
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a sentence: ");
            String inputSentence = input.nextLine();
            String reverseSentence = reverseWords(inputSentence);
            System.out.println("Reversed Words: \"" + reverseSentence + "\"");
        }
    }   

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i=0;i<words.length;i++){
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();

            reversedSentence.append(reversedWord);
            if (i != words.length-1)
               reversedSentence.append(" ");
        }
        return reversedSentence.toString();
    }
}
