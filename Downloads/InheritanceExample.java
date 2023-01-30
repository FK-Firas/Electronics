/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author ChristopherOgden
 */
public class InheritanceExample {

     public static void main(String[] args) {
        Flight incoming = new Flight(35000, 270, 300, 33.640411, -84.419853);
        incoming.turnFlight(90);      // turn 90 degrees (W to N)
        System.out.println(incoming); // outputs "35000/0/300"
        
        CommercialFlight commerceincoming = new CommercialFlight(35000, 270, 300, 33.640411, -84.419853, 1, 100);
        commerceincoming.turnFlight(180);      // this method was inherited from Flight
        System.out.println(commerceincoming); // outputs "Flight #1: 35000/0/300"

    }
    
}
