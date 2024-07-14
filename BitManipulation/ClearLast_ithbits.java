package BitManipulation;

public class ClearLast_ithbits {
    public static int clrLast_Ithposition(int n, int i){
        int BitMask = (~0)<<i;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clrLast_Ithposition(15, 2)); //12
    }
}
