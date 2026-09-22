import java.awt.*;

public class MyFirstLauncher {
    public static void main(String[] args) {
        Frame f = new Frame("My Window");
        
        MyFirstApplet applet = new MyFirstApplet();
        f.add(applet);
        
        f.setSize(300, 200);
        f.setVisible(true);
        
    }
}