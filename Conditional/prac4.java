import java.util.Scanner;
public class prac4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Print num:");
        int year = s.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0)) && (year % 400 == 0);
        
        if(x && (y||z)){
            System.out.println(year +" is a leap year");
        }else{
            System.out.println(year +" is not a leap yeaer");
        }
        s.close();
    }
}
