package coe528.lab1;

public class Flight {
    int flightNumber, capacity, numberOfSeatsLeft;
    double originalPrice;
    String origin, destination, departureTime; 
    
    public Flight (int flight, int cap, double originalP, String or, String dest, String dept ){
        if (or.equals(dest)){
            throw new IllegalArgumentException("Origin and Destination cannot be the same");
        }
        
        flightNumber = flight; 
        capacity = cap;
        originalPrice = originalP;
        origin = or; 
        destination = dest;
        departureTime = dept; 
        numberOfSeatsLeft = cap; 
    }
    
    // Getters
    public int getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    // Setters
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    boolean bookASeat(){
        if (numberOfSeatsLeft <= 0){
            return false;
        }
        else{
            numberOfSeatsLeft--;
            return true; 
        }
    }
    
}
