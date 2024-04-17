// John Skinner
// 2024-04-12
// Object- oriented programing
// program will pull up a GUI for new paitents to register to our vet clinic 

package Assignment5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class VetClinicPatientRegistration extends JFrame {

    private JLabel nameLabel, ownerLabel, emailLabel;
    private JLabel vetLabel, statusLabel;
    private JTextField nameField, ownerField, emailField;
    private JRadioButton vet1Button, vet2Button;
    private ButtonGroup vetButtonGroup;
    private JButton registerButton, clearButton, exitButton;
    String selectedVet;

    public VetClinicRegistrationForm() {

        // set window specs 
        setTitle("Vet Clinic Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2));

        // make patient name text field and label 
        nameLabel = new JLabel("Patient Name:");
        nameField = new JTextField();
        nameField.setToolTipText("Enter patient's name");

        // make owner name text field and label 
        ownerLabel = new JLabel("Owner Name:");
        ownerField = new JTextField();
        ownerField.setToolTipText("Enter owner's name");

        // make email address with 
        emailLabel = new JLabel("Email Address:");
        emailField = new JTextField();
        emailField.setToolTipText("Enter owner's email address");

        // make and group the vet radio buttons
        JLabel vetLabel = new JLabel("Select Vet:");
        vet1Button = new JRadioButton("Vet 1");
        vet2Button = new JRadioButton("Vet 2");
        ButtonGroup vetGroup = new ButtonGroup();
        vetGroup.add(vet1Button);
        vetGroup.add(vet2Button);

        // make and set fuction to Register button 
        registerButton = new JButton("Register");
        registerButton.setToolTipText("Register a new patient");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerPatient();
            }
        });

        // make and set fuction to Clear form button
        clearButton = new JButton("Clear");
        clearButton.setToolTipText("Clear the form");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        // make and set the function for the exit button 
        exitButton = new JButton("Exit");
        exitButton.setToolTipText("Exit the form");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // make the status label 
        statusLabel = new JLabel();


        // add everything in order of the grid 
        add(nameLabel);
        add(nameField);
        add(ownerLabel);
        add(ownerField);
        add(emailLabel);
        add(emailField);
        add(vetLabel);
        add(vet1Button);
        // blank label to make everything spaced properly 
        add(new JLabel());
        add(vet2Button);
        add(registerButton);
        add(clearButton);
        add(exitButton);
        add(statusLabel);

        setVisible(true);
    }

    // make the fuction that is called by the register button that does the
    // following
    private void registerPatient() {
        // get patients name and store in variable
        String patientName = nameField.getText();
        // get owners name and store in variable
        String ownerName = ownerField.getText();
        // get email and store in variable
        String email = emailField.getText();
        // make selected vet variable whichever vet radio button is selected

        if (vet1Button.isSelected()) {
            selectedVet = "Vet 1";
        } else {
            selectedVet = "Vet 2";
        }

        // if everything is not filled set status label to show that everything must be
        // filled in
        if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty() || selectedVet.isEmpty()) {
            statusLabel.setText("Please assure all feilds are filled in.");
            return;
        }

        // use the function declared later to check if the email is a valid email
        if (!isValidEmail(email)) {
            statusLabel.setText("Please enter a valid email address.");
            return;
        }

        // when everything is correct display that they have been registered
        statusLabel.setText("Patient registered");

    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}