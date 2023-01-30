/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studentstestscores;

/**
 *
 * @author a0135
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class StudentsTestScores {

    public static void main(String[] args) throws IOException {
       File file = new File("C:\\Users\\a0135\\Documents\\NetBeansProjects\\StudentsTestScores\\src\\main\\java\\lab2_input.txt");
       Scanner input = new Scanner(file);
       System.out.println(input.nextLine());
       int i, c = 0;
       int []a = new int[100];
       int[]b = new int[8];
       for (i=0; i<b.length; i++){
           b[i]=0;
       }
       while (input.hasNext()){
           a[c] = input.nextInt();
           c++;
       }
       for (i=1; i<c; i++){
           if(a[i]>=0 && a[i] < 25)
               b[0]++;
           else if(a[i]>=25 && a[i] < 50)
               b[1]++;
           else if(a[i]>=50 && a[i] < 75)
               b[2]++;
           else if(a[i]>=75 && a[i] < 100)
               b[3]++;
           else if(a[i]>=100 && a[i] < 125)
               b[4]++;
           else if(a[i]>=125 && a[i] < 150)
               b[5]++;
           else if(a[i]>=150 && a[i] < 175)
               b[6]++;
           else if(a[i]>=175 && a[i] <= 200)
               b[7]++;
       }
System.out.println("[ 0 - 24 ] : "+b[0]);
System.out.println("[ 25 - 49 ] : "+b[1]);
System.out.println("[ 50 - 74 ] : "+b[2]);
System.out.println("[ 75 - 99 ] : "+b[3]);
System.out.println("[ 100 - 124 ] : "+b[4]);
System.out.println("[ 125 - 149 ] : "+b[5]);
System.out.println("[ 150 - 174 ] : "+b[6]);
System.out.println("[ 175 - 200 ] : "+b[7]);
    }
}
