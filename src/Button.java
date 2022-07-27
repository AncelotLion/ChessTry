import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JFrame implements ActionListener {
    Icon iconTura = new ImageIcon("src/tura.png");
    JButton buttonTura = new JButton(iconTura);

    Icon iconHorse = new ImageIcon("src/horse.png");
    JButton conHorse = new JButton(iconHorse);


    public Button() {
        super("ChessLMAO");
        this.setBounds(100, 100, 610, 610);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(buttonTura);
        buttonTura.setBounds(0, 0, 75, 75);
        buttonTura.addActionListener(this);

        container.add(conHorse);
        conHorse.setBounds(76, 0, 75, 75);
        conHorse.addActionListener(this);

        }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {
        Button app = new Button();
        app.setVisible(true);

        Piece piece = new Piece();
        piece.setVisible(true);

    }
}




