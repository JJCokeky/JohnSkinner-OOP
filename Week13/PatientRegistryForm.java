package Week13;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class GUI implements ActionListener {
//     private int clicks = 0;
//     private JLabel label = new JLabel("Number of clicks:  0     ");
//     private JFrame frame = new JFrame();

//     public GUI() {

//         // the clickable button
//         JButton button = new JButton("Click Me");
//         button.addActionListener(this);

//         // the panel with the button and text
//         JPanel panel = new JPanel();
//         panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
//         panel.setLayout(new GridLayout(0, 1));
//         panel.add(button);
//         panel.add(label);

//         // set up the frame and display it
//         frame.add(panel, BorderLayout.CENTER);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setTitle("GUI");
//         frame.pack();
//         frame.setVisible(true);
//     }

//     // process the button clicks
//     public void actionPerformed(ActionEvent e) {
//         clicks++;
//         label.setText("Number of clicks:  " + clicks);
//     }

//     // create one Frame
//     public static void main(String[] args) {
//         new GUI();
//     }
// }

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// // Action Listener
// public class GUI implements ActionListener {

//     private static JLabel titleLabel;
//     private static JLabel firstNumLabel;
//     private static JTextField firstNumText;
//     private static JLabel secondNumLabel;
//     private static JTextField secondNumText;
//     private static JButton submitButton;
//     private static JButton exitButton;

//     // test if input is numeric
//     public static boolean isNumeric(String number) {
//         try {
//             // try to parse input into a double
//             double d = Double.parseDouble(number);
//         } catch (NumberFormatException e) {
//             // input not numeric, return flase
//             return false;
//         }
//         // otherwise, all good, return true
//         return true;
//     }

//     public static void main(String[] args) {

//         // set up the JFrame and JPanel
//         JPanel panel = new JPanel();
//         JFrame frame = new JFrame();
//         frame.setSize(400, 300);// set the form size
//         // stop resizing of the form
//         frame.setResizable(false);
//         // exit the form when closed
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         // set location center screen
//         frame.setLocationRelativeTo(null);
//         // set background colour
//         panel.setBackground(new Color(175, 238, 238));

//         // add panel to the frame
//         frame.add(panel);
//         panel.setLayout(null);// dont' pick a layout

//         // add in form elements here
//         // TITLE LABEL
//         titleLabel = new JLabel("My First Form!");
//         // set position and size
//         titleLabel.setBounds(80, 20, 200, 50);
//         // set font and size
//         titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
//         // add to the panel
//         panel.add(titleLabel);

//         // FIRST NUMBER LABEL
//         firstNumLabel = new JLabel("First value:");
//         // set position and size
//         firstNumLabel.setBounds(30, 70, 100, 50);
//         // set font and size
//         firstNumLabel.setFont(new Font("Arial", Font.PLAIN, 15));
//         // add to the panel
//         panel.add(firstNumLabel);

//         // FIRST NUMBER TEXTFIELD
//         firstNumText = new JTextField(20);
//         // set position
//         firstNumText.setBounds(140, 70, 100, 40);
//         // add to the panel
//         panel.add(firstNumText);

//         // SECOND NUMBER LABEL
//         secondNumLabel = new JLabel("Second value:");
//         // set position and size
//         secondNumLabel.setBounds(30, 120, 100, 50);
//         // set font and size
//         secondNumLabel.setFont(new Font("Arial", Font.PLAIN, 15));
//         // add to the panel
//         panel.add(secondNumLabel);

//         // FIRST NUMBER TEXTFIELD
//         secondNumText = new JTextField(20);
//         // set position
//         secondNumText.setBounds(140, 120, 100, 40);
//         // add to the panel
//         panel.add(secondNumText);

//         // SUBMIT BUTTON
//         submitButton = new JButton("Submit");
//         submitButton.setBounds(60, 190, 90, 50);
//         submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
//         submitButton.setToolTipText("Click to submit");
//         submitButton.addActionListener(new GUI());// add action to the action listener
//         panel.add(submitButton);

//         // EXIT BUTTON
//         exitButton = new JButton("Exit");
//         exitButton.setBounds(220, 190, 90, 50);
//         exitButton.setFont(new Font("Arial", Font.PLAIN, 15));
//         exitButton.setToolTipText("Click to exit");
//         exitButton.addActionListener(new GUI());// add action to the action listener
//         panel.add(exitButton);

//         // set frame to visible
//         frame.setVisible(true);

//         // System.out.println("Hello world!");
//     }

//     // create an action listener (event) for the buttons
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         Double numOne = 0.0d;
//         Double numTwo = 0.0d;
//         Double result = 0.0d;
//         boolean noErrors = true; // set flag to true

//         // CHECK WHAT BUTTON IS CLICKED
//         // decision structure to differentiate between the submit and exit button
//         if (e.getSource() == submitButton) { // check if submit button clicked

//             // FIRST VALUE
//             // check if First Number field is empty
//             if (firstNumText.getText() == null || firstNumText.getText().isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "First value cannot be empty", "Error",
//                         JOptionPane.INFORMATION_MESSAGE);
//                 noErrors = false;
//             } else if (!isNumeric(firstNumText.getText())) // check if not numeric
//             {
//                 JOptionPane.showMessageDialog(null, "First value must be numeric", "Error",
//                         JOptionPane.INFORMATION_MESSAGE);
//                 noErrors = false;
//             } else // all good
//             {
//                 numOne = Double.parseDouble(firstNumText.getText());
//             }

//             // SECOND VALUE
//             // check if First Number field is empty
//             if (secondNumText.getText() == null || secondNumText.getText().isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "Second value cannot be empty", "Error",
//                         JOptionPane.INFORMATION_MESSAGE);
//                 noErrors = false;
//             } else if (!isNumeric(secondNumText.getText())) // check if not numeric
//             {
//                 JOptionPane.showMessageDialog(null, "Second value must be numeric", "Error",
//                         JOptionPane.INFORMATION_MESSAGE);
//                 noErrors = false;
//             } else // all good
//             {
//                 numTwo = Double.parseDouble(secondNumText.getText());
//             }

//             // If there are no errors, then calculate
//             if (noErrors) {
//                 result = numOne * numTwo;
//                 JOptionPane.showMessageDialog(null, "Result:" + result, "Result", JOptionPane.INFORMATION_MESSAGE);
//             }
//         }
//         // check if exit button clicked
//         else if (e.getSource() == exitButton) {
//             // close the form
//             System.exit(0);
//         }

//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientRegistryForm extends JFrame {
    private JTextField patientNameField, ownerNameField, emailField;
    private JLabel messageLabel;
    private JRadioButton vet1RadioButton, vet2RadioButton;
    private ButtonGroup vetButtonGroup;

    public PatientRegistryForm() {
        setTitle("New Patient Registry");
        setIconImage(new ImageIcon("custom_icon.png").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        // Form elements
        JLabel patientNameLabel = new JLabel("Patient Name:");
        patientNameField = new JTextField(20);
        JLabel ownerNameLabel = new JLabel("Owner Name:");
        ownerNameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email Address:");
        emailField = new JTextField(20);

        vet1RadioButton = new JRadioButton("John Doe");
        vet2RadioButton = new JRadioButton("Jane Smith");
        vet1RadioButton.setSelected(true); // Default selection
        vetButtonGroup = new ButtonGroup();
        vetButtonGroup.add(vet1RadioButton);
        vetButtonGroup.add(vet2RadioButton);

        JButton registerButton = new JButton("Register");
        registerButton.setToolTipText("Click to register a new patient (Ctrl+R)");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerPatient();
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setToolTipText("Clear the form (Ctrl+C)");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setToolTipText("Exit the form (Ctrl+E)");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the form
            }
        });

        messageLabel = new JLabel();
        messageLabel.setForeground(Color.RED);

        // Layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(patientNameLabel, constraints);
        constraints.gridx = 1;
        panel.add(patientNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(ownerNameLabel, constraints);
        constraints.gridx = 1;
        panel.add(ownerNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(emailLabel, constraints);
        constraints.gridx = 1;
        panel.add(emailField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(new JLabel("Veterinarian:"), constraints);
        constraints.gridx = 1;
        panel.add(vet1RadioButton, constraints);
        constraints.gridx = 2;
        panel.add(vet2RadioButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(registerButton, constraints);
        constraints.gridx = 2;
        panel.add(clearButton, constraints);
        constraints.gridx = 3;
        panel.add(exitButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 4;
        panel.add(messageLabel, constraints);

        add(panel);
        setVisible(true);
    }

    private void registerPatient() {
        String patientName = patientNameField.getText().trim();
        String ownerName = ownerNameField.getText().trim();
        String email = emailField.getText().trim();

        if (patientName.isEmpty() || ownerName.isEmpty() || email.isEmpty()) {
            displayError("Please fill in all fields.");
            return;
        }

        if (!isValidEmail(email)) {
            displayError("Invalid email address.");
            return;
        }

        // Determine selected vet
        String selectedVet = vet1RadioButton.isSelected() ? vet1RadioButton.getText() : vet2RadioButton.getText();

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newpatientfile.txt"))) {
            writer.write("**Patient Registration Document**\n");
            writer.write("Patient Name: " + patientName + "\n");
            writer.write("Owner Name: " + ownerName + "\n");
            writer.write("Email Address: " + email + "\n");
            writer.write("Vet Assigned: " + selectedVet + "\n");
            writer.write("Registration Date: " + new Date() + "\n");
            writer.write("-----------------------------------\n");
            writer.flush();
            displaySuccess("Patient registered successfully.");
        } catch (IOException e) {
            displayError("Failed to register patient. Please try again.");
        }
    }

    private void clearForm() {
        patientNameField.setText("");
        ownerNameField.setText("");
        emailField.setText("");
        vet1RadioButton.setSelected(true);
        messageLabel.setText("");
        patientNameField.requestFocus();
    }

    private boolean isValidEmail(String email) {
        String regexPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*" +
                "@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void displayError(String message) {
        messageLabel.setForeground(Color.RED);
        messageLabel.setText(message);
    }

    private void displaySuccess(String message) {
        messageLabel.setForeground(Color.GREEN.darker());
        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PatientRegistryForm();
            }
        });
    }
}