package Function;
//Function_Part
public class Product {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    //Calling_Part
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        int c = multiply(a,b);
        System.out.println("a * b = "+c);

    }
}

// Ans --> a * b = 56
