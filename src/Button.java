import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JFrame implements ActionListener {

    public static void main(String[] args) {

        Field field = new Field();
        field.setVisible(true);

        Swapper swapper = new Swapper();
        swapper.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}




