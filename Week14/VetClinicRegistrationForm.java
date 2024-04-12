package Week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class VetClinicRegistrationForm extends JFrame {

    // Form elements
    private JLabel nameLabel, ownerLabel, emailLabel, vetLabel, messageLabel;
    private JTextField nameField, ownerField, emailField;
    private JRadioButton vet1Button, vet2Button;
    private ButtonGroup vetButtonGroup;
    private JButton registerButton, clearButton, exitButton;

    // Constructor
    public VetClinicRegistrationForm() {
        // Set frame properties
        setTitle("New Patient Registry");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 3));

        // Initialize form elements
        nameLabel = new JLabel("Patient Name:");
        ownerLabel = new JLabel("Owner Name:");
        emailLabel = new JLabel("Email Address:");
        vetLabel = new JLabel("Choose Vet:");
        messageLabel = new JLabel("");

        nameField = new JTextField();
        ownerField = new JTextField();
        emailField = new JTextField();

        vet1Button = new JRadioButton("Vet First Name");
        vet2Button = new JRadioButton("Vet Last Name");
        vet1Button.setSelected(true); // Default selection

        vetButtonGroup = new ButtonGroup();
        vetButtonGroup.add(vet1Button);
        vetButtonGroup.add(vet2Button);

        registerButton = new JButton("Register");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        // Add elements to the frame
        add(nameLabel);
        add(nameField);
        add(ownerLabel);
        add(ownerField);
        add(emailLabel);
        add(emailField);
        add(vetLabel);
        add(vet1Button);
        add(new JLabel());
        add(vet2Button);
        add(registerButton);
        add(clearButton);
        add(exitButton);
        add(messageLabel);

        // Add action listeners
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerPatient();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Set tool tips
        nameLabel.setToolTipText("Enter patient name");
        ownerLabel.setToolTipText("Enter owner name");
        emailLabel.setToolTipText("Enter email address");
        vetLabel.setToolTipText("Select vet for the patient");
        registerButton.setToolTipText("Register new patient");
        clearButton.setToolTipText("Clear form");
        exitButton.setToolTipText("Exit form");

        // Set keyboard shortcuts
        registerButton.setMnemonic(KeyEvent.VK_R);
        clearButton.setMnemonic(KeyEvent.VK_C);
        exitButton.setMnemonic(KeyEvent.VK_X);

        // Display the frame
        setVisible(true);
    }

    // Method to validate email using regex
    private boolean isValidEmail(String email) {
        String regexPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*"
                + "@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Method to register patient
    private void registerPatient() {
        String patientName = nameField.getText();
        String ownerName = ownerField.getText();
        String email = emailField.getText();
        String selectedVet = vet1Button.isSelected() ? "Vet First Name" : "Vet Last Name";

        // Input validation
        if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty() || !isValidEmail(email)) {
            messageLabel.setText("Invalid input! Please check the fields.");
            return;
        }

        // Write to file
        try (PrintWriter writer = new PrintWriter(new FileWriter("newpatientfile.txt", true))) {
            writer.println("**Patient Registration Document**");
            writer.println("Patient Name: " + patientName);
            writer.println("Owner Name: " + ownerName);
            writer.println("Email Address: " + email);
            writer.println("Selected Vet: " + selectedVet);
            writer.println("Registration Date: " + new Date());
            writer.println("----------------------------------");
            writer.close();
            messageLabel.setText("Patient registered successfully!");
        } catch (IOException e) {
            messageLabel.setText("Error: Failed to register patient!");
            e.printStackTrace();
        }
    }

    // Method to clear the form
    private void clearForm() {
        nameField.setText("");
        ownerField.setText("");
        emailField.setText("");
        vet1Button.setSelected(true);
        messageLabel.setText("");
        nameField.requestFocus();
    }

    // Main method
    public static void main(String[] args) {
        new VetClinicRegistrationForm();
    }
}
