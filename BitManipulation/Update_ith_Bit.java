package BitManipulation;

public class Update_ith_Bit {
    public static int clear_Ithposition(int n, int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }
    // public static int Set_Ithposition(int n, int i){
    //     int BitMask = 1<<i;
    //     return n | BitMask;
    // }
    public static int Update_Ithposition(int n, int i, int newBit){
        n = clear_Ithposition(n, i);
        int BitMask = (newBit<<i);
        return n | BitMask;
    }

    public static void main(String[] args) {
        System.out.println(Update_Ithposition(10,2,1)); //14
    }
}
