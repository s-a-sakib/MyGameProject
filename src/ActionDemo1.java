import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo1 extends JFrame {
    private Container c;
    private JTextField tf1 , tf2;
    private Font f;
    private Handler handler;
    ActionDemo1(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        handler = new Handler();

        f = new Font("Arial" , Font.ITALIC + Font.BOLD,14);

        tf1 = new JTextField("Action Demo Field 1");
        tf1.setBounds(50,50,250,50);
        tf1.setFont(f);
        tf1.setForeground(Color.BLUE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.addActionListener(handler);

        c.add(tf1);

        tf2 = new JTextField("Password");
        tf2.setBounds(50,110,250,50);
        tf2.setForeground(Color.BLUE);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.addActionListener(handler);
        c.add(tf2);

    }

    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource() == tf1){
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter some text :");
                }else {
                    JOptionPane.showMessageDialog(null, "tf1 =" + s);
                }
            }else{
                String s = tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter some text :");
                }else {
                    JOptionPane.showMessageDialog(null, "tf2 =" + s);
                }
            }

        }
    }
    public static void main(String[] args) {
        ActionDemo1 frame = new ActionDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("ActionListener Demo");
    }
}
