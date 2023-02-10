import javax.swing.*;
import java.awt.*;

public class PasswordFieldDemo extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font f;
    PasswordFieldDemo(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial",Font.BOLD + Font.ITALIC , 15);


        pf = new JPasswordField();
        pf.setEchoChar('X');
        pf.setFont(f);
        pf.setForeground(Color.RED);
        pf.setBackground(Color.PINK);
        pf.setBounds(50,20,150,50);
        c.add(pf);
    }
    public static void main(String[] args) {
        PasswordFieldDemo frame = new PasswordFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Password Field Demo");
    }
}
