class Vehicle{
    Vehicle(){
        System.out.println("Vehicle created");
    }
    Vehicle(String brand){
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle{
    Car(String brand,int speed){
        super(brand);
        System.out.println("Speed: " + speed);
    }
}
public class superDemo{
    public static void main(String[] args){
        Car c=new Car("Toyota",180);

    }
}