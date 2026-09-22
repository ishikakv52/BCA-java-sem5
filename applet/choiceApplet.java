import java.awt.*;
public class choiceApplet extends Panel{
    public choiceApplet(){
        setLayout(new GridLayout(2, 1));
        add(new Label("Course:"));
        Choice c=new Choice();
        add(c); 
        c.add("BCA");
        c.add("BTech");
        c.add("BBA");
        c.add("MCA");
    }
}