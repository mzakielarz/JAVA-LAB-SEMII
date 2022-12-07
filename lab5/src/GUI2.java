import javax.swing.*;

public class GUI2 extends JFrame {
    private JPanel JPanel2;
    private JTextField textField1;
    private JComboBox comboBox1;

    public static void main(String[] args) {
        GUI aplikacja2 = new GUI();
        aplikacja2.setVisible(true);
    }
    public GUI2(){
        super("Kanban");
        this.setContentPane(this.JPanel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

    }

}
