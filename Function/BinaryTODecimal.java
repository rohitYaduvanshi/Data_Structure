package Function;
//Decimal to Binary  >>>
public class BinaryTODecimal {
    public static void BinToDec(int bin_N){
        int Mydec = bin_N;
        int pow = 0;
        int dec = 0;
        while(bin_N>0){
            int lastDigit = bin_N%10;
            dec = dec+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            bin_N = bin_N/10;
        }
        System.out.println("decimal of " +Mydec + " = " + dec);
    }

    public static void main(String[] args) {
        BinToDec(1001);
    }
}
