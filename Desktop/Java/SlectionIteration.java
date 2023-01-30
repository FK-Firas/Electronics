/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.slectioniteration;
import java.util.Scanner;
public class SlectionIteration {

    public static void main(String[] args) {
        /*ask the user for how many miles are between them and their destination
         create a counter initialized to 0 miles 
        and add each mile to that counter displaying a message keep driving until you have reached your destination
            */
        
       System.out.print("How many miles between you and your destination? ");
       Scanner input = new Scanner(System.in);
       double num = input.nextDouble();      
       System.out.print("How many miles have you driven so far? ");
       double num1 = input.nextDouble();
       double miles = num - num1;
      for(int i=0; i<miles ;i++)
           System.out.println("Keep driving until you have reached your destination.");
      System.out.println("You have reached your destination! ");
       
      /*ask the user to enter the balance of their bank accounts,
       If they have savings equal to $1000.00 or higher then tell them that they can go on vacation 
       If they have savings less than $1000.00, tell them to stay home 
         */
      System.out.print("Please enter the balance of your bank account: ");
      double balance = input.nextDouble();
      if ( balance >= 1000.00){
          System.out.println("You can go on a vacation");
      } else {
          System.out.println("You have to stay home");
          
                          
      }
    /*Ask the user to enter a numeric score and using both if-then-elses and a switch output messages telling them 
              if they made an A or not
      */
      System.out.print("Enter a numeric score: ");
      double numScore = input.nextDouble();
      if (numScore >= 90){
          System.out.println("Congrats! you made an A");
      }
      else if (numScore  >= 80){
          System.out.println("Good job!, you made a B");
      }
      else if (numScore >= 70){
          System.out.println("You passed with a C");
      }
      else if (numScore >= 60){
          System.out.println("You failed with a D");    
      }
      else if (numScore < 60){
          System.out.println("You failed with an F");
      }
      
      /*
      and their cube out to the console window Ask the user for a number  
      and their cube out to the console window
      */
      System.out.print("Enter a number: ");
      int n = input.nextInt();
      for (int i=1; i<=n; i++){
          System.out.println("The number is: " +i+ " and its cube is " + i*i*i);
      }
      /*
      Ask the user for 10 numbers and output the highest and lowest number entered to the screen.
      */
      
      int high, low, nu;
      high = low = nu = 0;
      for (int i=0; i<10; i++){
          System.out.print("Enter a number: ");
          nu = input.nextInt();
          if (nu > high){
              high = nu;
          }
          if (nu < low){
              low = nu;
          }
          System.out.println("The highest number is:" +high);
          System.out.println("The lowest number is: " +low);
      }
      
      
    
    }
   
       
    }
      
    
