import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListsHashMaps {
    public static void main (String[] args)
    {
        /*
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] nums = {10, 20, 30, 40, 50};
        
        //cars[1] = "Honda";
        //nums[3] = 15; 
        
        System.out.println(cars[1]);
        System.out.println(nums[3]);
        
        System.out.println("The number of cars in my car array is:  " + cars.length);
    
        for (int i = 0;  i < cars.length; i++)
        {
            System.out.println("cars[" + i + "] = " + cars[i]);
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
        
        for (String car: cars)
        {
            System.out.println(car);
        }
        
        for (int num : nums)
        {
            System.out.println(num);
        }
        
        int[][] my_nums = { {1, 2, 3, 4, 5}, {6, 7, 8} };
        
        for (int i = 0; i < my_nums.length; i++)
        {
            for (int j = 0;  j < my_nums[i].length; j++)
            {
                System.out.println(my_nums[i][j]);
            }
        }
        */
        
        /*  ArrayList   
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");
        
        System.out.println(cars);
        
        cars.set(3, "Mazda");
        
        System.out.println(cars.get(3));
        
        //cars.remove(0);
        System.out.println(cars);
        
        //cars.clear();
        System.out.println(cars);
        
        //System.out.println(cars.get(0));
        
        System.out.println(cars.size());
        
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }
        
        for (String car : cars)
        {
            System.out.println(car);
        }
        
        
        ArrayList <Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(40);
        myNumbers.add(50);
        
        for (int item : myNumbers)
        {
            System.out.println(item);
        }
        
        */
        
        /*  Hashmap  */
        
        //Create a Hashmap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        //Add key and value pairs (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        /*
        System.out.println(capitalCities);
        
        System.out.println(capitalCities.get("England"));
        
        //capitalCities.remove("England");
        //System.out.println(capitalCities);
        
        //capitalCities.clear();
        System.out.println(capitalCities);
        
        System.out.println(capitalCities.size());
        */
        
        for (String key : capitalCities.keySet())
        {
            System.out.println(key);
        }
        
        for (String value : capitalCities.values())
        {
            System.out.println(value);
        }
        
        for (String key : capitalCities.keySet())
        {
            System.out.println("key:  " + key + " value:  " + capitalCities.get(key));
    
        }
        
        
        
    }
}
