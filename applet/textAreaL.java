import java.awt.*;

public class TextAreaL{
    public static void main(String[] args){
        Frame f=new Frame("Window");
        TextAreaA applet=new TextAreaA();
        f.add(applet);
        f.setSize(300,300);
        f.setVisible(true);
    }
}