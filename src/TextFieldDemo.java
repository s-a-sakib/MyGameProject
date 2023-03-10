import javax.swing.*;
import java.awt.*;

public class TextFieldDemo extends JFrame{
    private Container c;
    private JTextField tf1 , tf2;
    private Font f;
    TextFieldDemo(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial" , Font.ITALIC + Font.BOLD,14);

        tf1 = new JTextField("Name");
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f);
        tf1.setBackground(Color.LIGHT_GRAY);
        tf1.setForeground(Color.BLACK);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);

        tf2 = new JTextField("Password");
        tf2.setBounds(50,110,200,50);
        tf2.setForeground(Color.BLUE);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);


    }
    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
    }
}
