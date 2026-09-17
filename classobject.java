class Car{
    String brand;
    int speed;
    void display(){
        System.out.println(brand + " brand's car speed limit is "+speed+" km/h");
    }
}

public class classobject{
    public static void main(String[] args){
        Car c1=new Car();
        c1.brand="Mercedes";
        c1.speed=280;
        c1.display();

        Car c2= new Car();
        c2.brand="BMW";
        c2.speed=305;
        c2.display();
    }
}