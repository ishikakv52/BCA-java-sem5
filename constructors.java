class Car{
    String brand;
    int speed;

    Car(String b,int s){
        brand=b;
        speed=s;
    }
    void display(){
        System.out.println(brand + " brand's car speed limit is "+speed+" km/h");
    }
}
public class constructors{
    public static void main(String[] args){
        Car c1=new Car("BMW",307);
        c1.display();
        Car c2=new Car("Mercedes",250);
        c2.display();
    }
}