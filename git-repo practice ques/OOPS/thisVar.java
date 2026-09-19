// Person class bana jisme name variable ho, constructor ka parameter bhi 
// name naam ka ho, aur this.name = name; use karke set kar.

class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name : "+name);
    }
}
public class thisVar{
    public static void main(String[] args){
        Person p=new Person("Jaat");
        p.display();
    }
}