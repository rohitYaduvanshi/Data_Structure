package BitManipulation;

public class Set_ith {
    public static int Set_Ithposition(int n, int i){
        int BitMask = 1<<i;
        return n|BitMask;
    }
    public static void main(String[] args) {
        System.out.println(Set_Ithposition(10, 2));  //14
    }
}
