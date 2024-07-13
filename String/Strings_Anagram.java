package String;

import java.util.Arrays;

public class Strings_Anagram {
    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        // If lengths are not the same, they cannot be anagrams
        if (n1 != n2) {
            return false;
        }

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        char str1[] = { 'g', 'r', 'a', 'm' };
        char str2[] = { 'a', 'r', 'm', 'g' };

        // Function Call
        if (areAnagram(str1, str2)) {
            System.out.println("The two strings are anagram of each other");
        } else {
            System.out.println("The two strings are not anagram of each other");
        }
    }
}
