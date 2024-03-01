/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Admin
 */
public class LinkedDigitCounter extends AbstractCounter{
    Counter leftnode = null; 
    
    public LinkedDigitCounter(Counter left){
        super();
        this.leftnode = left;
    }
     @Override
      public void increment(){
        if (this.value < 9){
            this.value += 1;
        }
        else {
            this.value = 0;
            this.leftnode.increment();
        }
    }
    @Override
    public void decrement(){
        if (this.value > 0){
            this.value -= 1;
        }
        else {
            this.value = 9;
            this.leftnode.decrement();
        }
    }
}
