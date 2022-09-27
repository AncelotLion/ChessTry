import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JFrame implements ActionListener {
    Icon iconTura = new ImageIcon("src/whiteTura.png");
    JButton buttonTura = new JButton(iconTura);
    JButton buttonTura2 = new JButton(iconTura);

    Icon iconHorse = new ImageIcon("src/whiteHorse.png");
    JButton conHorse = new JButton(iconHorse);
    JButton conHorse2 = new JButton(iconHorse);

    Icon iconBishopWhite = new ImageIcon("src/whiteBishop.png");
    JButton bishopWhite = new JButton(iconBishopWhite);
    JButton bishopWhite2 = new JButton(iconBishopWhite);

    Icon iconQueenWhite = new ImageIcon("src/whiteQueen.png");
    JButton queenWhite = new JButton(iconQueenWhite);

    Icon iconKingWhite = new ImageIcon("src/whiteKing.png");
    JButton kingWhite = new JButton(iconKingWhite);



    public Button() {
        super("ChessLMAO");
        this.setBounds(100, 100, 612, 610);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(buttonTura);
        buttonTura.setBounds(0, 0, 75, 75);
        buttonTura.addActionListener(this);
        container.add(buttonTura2);
        buttonTura2.setBounds(520, 0, 75, 75);
        buttonTura2.addActionListener(this);


        container.add(conHorse);
        conHorse.setBounds(76, 0, 75, 75);
        conHorse.addActionListener(this);
        container.add(conHorse2);
        conHorse2.setBounds(450, 0, 75, 75);
        conHorse2.addActionListener(this);

        container.add(bishopWhite);
        bishopWhite.setBounds(150,0,75,75);
        bishopWhite.addActionListener(this);
        container.add(bishopWhite2);
        bishopWhite2.setBounds(375,0,75,75);
        bishopWhite2.addActionListener(this);

        container.add(queenWhite);
        queenWhite.setBounds(225,0,75,75);
        queenWhite.addActionListener(this);

        container.add(kingWhite);
        kingWhite.setBounds(300,0,75,75);
        kingWhite.addActionListener(this);


        }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {

        Piece piece = new Piece();
        piece.setVisible(true);

    }
}




