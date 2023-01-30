/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversiont;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ConversionT {

    public static void main(String[] args) throws IOException {
        try{
            // Step 1 - Opens an input file called "fahreinheit.txt" and reads the integers into an ArrayList called fahreinheit_list open file.
            File input = new File("C:\\Users\\a0135\\Documents\\NetBeansProjects\\conversionT\\src\\main\\java\\com\\mycompany\\conversiont\\farheinheit.txt");
            Scanner reader = new Scanner(input);
            
            // read integers and add in ArrayList  
            ArrayList<Integer> fahreinheit_list = new ArrayList<>();
            while(reader.hasNextInt())
            {
                fahreinheit_list.add(reader.nextInt());
            }

            // Step 2 - Creates a second ArrayList called celsius_list.
            ArrayList<Integer> celsius_list = new ArrayList<>();

            // Step 3 - Using the farienheit_list ArrayList, calculate each Farheinheit's equivalent Celsius temperature and store the result in the ArrayList called celsius_list.
            for(int i = 0 ; i < fahreinheit_list.size() ;  i++){
                // Fahrenheit value
                Integer fahreinheit = fahreinheit_list.get(i);

                // celsius value from fahreinheit value
                Integer celsius = ((fahreinheit - 32)*5)/9;

                // store the result in the ArrayList 
                celsius_list.add(celsius); 
            }

            // Step 4 - Open an output file called "temperature_conversion_table.txt".
            File output = new File("temperature_conversion_table.txt");
            FileWriter writer = new FileWriter(output);

            // Step 5 -  Write out the contents of both ArrayLists into a formatted Conversion table like the one below organized into two columns separated by a tab character into the "temperature_conversion_table.txt".
            // columns name write
            writer.write("Fahrenheit\tCelsius\n");
            for(int i = 0 ; i < fahreinheit_list.size() ;  i++){
                // Fahrenheit value
                Integer fahreinheit = fahreinheit_list.get(i);

                // celsius value from fahreinheit value
                Integer celsius = celsius_list.get(i);
              
                // store the olumn value  in the file 
                writer.write(Integer.toString(fahreinheit)+"\t"+Integer.toString(celsius)+"\n");
            }

            // Step 6 - Close both the input file and the output files.
            reader.close();
            writer.close();

            // Step 7 -  Open the "temperature_conversion_table.txt" file you just created.
            File newInput = new File("temperature_conversion_table.txt");
            Scanner newReader = new Scanner(newInput);

            // Step 8 - Pull the data stored within it into a hash_map, where each key will be the Fahrenheit temperatures, and each value associated with that key will be the celsius temperatures.
            // Create a Hash map
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            
            // read column value
            String title = newReader.nextLine();
            while(newReader.hasNextInt())
            {
                // fahreinheit value
                Integer fahreinheit = newReader.nextInt();

                // celsius value from fahreinheit value
                Integer celsius = newReader.nextInt();
                
                // put key-value in the hash map
                hashMap.put(fahreinheit, celsius);
            }
            // close "temperature_conversion_table.txt" file
            newReader.close();

            // Step 9 - Output the conversion table as formatted above to the screen using the hashmap holding the Fahrenheit keys and the celsius values
            // print columns name
            System.out.println(title);
            for (Integer fahreinheit : hashMap.keySet()) 
            {
                // print column value
                // hashmap does not remember the order of the key-value pair inserted, so its print value is in a different order
                System.out.println(Integer.toString(fahreinheit)+"\t\t"+Integer.toString(hashMap.get(fahreinheit)));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }   

}
             
        
           
    

