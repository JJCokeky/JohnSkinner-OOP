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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Action Listener
public class GUI implements ActionListener {

    private static JLabel titleLabel;
    private static JLabel firstNumLabel;
    private static JTextField firstNumText;
    private static JLabel secondNumLabel;
    private static JTextField secondNumText;
    private static JButton submitButton;
    private static JButton exitButton;

    // test if input is numeric
    public static boolean isNumeric(String number) {
        try {
            // try to parse input into a double
            double d = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            // input not numeric, return flase
            return false;
        }
        // otherwise, all good, return true
        return true;
    }

    public static void main(String[] args) {

        // set up the JFrame and JPanel
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 300);// set the form size
        // stop resizing of the form
        frame.setResizable(false);
        // exit the form when closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set location center screen
        frame.setLocationRelativeTo(null);
        // set background colour
        panel.setBackground(new Color(175, 238, 238));

        // add panel to the frame
        frame.add(panel);
        panel.setLayout(null);// dont' pick a layout

        // add in form elements here
        // TITLE LABEL
        titleLabel = new JLabel("My First Form!");
        // set position and size
        titleLabel.setBounds(80, 20, 200, 50);
        // set font and size
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        // add to the panel
        panel.add(titleLabel);

        // FIRST NUMBER LABEL
        firstNumLabel = new JLabel("First value:");
        // set position and size
        firstNumLabel.setBounds(30, 70, 100, 50);
        // set font and size
        firstNumLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        // add to the panel
        panel.add(firstNumLabel);

        // FIRST NUMBER TEXTFIELD
        firstNumText = new JTextField(20);
        // set position
        firstNumText.setBounds(140, 70, 100, 40);
        // add to the panel
        panel.add(firstNumText);

        // SECOND NUMBER LABEL
        secondNumLabel = new JLabel("Second value:");
        // set position and size
        secondNumLabel.setBounds(30, 120, 100, 50);
        // set font and size
        secondNumLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        // add to the panel
        panel.add(secondNumLabel);

        // FIRST NUMBER TEXTFIELD
        secondNumText = new JTextField(20);
        // set position
        secondNumText.setBounds(140, 120, 100, 40);
        // add to the panel
        panel.add(secondNumText);

        // SUBMIT BUTTON
        submitButton = new JButton("Submit");
        submitButton.setBounds(60, 190, 90, 50);
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setToolTipText("Click to submit");
        submitButton.addActionListener(new GUI());// add action to the action listener
        panel.add(submitButton);

        // EXIT BUTTON
        exitButton = new JButton("Exit");
        exitButton.setBounds(220, 190, 90, 50);
        exitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        exitButton.setToolTipText("Click to exit");
        exitButton.addActionListener(new GUI());// add action to the action listener
        panel.add(exitButton);

        // set frame to visible
        frame.setVisible(true);

        // System.out.println("Hello world!");
    }

    // create an action listener (event) for the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        Double numOne = 0.0d;
        Double numTwo = 0.0d;
        Double result = 0.0d;
        boolean noErrors = true; // set flag to true

        // CHECK WHAT BUTTON IS CLICKED
        // decision structure to differentiate between the submit and exit button
        if (e.getSource() == submitButton) { // check if submit button clicked

            // FIRST VALUE
            // check if First Number field is empty
            if (firstNumText.getText() == null || firstNumText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "First value cannot be empty", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                noErrors = false;
            } else if (!isNumeric(firstNumText.getText())) // check if not numeric
            {
                JOptionPane.showMessageDialog(null, "First value must be numeric", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                noErrors = false;
            } else // all good
            {
                numOne = Double.parseDouble(firstNumText.getText());
            }

            // SECOND VALUE
            // check if First Number field is empty
            if (secondNumText.getText() == null || secondNumText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Second value cannot be empty", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                noErrors = false;
            } else if (!isNumeric(secondNumText.getText())) // check if not numeric
            {
                JOptionPane.showMessageDialog(null, "Second value must be numeric", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
                noErrors = false;
            } else // all good
            {
                numTwo = Double.parseDouble(secondNumText.getText());
            }

            // If there are no errors, then calculate
            if (noErrors) {
                result = numOne * numTwo;
                JOptionPane.showMessageDialog(null, "Result:" + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        // check if exit button clicked
        else if (e.getSource() == exitButton) {
            // close the form
            System.exit(0);
        }

    }
}