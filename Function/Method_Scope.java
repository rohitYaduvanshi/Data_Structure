package Function;

public class Method_Scope {
    public static void main(String[] args) {
        // Inner class example
        class InnerClass {
            public void display() {
                int x = 100;
                System.out.println("Value of x: " + x);
            }
        }

        InnerClass inner = new InnerClass();
        inner.display();

        // Scope demonstration
        // Uncommenting the below lines will cause an error because 's' is not in the scope
        // public static void sum(int n){
        //     int s = a + b;
        // }
        // public static void main(String[] args) {
        //     System.out.println(s);
        // }

        // 'x' is in the scope only within display method
    }
}
