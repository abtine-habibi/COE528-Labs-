/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author abtin
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int ticketNumber = 0;

    public Ticket(Passenger p, Flight f, double pr) {
        passenger = p;
        flight = f;
        price = pr;
        ticketNumber++;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger p) {
        passenger = p;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight f) {
        flight = f;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        price = pr;
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }
    
@Override
public String toString() {
    String s = "" + passenger.name + ", Flight " + flight.flightNumber + ", " +
            flight.origin + " to " + flight.destination + ", " +
            flight.departureTime + ", original price: $" + flight.originalPrice +
            ", ticket price: $" + price;
    return s;
}

}


