/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity7.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Activity72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       Random rand = new Random ();
       
       int Random = rand.nextInt(2);
       int Rock;
       int Scissor;
       int Paper;
       
       Rock = 0;
       Scissor = 1;
       Paper = 2;
       
        System.out.println("Rock: 0 Scissor: 1 Paper: 2 ");
        System.out.printf("Choose: ");
        int Choose = input.nextInt();
        System.out.println("The computer chooses: " + Random);
       
        //compute the program
        if (Choose == Random )
            System.out.println("It's a tie");
      else  if (Choose == 0 & Random == 1)
            System.out.println("Player: Rock \nComputer: Scissor \nPlayer wins ");
       else if (Choose == 1 & Random == 2)
            System.out.println("Player: Scissor \nComputer: Paper \nPlayer wins ");
       else if (Choose == 2 & Random == 0)
            System.out.println("Player: Paper \nComputer: Rock \nPlayer wins ");
       else if (Choose == 1 & Random == 0)
            System.out.println("Player: Scissor \nComputer: Rock \nComputer wins ");
       else if (Choose == 2 & Random == 1)
            System.out.println("Player: Paper \nComputer: Scissor \nComputer wins ");
       else if (Choose == 0 & Random == 2)
            System.out.println("Player: Rock \nComputer: Paper \nComputer wins ");  
       
       
    }
    
}
