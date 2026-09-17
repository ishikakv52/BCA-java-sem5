public class First{
    static void greet(){
        System.out.println("Hello");
    }
    void bye(){
        System.out.println("Bye");
    }
    public static void main(String[] args){
        greet();
        greet();
        greet();

        First b=new First();
        b.bye();
    }
}