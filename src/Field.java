import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Field extends JFrame implements ActionListener {
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

    Icon iconEmptyCell = new ImageIcon("src/emptyCell.png");
    JButton emptyCell1 = new JButton(iconEmptyCell);
    JButton emptyCell2 = new JButton(iconEmptyCell);
    JButton emptyCell3 = new JButton(iconEmptyCell);
    JButton emptyCell4 = new JButton(iconEmptyCell);
    JButton emptyCell5 = new JButton(iconEmptyCell);
    JButton emptyCell6 = new JButton(iconEmptyCell);
    JButton emptyCell7 = new JButton(iconEmptyCell);
    JButton emptyCell8 = new JButton(iconEmptyCell);

    Icon iconPieceWhite = new ImageIcon("src/pawnWhite.png");
    JButton pieceWhite1 = new JButton(iconPieceWhite);
    JButton pieceWhite2 = new JButton(iconPieceWhite);
    JButton pieceWhite3 = new JButton(iconPieceWhite);
    JButton pieceWhite4 = new JButton(iconPieceWhite);
    JButton pieceWhite5 = new JButton(iconPieceWhite);
    JButton pieceWhite6 = new JButton(iconPieceWhite);
    JButton pieceWhite7 = new JButton(iconPieceWhite);
    JButton pieceWhite8 = new JButton(iconPieceWhite);


    public Field() {
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
        bishopWhite.setBounds(150, 0, 75, 75);
        bishopWhite.addActionListener(this);
        container.add(bishopWhite2);
        bishopWhite2.setBounds(375, 0, 75, 75);
        bishopWhite2.addActionListener(this);

        container.add(queenWhite);
        queenWhite.setBounds(225, 0, 75, 75);
        queenWhite.addActionListener(this);

        container.add(kingWhite);
        kingWhite.setBounds(300, 0, 75, 75);
        kingWhite.addActionListener(this);


        container.add(pieceWhite1);
        pieceWhite1.setBounds(0, 75, 75, 75);
        pieceWhite1.addActionListener(this);

        container.add(pieceWhite2);
        pieceWhite2.setBounds(75, 75, 75, 75);
        pieceWhite2.addActionListener(this);

        container.add(pieceWhite3);
        pieceWhite3.setBounds(150, 75, 75, 75);
        pieceWhite3.addActionListener(this);

        container.add(pieceWhite4);
        pieceWhite4.setBounds(225, 75, 75, 75);
        pieceWhite4.addActionListener(this);

        container.add(pieceWhite5);
        pieceWhite5.setBounds(300, 75, 75, 75);
        pieceWhite5.addActionListener(this);

        container.add(pieceWhite6);
        pieceWhite6.setBounds(375, 75, 75, 75);
        pieceWhite6.addActionListener(this);

        container.add(pieceWhite7);
        pieceWhite7.setBounds(450, 75, 75, 75);
        pieceWhite7.addActionListener(this);

        container.add(pieceWhite8);
        pieceWhite8.setBounds(520, 75, 75, 75);
        pieceWhite8.addActionListener(this);

        container.add(emptyCell1);
        emptyCell1.setBounds(0, 150, 75, 75);
        emptyCell1.addActionListener(this);
        container.add(emptyCell2);
        emptyCell2.setBounds(75, 150, 75, 75);
        emptyCell2.addActionListener(this);
        container.add(emptyCell3);
        emptyCell3.setBounds(150, 150, 75, 75);
        emptyCell3.addActionListener(this);
        container.add(emptyCell4);
        emptyCell4.setBounds(225, 150, 75, 75);
        emptyCell4.addActionListener(this);
        container.add(emptyCell5);
        emptyCell5.setBounds(300, 150, 75, 75);
        emptyCell5.addActionListener(this);
        container.add(emptyCell6);
        emptyCell6.setBounds(375, 150, 75, 75);
        emptyCell6.addActionListener(this);
        container.add(emptyCell7);
        emptyCell7.setBounds(450, 150, 75, 75);
        emptyCell7.addActionListener(this);
        container.add(emptyCell8);
        emptyCell8.setBounds(525, 150, 75, 75);
        emptyCell8.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
