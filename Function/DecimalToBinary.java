package Function;

public class DecimalToBinary {
    public static void dec_To_Bin(int n){
        int myNum = n;
        int pow = 0;
        int Bin = 0;
        while (n>0) {
            int remainder = n%2;
            Bin = Bin + remainder*(int)Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + Bin);
    }

    public static void main(String[] args) {
        dec_To_Bin(8);
    }
}
