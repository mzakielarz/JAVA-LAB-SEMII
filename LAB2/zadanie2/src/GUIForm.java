import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUIForm extends JFrame {
    private JPanel JPanel1;
    private JRadioButton radioBtn1;
    private JRadioButton radioBtn2;
    private JRadioButton radioBtn3;
    private JButton okButton;
    private JLabel labelPokaz;
    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon iconMS = new ImageIcon(getClass().getResource("ms.png"));
    private ImageIcon iconApple = new ImageIcon(getClass().getResource("apple.jpg"));


    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }


    public static void main(String[] args) {
        GUIForm Example1 = new GUIForm();
        Example1.setVisible(true);
    }

public GUIForm(){
    super("Moja pierwsza aplikacja");
    this.setContentPane(this.JPanel1); // wyswietlanie okienka na ekranie
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.pack();

    okButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectOption="";
            if(radioBtn1.isSelected()){
                selectOption="Linux";
            }if(radioBtn2.isSelected()){
                selectOption="Windows";
            }if(radioBtn3.isSelected()){
                selectOption="Macintosh";
            }
            JOptionPane.showMessageDialog(GUIForm.this,"Wybrano system: "+selectOption);

        }
    });
    radioBtn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(radioBtn1.isSelected()){
                labelPokaz.setIcon(resize(iconLinux,120,120));
            }
        }
    });
    radioBtn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(radioBtn2.isSelected()){
                labelPokaz.setIcon(resize(iconMS,120,120));
            }
        }
    });
    radioBtn3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(radioBtn3.isSelected()){
                labelPokaz.setIcon(resize(iconApple,120,120));

            }
        }
    });
}







}
