class Demo{
    int x;
    int y;
    Demo(){
        System.out.println("Constructor is called");
    }
    Demo(int a,int b){
       x=a;
       y=b;
    }
    public void display(){
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
    }
}

public class constructors{
    public static void main(String[] args){
        Demo d2=new Demo(10,20);
        d2.display();
        Demo d1=new Demo();
    }
}