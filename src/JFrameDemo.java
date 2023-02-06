import javax.swing.*;
import java.awt.*;

import static java.awt.Color.PINK;
import static java.awt.Color.RED;

public class JFrameDemo extends JFrame{
    private ImageIcon icon;
    private Container c;
    JFrameDemo(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setBackground(PINK);
        icon = new ImageIcon(getClass().getResource("Bonker.png"));
        this.setIconImage(icon.getImage());

    }
    public static void main(String[] args) {
        JFrameDemo frame = new JFrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setBackground(RED);
        frame.setBounds(500,500,500,500);
        frame.setTitle("Java Game");
    }
}

