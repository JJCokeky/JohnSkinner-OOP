// John Skinner
// 2024-04-12
// Object- oriented programing
// program will pull up a GUI for new paitents to register to our vet clinic 

package Assignment5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VetClinicPatientRegistration extends JFrame {

    private JLabel nameLabel, ownerLabel, emailLabel, vetLabel, messageLabel;
    private JTextField nameField, ownerField, emailField;
    private JRadioButton vet1Button, vet2Button;
    private ButtonGroup vetButtonGroup;
    private JButton registerButton, clearButton, exitButton;

    public VetClinicRegistrationForm() {

        setTitle("New Patient Registry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 3));


        // make and place patient name


        // make and place owner name


        // make and place email address 

    }

}