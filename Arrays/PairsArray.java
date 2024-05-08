package Arrays;

public class PairsArray {
    public static void printPairs(int number[]){
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j]+ ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are :" + tp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printPairs(number);
    }
}

// (2,4) (2,6) (2,8) (2,10) 
// (4,6) (4,8) (4,10) 
// (6,8) (6,10) 
// (8,10) 

