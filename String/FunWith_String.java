package String;

import java.util.Scanner;

public class FunWith_String {
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c'};
        // String str = "abcd";
        // String str2 = new String("xyz#$");

        //String are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
