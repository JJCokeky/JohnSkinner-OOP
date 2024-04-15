package Week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class VetClinicRegistrationForm extends JFrame {
    private JTextField patientNameField, ownerNameField, emailField;
    private JRadioButton vet1Button, vet2Button;
    private JButton registerButton, clearButton, exitButton;
    private JLabel statusLabel;

    public VetClinicRegistrationForm() {
        setTitle("Vet Clinic Registration Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel patientNameLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField();
        patientNameField.setToolTipText("Enter patient's name");

        JLabel ownerNameLabel = new JLabel("Owner Name:");
        ownerNameField = new JTextField();
        ownerNameField.setToolTipText("Enter owner's name");

        JLabel emailLabel = new JLabel("Email Address:");
        emailField = new JTextField();
        emailField.setToolTipText("Enter owner's email address");

        JLabel vetLabel = new JLabel("Select Vet:");
        vet1Button = new JRadioButton("Vet 1");
        vet2Button = new JRadioButton("Vet 2");
        ButtonGroup vetGroup = new ButtonGroup();
        vetGroup.add(vet1Button);
        vetGroup.add(vet2Button);

        registerButton = new JButton("Register");
        registerButton.setToolTipText("Register a new patient");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerPatient();
            }
        });

        clearButton = new JButton("Clear");
        clearButton.setToolTipText("Clear the form");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        exitButton = new JButton("Exit");
        exitButton.setToolTipText("Exit the form");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        statusLabel = new JLabel();

        add(patientNameLabel);
        add(patientNameField);
        add(ownerNameLabel);
        add(ownerNameField);
        add(emailLabel);
        add(emailField);
        add(vetLabel);
        add(vet1Button);
        add(new JLabel());
        add(vet2Button);
        add(registerButton);
        add(clearButton);
        add(exitButton);
        add(statusLabel);

        setVisible(true);
    }

    private void registerPatient() {
        String patientName = patientNameField.getText();
        String ownerName = ownerNameField.getText();
        String email = emailField.getText();
        String selectedVet = (vet1Button.isSelected()) ? "Vet 1" : (vet2Button.isSelected()) ? "Vet 2" : "";

        if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty() || selectedVet.isEmpty()) {
            statusLabel.setText("Please fill in all fields.");
            return;
        }

        if (!isValidEmail(email)) {
            statusLabel.setText("Please enter a valid email address.");
            return;
        }

        // Add logic to register the patient
        statusLabel.setText("Patient registered successfully.");
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private void clearForm() {
        patientNameField.setText("");
        ownerNameField.setText("");
        emailField.setText("");
        vet1Button.setSelected(false);
        vet2Button.setSelected(false);
        statusLabel.setText("");
    }

    public static void main(String[] args) {
        new VetClinicRegistrationForm();
    }
}
