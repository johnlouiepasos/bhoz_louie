/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acitivity.pkg71;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Acitivity71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
 
            System.out.println("Enter a phone number");
                    long phone, rt;
                    long number1, number2, number3;
                      phone = input.nextLong();
     
          //Given
          number1 = phone / 10000000;
          rt = phone % 1000000000;
          number2 = rt / 10000;
          number3 = rt % 10000 ;
          
          //compute the number
          if (number1 == 800 || number1 == 888 || number1 == 877 || number1 == 866)
          {System.out.println(number1 + "-" + number2 + "-" + number3 + " is a toll number");}
       
         else if (number1 != 800 || number1 != 888 || number1 != 877 || number1 != 866)
              
          {System.out.println( number1 + "-" + number2 + "-" + number3 + " is not a toll number");}
              
    
              
    }
}


