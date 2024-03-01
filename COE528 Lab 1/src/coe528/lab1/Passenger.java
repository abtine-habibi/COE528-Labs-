/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author abtin
 */
abstract class Passenger {
    String name;
    int age;

    public Passenger(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
    
    abstract double applyDiscount(double p); 
    
}

