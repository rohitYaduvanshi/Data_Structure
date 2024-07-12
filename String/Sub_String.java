package String;

public class Sub_String {
    public static String substring(String str, int start, int end){
        String substr = "";
        for (int i = start; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //subString
        String str = "Helloworld";
        System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(2,5)); //Inbuilt Function
    }
}
