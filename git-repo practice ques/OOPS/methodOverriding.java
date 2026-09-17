class Employee{
    void salary(){
        System.out.println("Employee's salary is 1,25,000");
    }
}
class Manager extends Employee{
    void salary(){
        System.out.println("Manager's salary is 1,75,000");
    }
}
class Developer extends Employee{
    void salary(){
        System.out.println("Developer's salary is 2,00,000");
    }
}
public class methodOverriding{
    public static void main(String[] args){
        Employee obj1=new Manager();
        Employee obj2=new Developer();
        obj1.salary();
        obj2.salary();
    }
}