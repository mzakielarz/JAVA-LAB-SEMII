import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm extends JFrame {

    private JPanel JPanel1;
    private JTextField tbLogin;
    private JPasswordField tbHaslo;
    private JButton btnOK;
    private JLabel loginLabel;
    private JLabel hasloLabel;
     static String ologin = "login";
     static String ohaslo = "haslo";

    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
        Example1.setVisible(true);
    }


    public GUIForm() {
        super("Logowanie");
        this.setContentPane(this.JPanel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.pack();
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = tbLogin.getText();
                String haslo =  new String(tbHaslo.getPassword());
                // sprawdzenie danych
                loginLabel.setText(login);
                hasloLabel.setText(haslo);

                if (login.equals(ologin)&& haslo.equals(ohaslo))
                    JOptionPane.showMessageDialog(GUIForm.this, "Udało się zalogować");
                 else if (login.equals("login") && !haslo.equals(ohaslo))
                    JOptionPane.showMessageDialog(GUIForm.this, "Złe hasło");
                else if (!login.equals("login") && haslo.equals(ohaslo))
                    JOptionPane.showMessageDialog(GUIForm.this, "Zły login");
            }
        });
    }

    private void createUIComponents() {

    }
}
