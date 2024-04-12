// John Skinner
// 2024-04-12
// Object- oriented programing
// This is a simple login GUI

package LastInClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// LoginGui extends JFrame to inherits its properties and implemnts ActionListener
public class LoginGUI extends JFrame implements ActionListener {

    // declare all the components to be used
    private JLabel emptyLabel;
    private JLabel loginLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        // set basic options of my GUI
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // make the panel 4 rows 2 collumns
        JPanel panel = new JPanel(new GridLayout(4, 2));

        // making and placing empty label to help center the login label
        emptyLabel = new JLabel();
        panel.add(emptyLabel);

        // making and placing login label
        loginLabel = new JLabel("Login");
        panel.add(loginLabel);

        // making and placing username label and field
        usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel);
        usernameField = new JTextField();
        panel.add(usernameField);

        // Password label and field
        passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        passwordField = new JPasswordField();
        panel.add(passwordField);

        // making and placing Login button adding action listener so I can see when its
        // clicked
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    // setting up when login button is clicked proform login function
    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getSource() == loginButton) {
            login();
        }
    }

    // make login function to get username and password from text boxes
    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Check if username and password are correct
        if (username.equals("John") && password.equals("100930325")) {
            // show pop up message to when correct
            JOptionPane.showMessageDialog(this, "User name and password are correct");
        } else {
            // show pop up message when not correct
            JOptionPane.showMessageDialog(this, "username and password are incorrect");
        }
    }

    // call LoginGUI in main to use it
    public static void main(String[] args) {
        new LoginGUI();
    }
}
