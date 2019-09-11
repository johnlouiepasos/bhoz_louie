/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasos1.pkg2;

import java.util.Scanner;

/**
 *
 * @author 487426
 */
public class Pasos12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       
         final double FederalincomeTax = 0.15, StateTax = 0.035, SocialsecTax = 0.0575, 
              MmTax = 0.0275, PensionPlan = 0.05, HealthInsurance = 75.0, netpay; 
         
         System.out.println("Enter your name");
         String name = in.nextLine();
         System.out.println("Gross amount");
         double Grossamount = in.nextDouble();
         
         //Given
         double npay =  Grossamount * FederalincomeTax;
         double stateTax = StateTax * Grossamount;
         double socialsecTax = SocialsecTax * Grossamount;
         double mmTax = MmTax * Grossamount;
         double pensionPlan = PensionPlan * Grossamount;
         netpay = Grossamount - (npay + socialsecTax + stateTax  + mmTax + pensionPlan + HealthInsurance);
         
       //compute others
       System.out.println(name);
       System.out.printf("Gross Amount   : $%.2f", Grossamount);
       System.out.printf("Federal Tax  : $%.2f", npay);
       System.out.printf("State Tax   : $%.2f", stateTax);
       System.out.printf("Social Security Tax   : $%.2f", socialsecTax);
       System.out.printf("Medicare/Medicaid Tax : $%.2f", MmTax);
       System.out.printf("Pension Plan    : $%.2f", pensionPlan);
       System.out.printf("Health Insurance  : $%.2f", HealthInsurance);
       System.out.printf("Net Pay    : $%.2f", netpay);
         
      }
    
}
