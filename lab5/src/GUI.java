import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JPanel Panel1;
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JList list2;
    private JList list3;
    private JButton ADDNEWTASKButton;
    private JTextField textField1;
    private JButton BACKButton;
    private JButton CLOSEButton;
    private JPanel JPanel_Untitled;

    public static void main(String[] args) {
        GUI aplikacja = new GUI();
        aplikacja.setVisible(true);
    }

    public GUI (){
        super("Kanban");
        this.setContentPane(this.Panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);


        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        ADDNEWTASKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                GUI2 aplikacja2 = new GUI2();
                aplikacja2.setVisible(true);
            }
        });
    }


}
