import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIForm extends JFrame {

    private JPanel JPanel1;
    private JList list1;
    private JLabel lblName;
    private JTextField textFieldName;
    private JTextField textFieldDateOfBirth;
    private JTextField textFieldMail;
    private JTextField textFieldPhone;
    private JTextField textFieldAddress;
    private JButton btnSaveExisting;
    private JButton btnSaveNew;
    private JLabel lblEMail;
    private JLabel lblPhone;
    private JLabel lblAddress;
    private JLabel lblDate;
    private JLabel lblAge; /////
    private JLabel lblAge_number;
   public static ArrayList<Person> database = new ArrayList<>();
    public static DefaultListModel demoList = new DefaultListModel();



    public static void main(String[] args) {
        GUIForm aplikacja= new GUIForm();
        aplikacja.setVisible(true);
        Person p1 = new Person("Jan Kowalski","email@xd.pl","3123","Holy Street 15","21-11-1997","26");
        Person p2 = new Person("Karol Wielki","mailabcd@xd.pl","2137","Vatican  6","21-12-1985","51");
        Person p3 = new Person("Krzysztof Fraja","areskrzyh@xd.pl","4206","Red Strret 2","3-5-2009","15");
        Person p4 = new Person("Karolina Myka","karafara@xd.pl","8012","Back Row 12","1-1-1979","48");
        database.add(p1);
        database.add(p2);
        database.add(p3);
        database.add(p4);

        demoList.addElement(p1.getName());
        demoList.addElement(p2.getName());
        demoList.addElement(p3.getName());
        demoList.addElement(p4.getName());




    }

    public GUIForm(){
        super("APP");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,500);



        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = list1.getSelectedIndex();
                textFieldName.setText(database.get(index).getName());
                textFieldMail.setText(database.get(index).getEmail());
                textFieldPhone.setText(database.get(index).getPhone_number());
                textFieldAddress.setText(database.get(index).getAddress());
                textFieldDateOfBirth.setText(database.get(index).getDate_of_Birth());
                lblAge_number.setText(database.get(index).getAge());
            }
        });

        btnSaveNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Person();
                p.setName((textFieldName.getText()));
                p.setEmail((textFieldMail.getText()));
                p.setPhone_number((textFieldPhone.getText()));
                p.setAddress((textFieldAddress.getText()));
                p.setDate_of_Birth((textFieldDateOfBirth.getText()));
                database.add(p);

                textFieldName.setText("");
                textFieldMail.setText("");
                textFieldPhone.setText("");
                textFieldAddress.setText("");
                textFieldDateOfBirth.setText("");
                list1.setModel(demoList);
                demoList.addElement(p.getName());
                list1.setModel(demoList);
                btnSaveExisting.setEnabled(true);

                // sprawzam czy działa przypisanie do obiektu
                System.out.println(p.name+ " "+p.email+p.phone_number+ " "+p.address+p.getDate_of_Birth()+ " "+p.age);

            }
        });
        btnSaveExisting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list1.setModel(demoList);
            }
        });
    }


}
