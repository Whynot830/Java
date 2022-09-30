package pr9;

import pr9.db.db;
import pr9.ui.UI;

import javax.swing.*;

public class Test extends JFrame {
    public Test() {
        super("Practice №9");
        setLayout(null);
        setSize(500,400);
        new UI(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new db();
        new Test();
    }
}
