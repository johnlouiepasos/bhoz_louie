/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasos3.pkg2;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Pasos32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
               final double  distancetodrive, milespergallon, pricepergaloon;
               
            System.out.println("Enter the distancetodrive");
            distancetodrive = input.nextDouble();
            System.out.println("Enter the milespergallon");
            milespergallon = input.nextDouble();
            System.out.println("Enter the pricepergaloon");
            pricepergaloon = input.nextDouble();
            
            double Totalcost = (distancetodrive/milespergallon) * pricepergaloon; 
       
        //display
           System.out.printf("The cost of driving is; $%.2f", Totalcost);
            
    }
    
}
