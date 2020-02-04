/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author rusty
 */
public class Palindrome {
    
    
    private static String phrase, fixedPhrase;
    private static Scanner input = new Scanner(System.in);
    
    
    public static void fixThePhrase(){
        //remove spaces, punctuation
        //lowercase the string
        
        fixedPhrase = phrase.toLowerCase().replaceAll(" ", "").replaceAll("'", "").replaceAll("\\.", "");
 
    }
    
    public static void checkPalindrome(){
        //reverse the string
        //check to see if they are the same
        String revPhrase = "";
        for(int c=fixedPhrase.length()-1; c >= 0; c--){
            revPhrase += fixedPhrase.charAt(c);
        
        }
        //string is reverse
        if(fixedPhrase.equals(revPhrase)){
            System.out.println(phrase + " is a palindrome");
        }
        else{
            System.out.println(phrase + " is not a palindrome");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter a phrase");
        phrase = input.nextLine();
        fixThePhrase();
        checkPalindrome();
        
        
    }
    
}
