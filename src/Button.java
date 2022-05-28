import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JFrame {
    JButton udaff = new JButton("Tura");// название кнопки
    JButton conHorse = new JButton("Horse");

    public Button() {
        super("Chess");
        this.setBounds(100,100,720,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(udaff);
        udaff.setBounds(0,0,75,75);

        container.add(conHorse);
        conHorse.setBounds(76, 0, 75, 75);


        udaff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

    }



    public static void main(String[] args) {
        Button app = new Button();
        app.setVisible(true);






    }
}