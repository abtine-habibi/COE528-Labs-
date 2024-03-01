/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Admin
 */
public abstract class AbstractCounter implements Counter {
    protected int value; 
    
   AbstractCounter(){
       this.value = 0; 
   }
    
    public void increment(){
        if (this.value < 9){
            this.value += 1;
        }
        else {
            this.value = 0;
        }
    }
    
    public void decrement(){
        if (this.value > 0){
            this.value -= 1;
        }
        else {
            this.value = 9;
        }
    }
    
    public void reset(){
        this.value = 0; 
    }
    
    @Override
    public String count (){
        return " " + this.value; 
    }
}
