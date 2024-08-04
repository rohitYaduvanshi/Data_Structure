package Sorting;

public class Reverse {
    public static void main(String[] args) {
        String originalStr = "Kedans Algorithm";
        String reversedStr = "";
        
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        
        System.out.println("Reversed string: " + reversedStr);
    }
}
