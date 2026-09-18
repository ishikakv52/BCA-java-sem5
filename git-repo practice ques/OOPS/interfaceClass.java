interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car started with key");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike started with kick");
    }
}
public class interfaceClass{
    public static void main(String[] args){
        Car c=new Car();
        Bike b=new Bike();
        c.start();
        b.start();
    }
}