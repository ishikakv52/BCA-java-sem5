import java.awt.*;
public class LauncherList{
    public static void main(String[] args){
        Frame f=new Frame("window");
        appletList applet=new appletList();
        f.add(applet);
        f.setSize(300,300);
        f.setVisible(true);
    }
}