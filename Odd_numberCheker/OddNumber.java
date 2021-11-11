package Odd_numberCheker;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OddNumber {
    static List<Integer> output = new ArrayList<>();
    public static void main(String[] args) {
        int val = 20;
        do {
            checkNumber(val);
            val++;
        }while(val <= 30);
        displayOutput(output);
    }
    private static void checkNumber(int val) {
        if (val % 2 != 0){
            output.add(val);
        }
    }
    private static void displayOutput(List<Integer> output) {
        JOptionPane.showMessageDialog(null,
                "Odd number are \n:"+ output,
                "Odd numbers are:\n" ,
                JOptionPane.INFORMATION_MESSAGE,null
        );
    }


}

