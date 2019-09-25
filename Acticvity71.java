/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acticvity7.pkg1;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Acticvity71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
 
            System.out.println("Enter a phone number");
                    long phone, rt;
                    long number1, number2, number3;
                      phone = input.nextLong();
          

          //solution
          number1 = phone / 10000000;
          rt = phone % 1000000000;
          number2 = rt / 10000;
          number3 = rt % 10000;
          
          //compute the number
          if (number1 == 800 || number1 == 888 || number1 == 877 || number1 == 866);
          {System.out.println(number1 + "-" + number2 + "-" + number3 + " is a toll number");}
    
    
    
    
    
    
    }
    
}
