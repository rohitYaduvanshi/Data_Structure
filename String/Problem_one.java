package String;

import java.util.Scanner;

public class Problem_one {
    //Helper method to check if a character is a vowel
    public static boolean isVowel(char ch){
        return ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Step 1: Input the String
       System.out.print("Enter a string: ");
       String input = sc.nextLine();

       // Step 2: Initialize the counter
       int vowelCount = 0;

       //Step 1: Iterate through the string and count vowwels
       for (int i = 0; i < input.length(); i++) {
           char ch = input.charAt(i);
           if(isVowel(ch)){
            vowelCount++;
           }
       }
       //Step 4: Output the result
       System.out.println("Niumber of lowwercase vowels: "+ vowelCount);
       sc.close();
    }
}
