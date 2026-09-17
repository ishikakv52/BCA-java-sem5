import java.util.Vector;
public class vector2{
    public static void main(String[] args){
        Vector<String> v=new Vector<>(3);
        v.add("Black");
        v.add("White");

        System.out.println(v.size());
    }
}