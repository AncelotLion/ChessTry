import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JFrame implements ActionListener {
    Icon iconTura = new ImageIcon("src/tura.png");
    JButton buttonTura = new JButton(iconTura);

    Icon iconHorse = new ImageIcon("src/horse.png");
    JButton conHorse = new JButton(iconHorse);

    Icon iconPiece = new ImageIcon("src/piece.png");
    JButton piece = new JButton(iconPiece);



    public Button() {
        super("ChessLMAO");
        this.setBounds(100, 100, 720, 720);
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


        /*for (int i = 0; i < 8; i++) {
                container.add(piece);
            for (int j = 0; j < 725; j++) {
                piece.setBounds(j, 75, 75, 75);
                j += 75;
            }
                piece.addActionListener(this);
            }

        }*/

        /*container.add(piece);
        piece.setBounds(0, 75, 75, 75);
        piece.addActionListener(this);*/





    public static void main(String[] args) {
        Button app = new Button();
        app.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        }
    }


