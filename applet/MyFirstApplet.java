import java.awt.*;

public class MyFirstApplet extends Panel {
    public MyFirstApplet() {
        setLayout(new GridLayout(4, 1));
        add(new Label("Hello"));
        add(new TextField(15));
CheckboxGroup g = new CheckboxGroup();
add(new Checkbox("Male", g, false));
add(new Checkbox("Female", g, false));
        add(new Button("Click Me"));
        Choice course = new Choice();
course.add("BCA");
course.add("BBA");
course.add("MCA");
add(course);
    }
}