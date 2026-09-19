class Student {
    private int marks;
    Student(int m){
        if(0< m ){
            if(m <100){
            marks=m;

            }
        }
        else{
            marks=0;
        }
    }
    public void getMarks(){
        System.out.println("Total marks : "+marks);
    }
    public void updateMarks(int newMarks){
        if (0<newMarks){
            if (newMarks<100){
        marks=newMarks;
            }
        }
    }
}
public class encapsulation{
    public static void main(String[] args){
        Student s=new Student(85);
        s.getMarks();
        s.updateMarks(150);
        s.getMarks();
    }
}