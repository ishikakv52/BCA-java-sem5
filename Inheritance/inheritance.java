//   object banake name set kar, eat() aur bark() dono call kar.

class Animal {
    String name;
    void eat(){
        System.out.println(name + "... is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(name+" says Woof!Woof!");
    }
}

public class inheritance{
    public static void main(String[] args){
        Dog d=new Dog();
        d.name="Goofy";
        d.bark();
        d.eat();
    }
}