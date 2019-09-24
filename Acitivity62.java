/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acitivity.pkg6.pkg2;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Acitivity62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.printf("Enter today's day: ");
        int date = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int FutureDate = (date + elapsed) % 7;
        String DayofWeek = "";

        switch(date)
          { case 0: DayofWeek = 
                   ("Sunday");
                    break;
            case 1: DayofWeek = 
                   ("Monday");
                    break; 
            case 2: DayofWeek = 
                   ("Tuesday");
                    break;
            case 3: DayofWeek = 
                   ("Wednesday");
                    break;
            case 4: DayofWeek = 
                   ("Thursday");
                   break;
            case 5: DayofWeek = 
                   ("Friday");
                    break;
            case 6: DayofWeek = 
                   ("Saturday");
                    break; }
       

        if (FutureDate == 0)
        {System.out.printf("Todays is %s and the future day is Sunday \n", DayofWeek);}
        else if(FutureDate == 1)
            {System.out.printf("Todays is %s and the future day is Monday \n", DayofWeek);}
        else if(FutureDate == 2)
            { System.out.printf("Todays is %s and the future day is Tuesday \n", DayofWeek);}
        else if(FutureDate == 3)
            { System.out.printf("Todays is %s and the future day is Wednesday \n", DayofWeek);}
        else if(FutureDate == 4)
            {System.out.printf("Todays is %s and the future day is Thursday \n", DayofWeek);}
        else if(FutureDate == 5)
            {System.out.printf("Todays is %s and the future day is Friday \n", DayofWeek);}
        else if(FutureDate == 6)
        {System.out.printf("Todays is %s and the future day is Saturday \n", DayofWeek);}
       
        
        
        
          
    }
    
}
