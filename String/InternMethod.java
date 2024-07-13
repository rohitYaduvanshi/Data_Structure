package String;

public class InternMethod {
    public static void main(String[] args) {
        String str = new String("Welcome to My GitHub");
        String str2 = new String("Welcome to My GitHub");
        System.out.println(str == str2);
        //false
        String str1 = new String("Welcome to MyGIt").intern();
        String str3 = new String("Welcome to MyGIt").intern();
        System.out.println(str1 == str3);  //true



        //************************************************** */
        String s1 = "Javatpoint";  
        String s2 = s1.intern();  
        String s3 = new String("Javatpoint");  
        String s4 = s3.intern();          
        System.out.println(s1==s2); // True  
        System.out.println(s1==s3); // False  
        System.out.println(s1==s4); // True       
        System.out.println(s2==s3); // False  
        System.out.println(s2==s4); // True        
        System.out.println(s3==s4); // False    


//Output
// true
// false
// true
// false
// true
// false
        
    }
}
