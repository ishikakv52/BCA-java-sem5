import java.awt.*;
public class TextAreaA extends Panel{
    public  TextAreaA(){
        setLayout(new GridLayout(2,1));
        add(new Label("Address:"));
        add(new TextArea(3,15));
    }
}