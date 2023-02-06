import javax.swing.*;
import java.awt.*;

public class LabelDemo extends JFrame {
    private Container c;
    private JLabel userLabel;
    private JLabel passLabel;
    private Font f;
    LabelDemo(){
        initComponent();
    }
    private void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial",Font.ITALIC,14);

        userLabel = new JLabel();
        userLabel.setText("Enter your user name: ");
        userLabel.setBounds(50,20,150,50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.RED);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.blue);
        userLabel.setToolTipText("Your name in English.");
        c.add(userLabel);

        String s = userLabel.getToolTipText();
        System.out.println("  "+ s);

        passLabel = new JLabel("Enter your password : ");
        passLabel.setBounds(50,50,150,50);
        passLabel.setFont(f);
        c.add(passLabel);
    }
    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Label Demo");
    }
}
