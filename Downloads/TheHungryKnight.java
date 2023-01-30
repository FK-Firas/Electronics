
/*
Firas Kouki
Class : CS232-001
Program : The Hungry Knight
This program will first take name and number of plates of Roast Pheasant, Beef Stew, fine bread, fresh fruit as inputs, and 
print the total cost before tax, the tax, and the final amount. 
Due Date : 9/5/2022
*/
package com.mycompany.thehungryknight;
import java.util.Scanner;
public class TheHungryKnight {

    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome to the Red Baron’s Inn and Tavern, Sir.  We are honored to serve the King’s men during these trying days as our Kingdom readies itself for War.  Your warhorses shall be looked after at our stable and your rooms prepared for you once you have broken your fast with us for the night.  Please free to encourage your men to eat and drink as much as desired, Sir Knight.  The Crown will pay for your meal and lodging for you and your horses, Sir.  We merely need to keep our accounting accurate for the Baron’s tax collector.");
        // Declaration of Input from a user
        Scanner scanner = new Scanner(System.in);
        // Input from the user
        System.out.println("May I ask for your name for my records, Sir Knight?");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Personality Characteristic: ");
        String Personality = scanner.nextLine();
        // print the user name
        System.out.println("Sir " +name + " The " +Personality);
        // Getting all the information needed for the calculation
        System.out.println("How many plates of Roast Pheasant will your party require us to prepare, Sir "+name +" The " +Personality +"?");
        int roast = scanner.nextInt();
        System.out.println("How many bowls of Beef Stew will your party require us to prepare, Sir "+name +" The " +Personality +"?"); 
        int beef = scanner.nextInt();
        System.out.println("How many loafs of fine bread will your party require us to prepare , Sir "+name +" The " +Personality +"?");
        int bread = scanner.nextInt();
        System.out.println("How many pieces of fresh fruit will your party require us to prepare, Sir "+name +" The " +Personality +"?");
        int fruit = scanner.nextInt();
        // calculation of the sub-total
        System.out.println();
        double result;
        result = (roast * 15.15) + (beef * 3.79) + (bread * 5.37) + (fruit * 1.29);
        System.out.print("The Sub-Total is: ");
        System.out.println(result +" silver pieces.");
        // tax calculation
        double tax;
        tax = (result * 5) / 100;
        System.out.print("The Baron’s 5% tax on your order is: ");
        System.out.println(tax +" silver pieces.");
        // The final amount after tax
        System.out.print("The final tally for the meal tonight is: ");
        System.out.println(result + tax + " silver pieces."); 
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
       
        
        
    }
}
