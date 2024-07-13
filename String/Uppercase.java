package String;

public class Uppercase {
    public static String toUpperCase(String str){
        StringBuilder s = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        s.append(ch);

        for (int j = 1; j <str.length(); j++) {
            if (str.charAt(j) == ' ' && j<str.length()-1) {
                s.append(str.charAt(j));
                j++;
                s.append(Character.toUpperCase(str.charAt(j)));
            } else{
                s.append(str.charAt(j));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str = "hi, this is rohit kumar";
        System.out.println(toUpperCase(str));

    }
}
//Hi, This Is Rohit Kumar