import java.util.Vector;

public class vector{
    public static void main(String[] args){
        Vector<String> subjects=new Vector <>();
        subjects.add("Hindi");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Chemistry");
        System.out.println(subjects);
        System.out.println(subjects.get(0));
        System.out.println(subjects.size());
        System.out.println(subjects.remove(0));
        System.out.println(subjects);        
    }
}