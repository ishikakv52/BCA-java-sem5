class Shape{
    int area(int side){
        return side*side;
    }
    int area(int length,int breadth){
        return length*breadth;
    }
    double area(double radius){
        return 3.14*radius*radius;
    }
}
public class ShapePolymorphism{
    public static void main(String[] args){
        Shape obj=new Shape();
        System.out.println(obj.area(5));
        System.out.println(obj.area(15,10));
        System.out.println(obj.area(2));
    }
}