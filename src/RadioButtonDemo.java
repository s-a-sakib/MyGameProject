import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {
    private Container c;
    private JRadioButton male , female;
    private Cursor cursor;
    private ButtonGroup buttonGroup;
    RadioButtonDemo(){
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        cursor = new Cursor(Cursor.HAND_CURSOR);
        buttonGroup = new ButtonGroup();

        male = new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setCursor(cursor);
        male.setBackground(Color.ORANGE);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setCursor(cursor);
        female.setBackground(Color.ORANGE);
        c.add(female);

        buttonGroup.add(male);
        buttonGroup.add(female);
    }
    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setBounds(30,20,360,700);
        frame.setTitle("Multiplication Table");
    }
}
