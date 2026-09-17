class Calculator{
    static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    void subtract(int a, int b){
        int c=a-b;
        System.out.println(c);
    }
}
public class Second{
    public static void main(String[] args){
        Calculator.add(5,3);
        Calculator c=new Calculator();
        c.subtract(10,4);
        c.add(5,3);
    }
}
