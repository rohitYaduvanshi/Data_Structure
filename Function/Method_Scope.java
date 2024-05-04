package Function;

public class Method_Scope {
    // public static void sum(int n){
    //     int s = a+b;
    // }

    // public static void main(String[] args) {
    //     System.out.println(s);
    // }   ERROR PART , We can't use "s" like this 


    public class Main {
        public static void main(String[] args) {
      
          // Code here CANNOT use x
      
          int x = 100;
      
          // Code here can use x
          System.out.println(x);
        }
      }
}

