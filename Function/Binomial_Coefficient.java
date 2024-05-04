package Function;


//nCr = n!/r!(n-r)!
public class Binomial_Coefficient {
    public static int nFact(int n){
       int n_fact = 1;
       for (int i =1; i <= n; i++) {
        n_fact = n_fact*i;
       } 
       return n_fact;
    }
    public static int Bio_Coeff(int n, int r){
        int fact_n = nFact(n);
        int fact_r = nFact(r);
        int fact_nmr = nFact(n-r);

        int Bio_Coeff = fact_n / (fact_r * fact_nmr);
        return Bio_Coeff; 
    }
    public static void main(String[] args) {
        int a = Bio_Coeff(5,2);
        System.out.println(a);
    }
}
