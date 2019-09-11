/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasos31;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Pasos31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

           //COMPUTE THE HOURS, MINUTES AND SECONDS
           int time;
           int Hours, Minutes, Seconds;

           System.out.print("Enter time in seconds: ");
           time = input.nextInt();

           Hours = (int) time / 3600;
           Minutes = (time%3600) / 60;
           int seconds = time%60;

         
           System.out.println("Time is " + Hours + " hour " + Minutes + 
                              " minutes " + seconds + " seconds");    
    

    }
    
}
