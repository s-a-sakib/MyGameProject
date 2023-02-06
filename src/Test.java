import javax.swing.*;
import java.awt.*;

public class  Test extends JFrame {
    Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.RED);
        setBounds(500, 500, 500, 500);
        setTitle("Java Game");
    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
    }
}
