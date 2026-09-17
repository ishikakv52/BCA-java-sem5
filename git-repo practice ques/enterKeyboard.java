import java.util.Scanner;
public class enterKeyboard{
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=input.nextInt();
        input.nextLine();
        System.out.print("Enter your name : ");
        String name=input.nextLine();
        System.out.println("Hi "+name+", you are "+age+" years old");

    }
}