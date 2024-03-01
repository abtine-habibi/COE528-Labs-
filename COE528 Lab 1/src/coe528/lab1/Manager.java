/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Manager {
    ArrayList<Flight> flights = new ArrayList<Flight>(); 
    
    public void createFlights(){
        flights.add(new Flight(1, 300, 500,"YYZ", "ATL", "Saturday 7:30am" ));
        flights.add(new Flight(2, 250, 450, "YYZ", "LAX", "Sunday 10:00am"));
        flights.add(new Flight(3, 200, 400, "JFK", "ORD", "Monday 1:45pm"));
        flights.add(new Flight(4, 350, 600, "SFO", "MIA", "Wednesday 5:15pm"));
        flights.add(new Flight(5, 280, 480, "LGA", "DFW", "Friday 8:00am"));
        flights.add(new Flight(6, 320, 550, "ORD", "LAS", "Sunday 3:30pm"));
        flights.add(new Flight(7, 270, 470, "ATL", "DEN", "Thursday 11:45am"));
    }
    
    public void displayAvaliableFlights(String o, String d){
        ArrayList<String> avaliable = new ArrayList<String>();
        for (int i = 0; i < flights.size(); i++ ){
            if (flights.get(i).origin == o && flights.get(i).destination == d && flights.get(i).numberOfSeatsLeft != 0){
               avaliable.add("Flight Number: " + flights.get(i).flightNumber + " is available, it goes from " +
        flights.get(i).origin + " to " + flights.get(i).destination +
        ", it departs at " + flights.get(i).departureTime + " and costs $" + flights.get(i).originalPrice);
               break;

            }
        }
        if (avaliable == null){
                System.out.println("No Flights with the given origin and destination are avaliable ");
            
        }
         for (int i = 0; i < avaliable.size(); i++){
             System.out.println(avaliable.get(i));
         }
    }
    
    public Flight getFlight(int flightNumber) {
        Flight available = null; 

        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).flightNumber == flightNumber) {
                available = flights.get(i);
                break;
            }
        }
        return available;
    }
    
   public void bookSeat(int flightNumber, Passenger p) {
    Flight selectedFlight = getFlight(flightNumber);

    if (selectedFlight != null) {
        boolean bookingSuccessful = selectedFlight.bookASeat();

        if (bookingSuccessful) {
           if (p instanceof Member){
               p.applyDiscount(selectedFlight.originalPrice);
           }
           else if(p instanceof NonMember){
               p.applyDiscount(selectedFlight.originalPrice);
           }
        }
         
    }
}
   
   public static void main(String[] args) {
    Manager manager = new Manager();
    Member member = new Member("John Smith", 71, 6);
    manager.createFlights();
    manager.displayAvaliableFlights("YYZ", "ATL");
    manager.getFlight(3);
    
}



}

