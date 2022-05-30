import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JFrame {
    Icon iconTura = new ImageIcon("src/tura.png");
    JButton buttonTura = new JButton(iconTura);
    Icon iconHorse = new ImageIcon("src/horse.png");
    JButton conHorse = new JButton(iconHorse);


    public Button() {
        super("Chess");
        this.setBounds(100,100,720,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(conHorse);
        conHorse.setBounds(76, 0, 75, 75);

        container.add(buttonTura);
        buttonTura.setBounds(0,0,75,75);



        buttonTura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

    }



    public static void main(String[] args) {
        Button app = new Button();
        app.setVisible(true);






    }
}