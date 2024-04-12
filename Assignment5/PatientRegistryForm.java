// John Skinner
// 2024-04-12
// Object- oriented programing
// program will pull up a GUI for new paitents to register to our vet clinic 

package Assignment5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientRegistryForm extends JFrame implements ActionListener {

    private JLabel nameLabel, ownerLabel, emailLabel, vetLabel, messageLabel;
    private JTextField nameField, ownerField, emailField;
    private JRadioButton vet1Button, vet2Button;
    private ButtonGroup vetButtonGroup;
    private JButton registerButton, clearButton, exitButton;

    public VetClinicRegistrationForm() {

        // setting the required fram proporties
        setTitle("New Patient Registry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 3));

        // Text field elements 
        //making and setting patients name field and label 

    }

}