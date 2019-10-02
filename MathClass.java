/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.pkgclass;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
      
        System.out.println(Math.sin(100));
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();       
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();       
        double y3 = input.nextDouble();
        
        double a = Math.sqrt((Math.pow(x2-x3,2) + Math.pow(y2 - y3, 2)));
        double b = Math.sqrt((Math.pow(x1-x3,2) + Math.pow(y1 - y3, 2)));
        double c = Math.sqrt((Math.pow(x1-x2,2) + Math.pow(y1 - y2, 2)));
        
        
        double A = Math.acos((a*a-b*b-c*c) / (-2*b*c));
        double B = Math.acos((b*b-a*a-c*c) / (-2*a*c));
        double C = Math.acos((c*c-b*b-a*a) / (-2*a*b));
         
         System.out.println(Math.round(Math.toDegrees(A)));
         System.out.println(Math.round(Math.toDegrees(B)));
         System.out.println(Math.round(Math.toDegrees(C)));
    }
    
}
