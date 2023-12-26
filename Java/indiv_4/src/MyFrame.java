import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel myPanel = new MyPanel();
        myPanel.setBackground(Color.GRAY);
        add(myPanel);
        setVisible(true);
    }
}