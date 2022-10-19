import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUIForm extends JFrame {

    private JPanel JPanel1;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JButton sumaButton;
    private JButton różnicaButton;
    private JButton wyjścieButton;
    private JLabel LabelWynik;
    private JButton okButton;
    private JButton closeButton;
    private JLabel labelDate;

    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
        Example1.setVisible(true); // wyswietlenie ramki
    }

    public GUIForm() { // dziedziczenie po JFrame
        ///1 sposób
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.JPanel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.pack();//rozmiar dostosowany do umieszczonych komponentów
       /* //2 sposób
        JFrame frame = new JFrame("Moja pierwsza aplikacja");
        frame.setContentPane(this.JPanel1);// wyswietlanie okienka na ekranie
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // wyswietlanie ramki*/


        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double LiczbaA = Double.parseDouble(textFieldA.getText());
                double LiczbaB = Double.parseDouble(textFieldB.getText());
                double wynik = LiczbaA + LiczbaB;
                LabelWynik.setText("Suma" + LiczbaA + "oraz" + LiczbaB + " wynosi: " + wynik);
            }
        });
        różnicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double LiczbaA = Double.parseDouble(textFieldA.getText());
                double LiczbaB = Double.parseDouble(textFieldB.getText());
                double wynik = LiczbaA - LiczbaB;
                LabelWynik.setText("Suma " + LiczbaA + "oraz " + LiczbaB + " wynosi: " + wynik);
            }
        });
        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}
