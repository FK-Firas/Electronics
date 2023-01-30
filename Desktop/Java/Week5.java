

package com.mycompany.week5;


public class Week5 {

    public static void main(String[] args) {
        Car car1 = new Car();
     
     
     Car car2 = new Car(2021,"Ford",20);
     
     
     System.out.println(car1);
     System.out.println(car2);
     
       
     System.out.println("Accelerating car1 ........"); 
     car1.accelerate();
     System.out.println(car1.getSpeed());
     
     System.out.println("Braking car1 ..............");   
     car1.brake();
     System.out.println(car1.getSpeed());
     
     System.out.println("Accelerating car2 ........"); 
     car2.accelerate();
     System.out.println(car2.getSpeed());
     
     System.out.println("Braking car2 ..............");   
     car2.brake();
     System.out.println(car2.getSpeed());
     
     
     System.out.println("Car 1 speed : ");
     car1.setSpeed(50);
     
     System.out.println(car1.getSpeed());
     
      System.out.println(car1);
     
    }
}
    

