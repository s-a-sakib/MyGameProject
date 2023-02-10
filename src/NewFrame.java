import javax.swing.*;
import java.awt.*;

public class NewFrame extends JFrame {
    private Container c;
    private JLabel label;
    NewFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,50,400,400);
        this.setTitle("New Frame");

        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        label = new JLabel("Welcome to the new frame");
        label.setBounds(50,50,250,50);
        c.add(label);
    }
    public static void main(String[] args) {
        NewFrame frame = new NewFrame();
        //frame.setVisible(true);
    }
}
