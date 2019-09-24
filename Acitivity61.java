/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acitivity.pkg6.pkg1;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Acitivity61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
            System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();

		int digit1 = (int)(number / 100);
		int remaining = number % 100;
		int digit3 = (int)(remaining % 10);

		System.out.println
                (number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
        
    }
    
}
