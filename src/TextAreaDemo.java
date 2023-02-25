import javax.swing.*;

import java.awt.*;

import static java.awt.Color.RED;

public class TextAreaDemo extends JFrame {
    private Container c;
    private JTextArea ta;
    private JScrollPane scroll;
    private Font f;
    TextAreaDemo(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial", Font.BOLD + Font.BOLD , 18);

        ta = new JTextArea();
        //ta.setBounds(50,50,300,200);
        //ta.setBackground(Color.yellow);
        ta.setForeground(Color.black);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);

        //c.add(ta);

        scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(50,50,300,200);
        c.add(scroll);

    }
    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setBackground(RED);
        frame.setBounds(500,500,500,500);
        frame.setTitle("TextAreaDemo");
    }
}
