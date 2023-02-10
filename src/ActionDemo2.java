import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo2 extends JFrame {
    private Container c;
    private JTextField tf;
    private JButton bt;
    ActionDemo2(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf = new JTextField();
        tf.setBounds(50,50,150,50);
        c.add(tf);

        bt = new JButton("Process");
        bt.setBounds(50,110,150,50);
        c.add(bt);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s = tf.getText();
                tf.setText("Good Morning " + s);
            }
        });
    }
    public static void main(String[] args) {
        ActionDemo2 frame = new ActionDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("JButton ActionListener Demo");
    }
}
