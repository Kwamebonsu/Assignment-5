/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Player 1. Please enter a word");
        String word = input.nextLine();

        int length = word.length();
        System.out.println("Player 2. Please enter a letter.");
            String guess = input.nextLine();
            char letter = guess.charAt(0);
        for (int i = 0; i < length; i++) {
            char character = word.charAt(i);

            if (letter == character) {
                System.out.println("This letter is in position " + i + " of the word!");
                String output = word.substring(i, i);
            }
            }
        }
        
    }
