/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Admin
 */
public class Member extends Passenger {
    private int yearsOfMembership; 
    
    public Member (String n, int a, int years){
        super(n,a); 
        this.yearsOfMembership = years;
    }
    
    public double applyDiscount(double p){
       
        if (this.yearsOfMembership > 5){
            p = 0.5*p;
        }
        else if(this.yearsOfMembership <= 5 && this.yearsOfMembership > 1){
            p = p*0.9;
        }
        
        return p;
    }
}
