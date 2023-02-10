import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private Container c;
    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton , clearButton;
    private Font f;


    LoginFrame(){
        initComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 400);
        this.setTitle("Login Frame Demo");
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        f = new Font("Arial" , Font.BOLD + Font.ITALIC , 18);

        userLabel = new JLabel("Username  : ");
        userLabel.setBounds(50,50,150,50);
        userLabel.setFont(f);
        c.add(userLabel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(180,50,200,50);
        c.add(tf);

        passLabel = new JLabel("Password  : ");
        passLabel.setBounds(50,120,150,50);
        passLabel.setFont(f);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setBounds(180,120,200,50);
        pf.setEchoChar('X');
        pf.setFont(f);
        c.add(pf);

        loginButton = new JButton("Login");
        loginButton.setBounds(180,190,90,50);
        loginButton.setFont(f);
        c.add(loginButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(280,190,90,50);
        clearButton.setFont(f);
        c.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tf.setText("");
                pf.setText("");
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String userName = tf.getText();
                String password = pf.getText();

                if(userName.equals("sakib") && password.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "You are successfully logined");
                    dispose();
                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"give proper username and password");
                    tf.setText("");
                    pf.setText("");
                }
            }
        });
    }
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
    }
}
