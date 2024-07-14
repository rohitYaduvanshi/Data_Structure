package BitManipulation;

public class Get_ith {
    public static int get_ithposition(int n, int i) {
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(get_ithposition(10, 3));
    }
}
//Ans 1