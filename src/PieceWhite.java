import javax.swing.*;
import java.awt.*;

class Piece extends Button {
    Icon iconPieceWhite = new ImageIcon("src/pawnWhite.png");
    JButton pieceWhite1 = new JButton(iconPieceWhite);
    JButton pieceWhite2 = new JButton(iconPieceWhite);
    JButton pieceWhite3 = new JButton(iconPieceWhite);
    JButton pieceWhite4 = new JButton(iconPieceWhite);
    JButton pieceWhite5 = new JButton(iconPieceWhite);
    JButton pieceWhite6 = new JButton(iconPieceWhite);
    JButton pieceWhite7 = new JButton(iconPieceWhite);
    JButton pieceWhite8 = new JButton(iconPieceWhite);

    public Piece(){
        Container container = this.getContentPane();
        container.setLayout(null);

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


    }



}
