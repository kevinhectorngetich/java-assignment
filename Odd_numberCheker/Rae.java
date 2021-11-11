package Odd_numberCheker;
import java.util.Scanner;

public class Rae {


        public static void main (String[] args){
            int i;
            Scanner odd = new Scanner(System.in);
            //create a scanner object for input
            System.out.println("DISPLAY AN ODD NUMBER UNTIL:");
            int num=odd.nextInt();//Reads input from user and stored in variable num
            System.out.print("odd number from i to "+num+" are: \n");
            i=20;

            do
            {

                if ( i % 2 == 1)
                {
                    System.out.println(i );
                }
                i++;


            }while (i <= num );

        }
    }

