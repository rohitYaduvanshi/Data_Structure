package Arrays;

public class print_Subarrays {
    public static void printSub_Arrays(int num[]){
        int ts = 0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                for (int k = start; k <=end; k++) {
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();  
        }
        System.out.println("total sunarrays: "+ ts);
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSub_Arrays(number);
    }
}

// 2 
// 2 4 
// 2 4 6 
// 2 4 6 8 
// 2 4 6 8 10 

// 4 
// 4 6 
// 4 6 8 
// 4 6 8 10 

// 6 
// 6 8 
// 6 8 10 

// 8 
// 8 10 

// 10 

// total sunarrays: 15