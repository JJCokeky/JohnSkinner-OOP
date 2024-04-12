package LastInClass;

import javax.swing.*;
import java.awt.*;

public class Login implements ActionListener {
    private JTextField usernameField, passwordField;
    private JLabel usernameLabel, passwordLabel;
    private JButton exitButton, loginButton;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel.setBackground(new Color(175, 238, 238));

        // make and place username lable and text field
        usernameLabel = new JLabel("username: ");
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        // make and place password label and text field
        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // login button
        loginButton = new JButton();

        // make and add exit button
        exitButton = new JButton("Exit");
        exitButton.setBounds(220, 190, 90, 50);
        exitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        exitButton.setToolTipText("Click to exit");
        exitButton.addActionListener(new GUI());// add action to the action listener
        panel.add(exitButton);

    }
}