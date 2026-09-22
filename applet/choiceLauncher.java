import java.awt.*;
public class choiceLauncher{
    public static void main(String[] args){
        
        Frame f=new Frame("Jaat");
        choiceApplet applet=new choiceApplet();
        f.add(applet);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}