package String;

public class String_Compression {

    public static String copress(String str){
        String new_Str = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            new_Str += str.charAt(i);
            if (count > 1) {
                new_Str += count.toString();
            }
        }
        return new_Str;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(copress(str));
        
    }
}
//a3b2c3d2
//O(n)