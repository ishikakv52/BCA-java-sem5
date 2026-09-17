class Parent {
    void p(){
        System.out.println("Parent's Trait");
    }
}
class Daughter extends Parent{
    void d(){
        System.out.println("Daughter's Trait");
    }
}
class Son extends Parent{
    void s(){
        System.out.println("Son's Trait");
    }
}

public class hierarchical{
    public static void main(String[] args){
        Daughter d=new Daughter();
        Son s=new Son();
        d.p();
        d.d();
        s.p();
        s.s();
    }
}