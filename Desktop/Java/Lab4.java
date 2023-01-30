

package com.mycompany.lab4;


import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Lab4 { 
    public static void main(String[] args) {


ArrayList <String> keys; 
ArrayList <String> values; 
HashMap <String, String> row; 

String line, header;



ArrayList data = new ArrayList < > ();
// Create ArrayList to hold HashMaps for all rows

try {

Scanner in = new Scanner(Paths.get("C:\\Users\\a0135\\Documents\\NetBeansProjects\\Lab4\\src\\main\\java\\com\\mycompany\\lab4\\lab4_input.csv"));
 
header = in .nextLine();
keys = new ArrayList(Arrays.asList(header.split(",")));


while ( in .hasNextLine()) {

line = in .nextLine();

row = new HashMap <> ();

/* Split comma-separated values into ArrayList */
values = new ArrayList(Arrays.asList(line.split(",")));

/* Populate map, using key names from the header row */
for (int i = 0; i < keys.size(); i++) {
row.put(keys.get(i), values.get(i));
}

/* Add map to data container */
data.add(row);
}


System.out.println("Number of records read: " + data.size());


in .close();




final int dataLimit = 5;

HashMap<String,String> currentRowData = null;

for(int index = 0; index < data.size();index++){

if(index == dataLimit){
break;
}

System.out.println();


currentRowData = (HashMap<String,String>)data.get(index);


String firstName = currentRowData.get("FirstName");
String midInit = currentRowData.get("MiddleInitial");
String lastName = currentRowData.get("LastName");
String streetAddr = currentRowData.get("StreetAddress");
String city = currentRowData.get("City");
String state = currentRowData.get("State");
String zipCode = currentRowData.get("ZipCode");


System.out.println(firstName+" "+midInit+" "+lastName);
System.out.println(streetAddr);
System.out.println(city+", "+state+" "+zipCode);

}

}catch (Exception e) {
System.err.println(e.toString());
}

}

}