
package friendly.number;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class FriendlyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
        int Num1, Num2, Num3, Num4, Num5;
        
        System.out.println("Enter Five Digit Number");
        int Digit =scan.nextInt();
        
        Num1 = Digit/10000;
        Num2 = Digit/1000;
        Num3 = Digit/100;
        Num4 = Digit/10;
        Num5 = Digit/1;
        
        if (Num1 % 1==0 && Num2 % 2==0 && Num3 % 3==0 && Num4 % 4==0 && Num5 % 5==0)
         {
              System.out.println(Digit+ " is Friendly");
         }
        else 
         {
              System.out.println("The number you've enter is not Friendly at all");
    }
    
}
}
