abstract class Shape{
    void info(){
        System.out.println("This is a shape");
    }
    abstract void area();
}
class Circle extends Shape{
    void area(){
        System.out.println("Circle area calculated");
    }
}
public class abstractClass{
    public static void main(String[] args){
        Circle c=new Circle();
        c.info();
        c.area();
    }
}