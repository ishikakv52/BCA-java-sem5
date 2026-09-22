import java.awt.*;
public class appletList extends Panel{
    public appletList(){
        List l=new List(3,true);
        l.add("JS");
        l.add("PY");
        l.add("HTML");
        add(l);
       setLayout(new GridLayout(2, 1));
add(new Label("Address:"));
add(new TextArea(3, 15));
    }
}