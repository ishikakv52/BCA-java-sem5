import java.util.Scanner;
public class CheckEvenOdd{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=input.nextInt();
        boolean EvenOdd=isEven(n);
        System.out.println(EvenOdd);
}

public static boolean isEven(int n){
    if(n%2==0){
           return true;
        }
        else{
            return false;
        }   
    }
}