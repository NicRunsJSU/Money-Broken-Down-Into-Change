
package lab2battempttwo;
    
import java.util.Scanner;


public class Lab2BAttemptTwo {

    public static void main(String[] args) {
        
        double change = 0;
        double userInput = 0;
        boolean stillHasMoneys = true;
        
        int dollars = 0;
        int halfDollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        
        System.out.println("Please enter the total in dollars and cents (example: 1.25):");
        
        Scanner input = new Scanner(System.in);
        
        userInput = input.nextDouble();
        
        while (stillHasMoneys) {
            
            dollars = (int) (userInput / 1); 
            change = userInput % 1;
            
            
            halfDollars = (int) (change /.50);
            change = change % .50;
            
            quarters = (int) (change /.25);
            change = change % .25;
            
            dimes = (int) (change /.10);
            change = change % .10;
            
            nickels = (int) (change /.05);
            change = change % .05;
            
            pennies = (int) (change /.01) +1;
            stillHasMoneys = false;
            
           if (change == 0) {
               stillHasMoneys = false;
           } 
           
           System.out.println("Dollars: " + dollars + "\nHalfdollars: " + halfDollars + "\nQuarters: " + quarters  + "\nDimes: " + dimes + "\nNickels; " + nickels + "\nPennies: " + pennies);

        }
        
        
        

    }
    
}
