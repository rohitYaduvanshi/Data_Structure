package String;

import java.util.Scanner;

public class StringTest {

    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Demonstrating string input and output

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("You entered: " + name);  //PRinting Word as Sentence too
        System.out.println(name.length()); //Word Counting 
//Concatenation
        String first_name = "Rohit";
        String last_name = "Kumar";

        String Full_name = first_name+ " " +last_name;
        System.out.println(Full_name);

     printLetters(Full_name);   
        sc.close();
    }
}

// Result
// Enter the name: Rohit
// You entered: Rohit
// 5
// Rohit Kumar
// R o h i t   K u m a r 