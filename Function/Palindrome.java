
package Function;
import java.util.Scanner;

// A palindrome is a word, phrase, number, or other sequence of characters 
// that reads the same forward and backward (ignoring spaces, punctuation, and
//  capitalization). Examples include "racecar" and "madam."
public class Palindrome {
    public static boolean Palin_Check(int x){
        int temp = x;
        int rev = 0;
        int rem;
        while(x>0){
            rem = x%10;
            rev = (rev*10)+rem;
            x = x/10;
        }
        if(rev == temp){
            return true;
        }
    return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner s = new Scanner(System.in);
        int palin = s.nextInt();

        if(Palin_Check(palin)){
            System.out.println("Number : " + palin + " is a palindrome");
        }
        else{
            System.out.println("Number : " + palin + " is not a palindrome");
        }
    }
}
