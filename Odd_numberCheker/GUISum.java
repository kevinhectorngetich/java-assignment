package Odd_numberCheker;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUISum extends JFrame{

    /*
     * Only 3 Swing Components are required in this activity namely:
     * (a) JLabel
     * (b) JTextField
     * (c) JButton
     */

    JLabel lblNum1, lblNum2, lblResult; // JLabels
    JTextField txtNum1, txtNum2, txtResult; // JTextFields
    JButton btnOK, btnCancel; // JButtons
    int num1, num2, result; // integer values for computation purposes

    public GUISum() {
        super("Add Two Numbers"); // Setting Window Title via Super Constructor
        //setTitle("Add Two Numbers"); // Setting Windows Title via setTitle Method

        // Instantiate JLables
        lblNum1 = new JLabel("Enter num1: ", SwingConstants.RIGHT);
        lblNum2 = new JLabel("Enter num2: ", SwingConstants.RIGHT);
        lblResult = new JLabel("Result: ", SwingConstants.RIGHT);

        // Instantiate JTextFields
        txtNum1 = new JTextField("0",10);
        txtNum2 = new JTextField("0",10);
        txtResult = new JTextField("0",10);
        txtResult.setEditable(false); // This makes txtResult uneditable by the user

        // Instantiate JButtons
        btnOK = new JButton("Add");
        btnCancel = new JButton("Cancel");

        /*
         * We need a Layout Manager to arrange the JLabels, JTextFields, and JButtons.
         * There are around 10 Layout Managers out there but we will use GridLayout.
         */

        setLayout(new GridLayout(4, 2)); // Based on the sample JFrame, there are 6 rows and 2 columns

        add(lblNum1); //(1,1)
        add(txtNum1); //(1,2)
        add(lblNum2); //(2,1)
        add(txtNum2); //(2,2)
        add(btnOK); //(3,1)
        add(btnCancel); //(3,2)
        add(lblResult); //(4,1)
        add(txtResult); //(4,2)

        // Add Action Listeners to all the Buttons (via Lambda Expressions)
        btnOK.addActionListener(e -> {
            num1 = Integer.parseInt(txtNum1.getText());
            num2 = Integer.parseInt(txtNum2.getText());
            result = num1 + num2;
            txtResult.setText(result+"");
        });

        btnCancel.addActionListener(e -> System.exit(0));

        // Finishing Touches...
        setVisible(true); // This is to make JFrame VISIBLE because it is invisible by default
        setSize(300, 200); // This is to set the size of the JFrame Window
        setResizable(false); // This is to not make the JFrame resizable
        setLocationRelativeTo(null); // This is to make the JFrame appear at middle of screen
        setDefaultCloseOperation(EXIT_ON_CLOSE); // This is for the [x] button
    }

    public static void main(String[] args) {
        new GUISum();
    }
}