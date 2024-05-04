package Function;

public class Factorial {
    public static int Fact_orial(int n){
        int fact_O = 1;
        for (int i = 1; i <=n; i++) {
            fact_O = fact_O*i;
        }
        return fact_O;
    }

    public static void main(String[] args) {
       //Fact_orial(5); 
       System.out.println(Fact_orial(7));
    }
}
