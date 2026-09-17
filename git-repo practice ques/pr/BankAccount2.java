package Package2;
import Package1.BankAccount;
public class BankAccount2{
    public static void main(String[] args){
        BankAccount b=new BankAccount();
        b.deposit(500);
        b.deposit(200);
        b.showBalance();
    }
}