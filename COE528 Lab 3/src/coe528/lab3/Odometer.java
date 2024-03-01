/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab3;

/**
 *
 * @author Admin
 */
public class Odometer implements Counter{
    
    int numberOfDigits;
    Counter digits[]; 
    
    public Odometer(int n){
        try{
            this.numberOfDigits = n;
            digits = new Counter[n];
            digits[0] = new DigitCounter(); //First Entry has to be a digit counter
            
            for (int i = 1; i < n; i++){ //The rest of the indices are linked
                digits[i] = new LinkedDigitCounter(digits[i-1]);
            }
        }
        
        catch (IllegalArgumentException e){
            System.out.println("The number of odometer digits entered was incorrect");
        }
    }
    
    @Override
    public String count()
    {
        String output = "";
        Boolean flag = false; // false until non-zero found
        for(int i=0; i < numberOfDigits; i++)
        {
            if(digits[i].count().equals("0") && flag == false)
            {
                
                output += "-";
            }
            else
            {
                flag = true;
                output += digits[i].count();
            }
        }
        return output;
    }
    
    @Override
    public void increment()
    {
        digits[numberOfDigits-1].increment();
        //increments right-most digit
    }
    
    public void decrement()
    {
        digits[numberOfDigits-1].decrement();
        //decrements right-most digit 
    }
    
    //Reset the counter
    @Override
    public void reset()
    {
        for(int i =0; i<numberOfDigits; i++)
        {
            digits[i].reset();
            //resets all digits of the odometer
        }
    }  
    
    
}
