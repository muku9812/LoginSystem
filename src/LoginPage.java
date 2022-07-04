import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import static java.awt.font.TextAttribute.FONT;

public class LoginPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton loginButton =new JButton("Login");
    JButton resetButton =new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLable= new JLabel("UserID");
    JLabel userPasswordLable= new JLabel("Password");
    JLabel messageLable = new JLabel();
    HashMap<String,String> loginInfo=new HashMap<String, String>();



    LoginPage(HashMap<String,String> loginInfoOriginal){
        loginInfo =loginInfoOriginal;
        userIdLable.setBounds(50,100,75,25);
        userPasswordLable.setBounds(50,150,75,25);

        messageLable.setBounds(125,250,250,35);
        messageLable.setFont(new Font(null,Font.ITALIC,25));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        frame.add(userIdLable);
        frame.add(userPasswordLable);
        frame.add(messageLable);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==resetButton){
    userIdField.setText("");
    userPasswordField.setText("");

}
if (e.getSource()==loginButton){
    String userID = userIdField.getText();
    String password = String.valueOf(userPasswordField.getPassword());

    if (loginInfo.containsKey(userID)){
        if (loginInfo.get(userID).equals(password)){
            messageLable.setForeground(Color.GREEN);
            messageLable.setText("Login Successful");
            frame.dispose();
            WelcomePage welcomePage= new WelcomePage(userID);

        }else {
            messageLable.setForeground(Color.RED);
            messageLable.setText("Wrong Password Login Failed !!!");

        }
        }else {
        messageLable.setForeground(Color.RED);
        messageLable.setText("Username Not Found Login Failed");
    }
}

    }
}
