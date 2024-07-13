package String;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        for (char ch = 'a'; ch<='z'; ch++) {
            s.append(ch);
        }
        System.out.println(s);
        System.out.println(s.length());
    }  
    //abcdefghijklmnopqrstuvwxyz
}
