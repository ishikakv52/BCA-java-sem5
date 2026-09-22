// Alternate Question (practice)

// Abstract class Employee bana:

// private String name;, private double baseSalary;
// Constructor jo this.name aur this.baseSalary set kare
// getName() aur getSalary() methods
// Abstract method calculateBonus()

// Do classes bana jo extend karein:

// Manager → calculateBonus() me "Manager bonus: $500" print kare
// Developer → calculateBonus() me "Developer bonus: $300" print kare

// main me:

// java
// Employee e1 = new Manager("Raj", 50000);
// Employee e2 = new Developer("Priya", 40000);

// Dono ka naam, salary print kar, phir calculateBonus() call kar dono ke liye.

abstract class Employee{
    private String name;
    private double baseSalary;
    Employee(String name,double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public void getName(){
        System.out.println("Name : "+name);
    }
    public void getSalary(){
        System.out.println("Salary : "+baseSalary);
    }
    abstract void calculateBonus();
}
class Manager extends Employee{
    Manager(String name,double baseSalary){
        super(name,baseSalary);
    }
    public void calculateBonus(){
        System.out.println("Manager bonus: $500");
    }
}
class Developer extends Employee{
    Developer(String name,double baseSalary){
        super(name,baseSalary);
    }
    public void calculateBonus(){
        System.out.println("Developer bonus: $300");
    }
}
public class bunch{
    public static void main(String[] args){
        Employee e1 = new Manager("Raj", 50000);
        Employee e2 = new Developer("Priya", 40000);
        e1.getName();
        e1.getSalary();
        e1.calculateBonus();
        e2.getName();
        e2.getSalary();
        e2.calculateBonus();
    }
}