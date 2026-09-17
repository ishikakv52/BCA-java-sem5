import java.util.Scanner;
public class SI{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value of P : ");
        float p=input.nextFloat();
        System.out.print("Enter value of R : ");
        float r=input.nextFloat();
        System.out.print("Enter value of T : ");
        float t=input.nextFloat();
        float si=(p*r*t)/100;
        System.out.print("SI : "+si);
    }
}