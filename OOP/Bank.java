public class Bank {
    BankAccount myAcc = new BankAccount();

    //Constructor
    public Bank(){
        myAcc.username = "Rohit";
        myAcc.setPassword("rohit@67");
        
    }
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("username = " + bank.myAcc.username);
        //Note:  Password is Private, Hence can't be accessed directly
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}