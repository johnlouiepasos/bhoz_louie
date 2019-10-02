/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       
        
        char var = 97;
       
        
        System.out.println(Character.isDigit(var));
        System.out.println(Character.isLetter(var));
        System.out.println(Character.isLetterOrDigit(var));
        System.out.println(Character.isLowerCase(var));
        System.out.println(Character.isUpperCase(var));
        System.out.println(Character.toLowerCase(var));
        System.out.println(Character.toUpperCase(var));

    
    
    
    
    }
    
}
