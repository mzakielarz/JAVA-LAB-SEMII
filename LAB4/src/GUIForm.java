import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIForm extends JFrame {

    public static void main(String[] args) {
        GUIForm app = new GUIForm();
        app.setVisible(true);
    }
    private JPanel JPanel1;
    private JTree tree1;
    private JTextField txtKurs;
    private JTextField txtCena;
    private JButton OPŁAĆKURSButton;
    private JButton WYJŚCIEButton;

    public GUIForm(){
        super("APP");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,300);
        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree1.getSelectionPath().getLastPathComponent();
               txtKurs.setText(root.getUserObject().toString());

                String wybor= root.getUserObject().toString();

                if (wybor == "C++") txtCena.setText("2000 zł");
               else if (wybor == "C++") txtCena.setText("20000 zł");
               else if (wybor == "C#") txtCena.setText("20200 zł");
               else if (wybor == "JAVA") txtCena.setText("2021300 zł");
               else if (wybor == "Python") txtCena.setText("2021300 zł");
               else if (wybor == "ASP.NET") txtCena.setText("2137 zł");
               else if (wybor == "Adobe Photoshop") txtCena.setText("7654 zł");
               else if (wybor == "Corel Draw") txtCena.setText("3123 zł");
               else if (wybor == "Adobe InDesign") txtCena.setText("567756 zł");
               else if (wybor == "AutoCAD ") txtCena.setText("420 zł");


            }
        });
    }

    private  void createUIComponents() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");
        //poziom1
        DefaultMutableTreeNode KProgramowanie = new DefaultMutableTreeNode("Programowanie");
        DefaultMutableTreeNode PK1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode PK2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode PK3 = new DefaultMutableTreeNode("JAVA");
        DefaultMutableTreeNode PK4 = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode PK5 = new DefaultMutableTreeNode("ASP.NET");

        KProgramowanie.add(PK1);
        KProgramowanie.add(PK2);
        KProgramowanie.add(PK3);
        KProgramowanie.add(PK4);
        KProgramowanie.add(PK5);

        //poziom2
        DefaultMutableTreeNode PGrafika = new DefaultMutableTreeNode("Grafika Komputerowa");
        DefaultMutableTreeNode PP1 = new DefaultMutableTreeNode("Adobe Photoshop");
        DefaultMutableTreeNode PP2 = new DefaultMutableTreeNode("Corel Draw");
        DefaultMutableTreeNode PP3 = new DefaultMutableTreeNode("Adobe InDesign");
        DefaultMutableTreeNode PP4 = new DefaultMutableTreeNode("AutoCAD");

        PGrafika.add(PP1);
        PGrafika.add(PP2);
        PGrafika.add(PP3);
        PGrafika.add(PP4);

        // dodanie do rootu
        root.add(KProgramowanie);
        root.add(PGrafika);
        DefaultTreeModel myModel = new DefaultTreeModel(root);

        //tree1.setModel(myModel);
        tree1 = new JTree(myModel);
    }
}
