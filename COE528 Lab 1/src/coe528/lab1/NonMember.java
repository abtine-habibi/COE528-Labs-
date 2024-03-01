/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Admin
 */
public class NonMember extends Passenger {
    
    public NonMember (String n, int a){
        super(n,a); 
    }
    
    public double applyDiscount (double p){
        if (this.age > 65){
            p = 0.9*p;
        }
        
        return p; 
    }
}
