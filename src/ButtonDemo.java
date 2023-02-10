import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame {
    private Container c;
    private JButton btn1 , btn2;
    private Font f;
    private Cursor cursor1 , cursor2;
    private ImageIcon img1,img2;
    ButtonDemo(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f = new Font("Arial",Font.BOLD + Font.ITALIC , 15);
        cursor1 = new Cursor(Cursor.HAND_CURSOR);
        cursor2 = new Cursor(Cursor.HAND_CURSOR);

        img1 = new ImageIcon(getClass().getResource("loginbutton.jpeg"));
        img2 = new ImageIcon(getClass().getResource("clear.jpeg"));

        btn1 = new JButton(img1);
        btn1.setBounds(100,50,200,200);
        //btn1.setBackground(Color.PINK);
        btn1.setCursor(cursor1);
        //btn1.setForeground(Color.RED);
        btn1.setFont(f);
        c.add(btn1);

        btn2 = new JButton(img2);
        btn2.setBounds(100,300,200,0);
        //btn2.setBackground(Color.PINK);
        btn2.setCursor(cursor2);
        //btn2.setForeground(Color.RED);
        btn2.setFont(f);
        c.add(btn2);
    }
    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Button Demo Field");
    }
}