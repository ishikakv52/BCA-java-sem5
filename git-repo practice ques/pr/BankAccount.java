package Package1;
public class BankAccount{
    private double balance;
    public void deposit(double amount){
        balance=balance + amount;
    }
    public void showBalance(){
        System.out.println("Balance : "+balance);
    }
}