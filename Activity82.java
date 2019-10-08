/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg8.pkg2;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Activity82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        String line = str.toLowerCase();
          int count = 0;
          for (int i=0; i<str.length();i++)
              switch(str.charAt(i))
              {
                  case'a':
                  case'e':
                  case'i':
                  case'o':
                  case'u':                 
                  count++;
                  break;
              }
            {
                  System.out.println("The number of vowels: " + count);
            }
        
       
    }
    
}
