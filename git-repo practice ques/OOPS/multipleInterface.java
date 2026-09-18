interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck2 implements Flyable,Swimmable{
    public void fly(){
        System.out.println("Ducks can fly");
    }
    public void swim(){
    System.out.println("Ducks can swim"); 
    }
    public void sleep(){
        System.out.println("Ducks can sleep");
    }
}
public class multipleInterface{
    public static void main(String[] args){
        Duck2 d=new Duck2();
        d.fly();
        d.swim();
        d.sleep();
    }
}