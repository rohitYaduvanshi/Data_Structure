package Function.Some_Practice;

public class Even_Odd {
    public static boolean Even__Odd(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Even__Odd(8));
        System.out.println(Even__Odd(3));
        System.out.println(Even__Odd(7));
    }
}
