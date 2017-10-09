/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assigments;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class RangeBetweenZeros {
    
    @SuppressWarnings("empty-statement")
    public static void main (String[] args) {
        
        ArrayList<Integer>arrayNumbers = new ArrayList<>();
        
        arrayNumbers.add (7);
        arrayNumbers.add (2);
        arrayNumbers.add (0);
        arrayNumbers.add (0);
        arrayNumbers.add (4);
        arrayNumbers.add (0);
        arrayNumbers.add (9);
        arrayNumbers.add (0);        
        arrayNumbers.add (6);                
        arrayNumbers.add (4);                        
        arrayNumbers.add (8);   
        
        System.out.println ("Example 1 of RangeBetweenZeros function");
        System.out.println ("List of integers......: " + arrayNumbers);
        System.out.println ("Range between zeros...: " + rangeBetweenZeros(arrayNumbers));
        
        arrayNumbers.clear();
        
        arrayNumbers.add (1);
        arrayNumbers.add (2);
        arrayNumbers.add (3);
        
        System.out.println ("\nExample 2 of RangeBetweenZeros function");
        System.out.println ("List of integers......: " + arrayNumbers);
        System.out.println ("Range between zeros...: " + rangeBetweenZeros(arrayNumbers));

        arrayNumbers.clear();
        
        arrayNumbers.add (0);
        arrayNumbers.add (1);
        arrayNumbers.add (2);
        
        System.out.println ("\nExample 3 of RangeBetweenZeros function");
        System.out.println ("List of integers......: " + arrayNumbers);
        System.out.println ("Range between zeros...: " + rangeBetweenZeros(arrayNumbers));
        
        
    }
    
       
    public static int rangeBetweenZeros ( ArrayList<Integer> arrayNumbers) {
        
        int first = 0;
        int end = 0;
        int nr_times = 0;
        
        // first
        for ( int i = 0; i < arrayNumbers.size(); i++) {
            if ( arrayNumbers.get(i) == 0 ) {
                first = i;
                nr_times++;
                break;
            }            
        }
        
        // final
        for ( int i = arrayNumbers.size() - 1; i >= 0; i--) {
            if ( arrayNumbers.get(i) == 0 ) {
                end = i;
                nr_times ++;
                break;
            }            
        }
        
        if ( nr_times  > 1 ) {
            return (end - first + 1);
            
        } else { 
            return nr_times;
        }
        
    }
}
