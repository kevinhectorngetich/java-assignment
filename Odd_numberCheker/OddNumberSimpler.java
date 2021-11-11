package Odd_numberCheker;

import javax.swing.*;

public class OddNumberSimpler {
    public static void main (String[] args){
       int val = 20;
       //String ans = "";
       StringBuilder ans = new StringBuilder();
       do {

           if (val % 2 != 0){
              // ans+= val + "\n"
               ans.append(val).append("\n");
           }
           val++;
       }while (val <=30);
        displayAns(ans);
    }

    public static void displayAns(StringBuilder ans) {
        JOptionPane.showMessageDialog(
                null,
                "Outputs are: \n"+ans,
                "Outputs of odd",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

