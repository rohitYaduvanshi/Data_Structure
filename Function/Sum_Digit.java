package Function;

public class Sum_Digit {
    public static int sumDigits(int x){
        int sum = 0;
        while(x>0){
            int lastDigit = x%10;
            sum = sum+lastDigit;
            x = x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(55));
    }
}
