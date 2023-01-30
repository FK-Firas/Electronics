/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab3;

import java.util.Scanner;


public class Lab3 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); //scanner class object 
        int n,count;   //declaring n and count 
        double num,smallest,largest,average=0;  //declaring the variables smallest largest average
        System.out.print("Please enter the total number of values you want to find the min,max and average: ");
        n=sc.nextInt();  //user inpput the total values 
        System.out.println("\nEnter "+n+" numbers between 1 and 1000 inclusive, and I will tell you the smallest,the largest and the average of these numbers:");
        num=sc.nextDouble();  //entering the first value of the entered n values 
        average+=num;   //adding num to aveargge 
        smallest=num;   //initial assignment of smallest as first values 
        largest=num;   // initial assignment of largest as first values 
        for(int i=1;i<n;i++)  //entering the remaining n-1 values using the for loop 
        {
            num=sc.nextDouble();   //entering the values double values 
            if(smallest>num)   //checking for every num if the entered value is smaller than previous values 
            smallest=num;   //if yes make that number the smallest 
            
            if(largest<num)   {
                largest=num;
            }   
            
            average=average+num;  //adding all the number to average 
            
        }
        average=average/n;  //average of numbers total / n  
        System.out.println();
        System.out.println("Smallest: "+smallest);   //printing smallest largest and average 
        System.out.println("Largest: "+largest);
        System.out.println("Average: "+average);
    }
    }

