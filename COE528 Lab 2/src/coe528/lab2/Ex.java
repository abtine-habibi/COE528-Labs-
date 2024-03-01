/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab2;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Ex {
    
    //Requires: two non null strings 
    //Modifies: lower cases strings and removes space 
    //effects: determines whether a word is an anagram of another 
    public static boolean areAnagrams(String a, String b){
      
        a = a.toLowerCase();
        b = b.toLowerCase();

        
        a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");

        char[] word1 = a.toCharArray(); 
        char[] word2 = b.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);
    
    return Arrays.equals(word1, word2);
}

    
    public static void main(String[] args){
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("Hello", "World"));
        System.out.println(areAnagrams("Dormitory", "Dirty room"));
    }
}
