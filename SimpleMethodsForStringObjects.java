/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.methods.pkgfor.string.objects;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class SimpleMethodsForStringObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String var = "Welcome to java" + " for dummies";
        
        System.out.println(var.length());
        System.out.println(var.charAt(0));
        System.out.println(var.concat(" beginners"));
        System.out.println(var.toUpperCase());
        System.out.println(var.toLowerCase());
        System.out.println(var.trim());
        
        
    }
    
}
