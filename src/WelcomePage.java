import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel message= new JLabel();

    WelcomePage(String userID){
        message.setText("Hey, "+userID+" Welcome !!!!");
        message.setBounds(0,0,500,25);
        message.setFont(new Font(null,Font.BOLD,25));

        frame.add(message);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
