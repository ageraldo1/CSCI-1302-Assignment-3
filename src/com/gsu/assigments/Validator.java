/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assigments;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Alexandre
 */
public class Validator {
    
    public static void main (String[] args) {
        validateRangeBetweenZeroes();
        validateRemoveInRange();
        validateStutter();
        validateRemoveShorterStrings();
        validateMarkLength4();
        validateReverse3();
        
    }
    
    private static int rangeBetweenZeroes ( ArrayList<Integer> arrayNumbers) {
        
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
    
    private static void validateRangeBetweenZeroes() {
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
        System.out.println ("Range between zeros...: " + rangeBetweenZeroes(arrayNumbers));
        
        arrayNumbers.clear();
        
        arrayNumbers.add (1);
        arrayNumbers.add (2);
        arrayNumbers.add (3);
        
        System.out.println ("\nExample 2 of RangeBetweenZeros function");
        System.out.println ("List of integers......: " + arrayNumbers);
        System.out.println ("Range between zeros...: " + rangeBetweenZeroes(arrayNumbers));

        arrayNumbers.clear();
        
        arrayNumbers.add (0);
        arrayNumbers.add (1);
        arrayNumbers.add (2);
        
        System.out.println ("\nExample 3 of RangeBetweenZeros function");
        System.out.println ("List of integers......: " + arrayNumbers);
        System.out.println ("Range between zeros...: " + rangeBetweenZeroes(arrayNumbers));
        
    }
    
    private static void removeInRange(ArrayList<String> sentence, String begin, String end) {
        
        for ( int i = 0; i < sentence.size(); i++) {
            if ( sentence.get(i).compareTo(begin) > 0 && sentence.get(i).compareTo(end) < 0 ) {
                sentence.remove(i);
                i=0;
            }
        }
        
        
        
        
    }
    
    private static void validateRemoveInRange() {
        
        ArrayList<String> sentence = new ArrayList<>();
        
        sentence.addAll (Arrays.asList("to", "be", "or", "not", "to", "be", "that", "is", "the", "question"));
        
        System.out.println ("Example of removeInRange method");
        System.out.println ("Sentence array before method execution....: " + sentence);
        
        removeInRange(sentence, "free", "rich");
                
        System.out.println ("Sentence array after method execution.....: " + sentence);
        
    }
    
    private static void stutter (ArrayList<String> phrase, int k ) {
        
        ArrayList<String> temp = new ArrayList<>();
        
        if ( k > 0 ) {
            for (String word : phrase) {
                for ( int i = 0; i < k; i++) {
                    temp.add(word);
                }
            }
        }
        
        phrase.clear();
        phrase.addAll(temp);
        
    }
    
    private static void validateStutter() {
        
        ArrayList<String> phrase = new ArrayList<>();
        
        phrase.addAll(Arrays.asList("how", "are", "you?"));
        
        System.out.println ("Example of stutter method");
        System.out.println ("Sentence array before method execution....: " + phrase);
        
        stutter(phrase, 3);
                
        System.out.println ("Sentence array after method execution.....: " + phrase);
        
    }
    
    private static void removeShorterStrings(ArrayList<String> pair) {
        
        ArrayList<String> temp = new ArrayList<>();
        
        int nr_pair = 0;
        String first = "";
        String last = "";
        
         for (String word : pair) {
             
             if ( nr_pair == 0 ) {
                 first = word;
                 nr_pair++;
                 
             } else if ( nr_pair == 1) {
                 last = word;                 
                 nr_pair++;
             }
             
             
             if ( nr_pair > 1) {                 
                 if ( first.length() == last.length() ) {
                     temp.add (last);
                     
                     
                 } else { 
                     if ( first.length() > last.length() ) {
                         temp.add (first);
                     
                    } else { 
                        temp.add (last);
                    }  
                 
                    nr_pair = 0;
                    first = "";
                    last = "";
                 }
             }
         }
         
         
         // odd list
         if ( first.length() > 0 && last.length() == 0 ) temp.add(first);
         
         pair.clear();        
         pair.addAll(temp);
    }
    
    private static void validateRemoveShorterStrings() {

        ArrayList<String> phrase = new ArrayList<>();
        
        
        phrase.addAll(Arrays.asList("four", "score", "and", "seven", "years", "ago", "our"));
        
        System.out.println ("Example of removeShorterStrings method");
        
        System.out.println ("Sentence array before method execution....: " + phrase);
        removeShorterStrings(phrase);
        System.out.println ("Sentence array after method execution.....: " + phrase);

        phrase.clear();
        phrase.addAll(Arrays.asList("four", "score", "and", "seven", "years", "ago", "our", "life"));
        System.out.println ("Sentence array before method execution....: " + phrase);
        removeShorterStrings(phrase);
        System.out.println ("Sentence array after method execution.....: " + phrase);
        

        phrase.clear();
        
        phrase.addAll(Arrays.asList("four", "1234"));
        System.out.println ("Sentence array before method execution....: " + phrase);
        removeShorterStrings(phrase);
        System.out.println ("Sentence array after method execution.....: " + phrase);
        
    }

    private static void markLength4(ArrayList<String> phrase) {
        ArrayList<String> temp = new ArrayList<>();
        
        for (String word : phrase) {
            
            if ( word.length() == 4) {
                temp.add("****");
            }
            
            temp.add(word);            
        }
        
         phrase.clear();        
         phrase.addAll(temp);
        
    }

    private static void validateMarkLength4() {
        ArrayList<String> phrase = new ArrayList<>();
        
        
        phrase.addAll(Arrays.asList("this", "is", "lots", "of", "fun", "for", "Java", "coders"));
        
        System.out.println ("Example of markLength4 method");
        
        System.out.println ("Sentence array before method execution....: " + phrase);
        markLength4(phrase);
        System.out.println ("Sentence array after method execution.....: " + phrase);
        
    }
    
    private static void reverse3(ArrayList<Integer> list) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();

        int cycle = 0;
        
        for ( int i = 0; i < list.size(); i++) {
            
            if ( cycle == 2 ) {
             
                temp.add(list.get(i));
                temp.add(pair.get(1));
                temp.add(pair.get(0));
                
                cycle = 0;
                pair.clear();
                
            } else { 
                pair.add(list.get(i));
                cycle++;
            }
        }
        
        if ( pair.size() > 0 ) temp.addAll(pair);
        
        list.clear();        
        list.addAll(temp);
        

    }
    
    private static void validateReverse3() {
        ArrayList<Integer> list = new ArrayList<>();
        
        
        list.addAll(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8));
        
        System.out.println ("Example of reverse3 method");
        
        System.out.println ("Sentence array before method execution....: " + list);
        reverse3(list);
        System.out.println ("Sentence array after method execution.....: " + list);
        
    }
}
