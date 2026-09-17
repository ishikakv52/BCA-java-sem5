import java.util.Scanner;
public class AreaRect{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int l=input.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        int b=input.nextInt();
        System.out.println("Area of rectangle is : "+l*b);
    }
}