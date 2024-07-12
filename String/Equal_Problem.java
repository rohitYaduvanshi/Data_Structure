package String;

public class Equal_Problem {
    public static void main(String[] args) {
        String s1 = "Rohit";
        String s2 = "Rohit";
        String s3 = new String("Rohit");

        if (s1 == s2) {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }

        // Its wrong way to find equality in string if declare using "New"
        if (s1 == s3) {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }

        //Correct way
        if (s1.equals(s3)) {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }

    }
}

// Strings are Equal
// Strings are not Equal
// Strings are Equal
