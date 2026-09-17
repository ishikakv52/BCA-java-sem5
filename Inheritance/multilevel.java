class GrandParent{
    void gp(){
        System.out.println("Grandparent's Trait");
    }
}
class Parent extends GrandParent{
    void p(){
        System.out.println("Parent's Trait");
    }
}
class Child extends Parent{
    void c(){
        System.out.println("Child's Trait");
    }
}

public class multilevel{
    public static void main(String[] args){
        Child c=new Child();
        c.gp();
        c.p();
        c.c();
    }
}