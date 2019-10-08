/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity8.pkg1;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Activity81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);   
        System.out.println("Input an integer ");
        int num = in.nextInt();
        int Sum = 0;
       
        //compute the integer
            if (num <0)
            num = -num;
            
           while (num > 0)
           { Sum = Sum + num % 10;
            num = num / 10;}
            System.out.println("The sum is \n"+Sum);
        
        }
    
    }
    
