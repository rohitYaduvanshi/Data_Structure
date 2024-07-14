package BitManipulation;

public class Clear_ith {
    public static int clear_Ithposition(int n, int i){
        int BitMask = 1<<i;
        int b = ~BitMask;
        return n&b;
    }
    public static void main(String[] args) {
        System.out.println(clear_Ithposition(10, 1));
    }
}
