package Function;
//function_Overloading
public class Using_DataTypes {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(8, 9));
        System.out.println(sum(3.2f,4.8f));
    }
}
