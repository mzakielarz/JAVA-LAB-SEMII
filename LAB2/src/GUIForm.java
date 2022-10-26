import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUIForm extends JFrame {

    private JTextField txtLogin;
    private JPasswordField txtPassword;
    private JButton button1;
    private JPanel JPanel1;
    private JLabel LabelText;

    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
        Example1.setVisible(true); // wyswietlenie ramki
    }


    public GUIForm() { // dziedziczenie po JFrame
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.JPanel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.pack();//rozmiar dostosowany do umieszczonych komponentów

        txtLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelText.setText("username: "+txtLogin.getText()+" "+ "password: "+txtPassword.getText());
                new String(txtPassword.getPassword());
            }
        });
    }


















}

