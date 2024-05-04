package Function.Some_Practice;
//Write a Java method to compute the averageof three numbers.
public class Average {
    public static int sum(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        int b = sum(2, 4, 9);
        System.out.println(b);
    }
}
