package com.company;


import javax.swing.*;
public class Grader {
     int marks=0;
     String name;
     String grade;

     public void getData() {
         name = JOptionPane.showInputDialog("Please enter your name:");
         marks= Integer.parseInt(JOptionPane.showInputDialog("Please enter your marks:"));
     }
     public  void getGrade() {
         if(marks>69 && marks<=100){
             grade="A";
         }
         else if(marks>59 && marks<70)
         {
             grade="B";
         }
         else if(marks>49 && marks<60)
         {
             grade="C";
         }
         else if(marks>39 && marks<50)
         {
             grade="D";
         }
         else if(marks>=0 && marks<40)
         {
             grade="F";
         }
         else{
             grade="Invalid input check again";
         }
     }
     public void showData () {
         String output;
         output = "Student Name: " + name +"\n" + "Grade:" + grade;
         JOptionPane.showMessageDialog(null,"Results for: \n"+output,
                 "Grading Output",JOptionPane.PLAIN_MESSAGE);
     }

    public static void main(String[] args) {
        Grader obj = new Grader();
        obj.getData();
        obj.getGrade();
        obj.showData();

    }
}
