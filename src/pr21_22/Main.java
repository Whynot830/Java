package pr21_22;

import javax.swing.*;

public class Main {
    public static class Frame extends JFrame {
        private ICreateDocument iCreateDocument;

        Frame(ICreateDocument iCreateDocument) {
            super("App");
            this.iCreateDocument = iCreateDocument;
            JMenuBar menuBar = new JMenuBar();
            JMenu menu = new JMenu("File");
            JMenuItem newItem = new JMenuItem("New");
            JMenuItem openItem = new JMenuItem("Open");
//            JMenuItem saveItem = new JMenuItem("Save");
            JMenuItem exitItem = new JMenuItem("Exit");
            menu.add(newItem);
            menu.add(openItem);
//            menu.add(saveItem);
            menu.add(exitItem);
            menuBar.add(menu);
            setJMenuBar(menuBar);
            setSize(600,600);
            setVisible(true);
            newItem.addActionListener(e -> iCreateDocument.CreateNew());
            openItem.addActionListener(e -> iCreateDocument.CreateOpen());
            exitItem.addActionListener(e -> System.exit(0));
        }
    }
    public static void main(String[] args) {
        new Frame(new CreateTextDocument());
    }
}
