import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForm extends JFrame {
    private JPanel JPanel1;
    private JComboBox comboBox1;
    private JLabel label1;
    private JPanel JPanel2;
    private JList list2;
    private JTable table1;

    public static void main(String[] args) {
        GUIForm testExample = new GUIForm();
        testExample.setVisible(true);
    }

    public GUIForm(){
    super("APP");
    this.setContentPane(this.JPanel1);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(700,500);


// sposób umieszczenia elementów
        createItemCombobox();
        createTable();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "wybrano " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                label1.setText(data);
            }
        });
    }
    private void createItemCombobox(){
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"", "ala","ma","kota"}));
    }

    private void createTable(){
        Object[][] data = {
                {"film 1",2022,9.32,234522} ,
                {"film 2",2021,5.18,21345} ,
                {"film 3",2019,4.13,11234} ,
                {"film 4",2015,8.75,1232334} ,
                {"film 5",2020,8.75,1232334} ,

        };
        table1.setModel(new DefaultTableModel(
                data, new String[] {"tytuł", "rok", "ocena", "ilość opinii"}
        ));
    }







}
