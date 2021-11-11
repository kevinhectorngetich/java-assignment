package Odd_numberCheker;

import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        int num1, num2,ans;
        String operand;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first value:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        operand = JOptionPane.showInputDialog("Choose operation: (+ - * /)");

        if ("+".equals(operand)) {
            ans = num1 + num2;
            new JTextField("Your answer is:" + ans);
//            JOptionPane.showMessageDialog(
//                    null,
//                    "Output:\n" + ans,
//                    "Simple Calc",
//                    JOptionPane.PLAIN_MESSAGE
//            );
        } else if ("-".equals(operand)) {
            ans = num1 - num2;
            JOptionPane.showMessageDialog(
                    null,
                    "Output:\n" + ans,
                    "Simple Calc",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else if ("*".equals(operand)) {
            ans = num1 * num2;
            JOptionPane.showMessageDialog(
                    null,
                    "Output:\n" + ans,
                    "Simple Calc",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else if ("/".equals(operand)) {
            ans = num1 / num2;
            JOptionPane.showMessageDialog(
                    null,
                    "Output:\n" + ans,
                    "Simple Calc",
                    JOptionPane.PLAIN_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Output, entered wrong value\n",
                    "Error",
                    JOptionPane.PLAIN_MESSAGE
            );
        }
    }
}
