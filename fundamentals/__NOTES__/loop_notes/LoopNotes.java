package fundamentals.__NOTES__.loop_notes;

import java.util.ArrayList;

public class LoopNotes {
    /**
     * @param args //this refers to the command line arguments that are passed into the program
     */
    public static void main(String[] args) { 

        // While Loop: Used when you don't know how many times you want to loop
        int i = 0;                   //this is the starting point of the loop
        while (i < 7) {             // while this condition is true, run the code block
            System.out.println("While loop iteration: " + i);
            i++;
        }

        // For Loop: Used when you know how many times you want to loop
        for (int j = 0; j < 7; j++) {            // for (starting point; condition; increment)
            System.out.println("For loop iteration: " + j);
        }

        // For Each Loop: Used to iterate over an array or collection
        int[] myArray = { 1, 3, 5, 7, 9 };            
        for (int num : myArray) {                                   // for (type variable : array/collection), 
            System.out.println("For each loop iteration: " + num); //to increment by 1, use num++ like: for (int num : myArray) { num++; }
        }                                                         //this is known as an enhanced for loop, where the index is not needed
                                                                 //You wouldn't need enhanced for loops for ArrayLists, since they have built in methods
        
        //For looping through an ArrayList:
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int ind = 0; ind < dynamicArray.size(); ind++){  //.size() returns the length of the arraylist, just like .length() for arrays
            System.out.println(dynamicArray.get(ind)); //this gets each index value of the arraylist
        } 
        // Common ArrayLists methods: 
        //.add(), .remove(), .size(), .get(), .set(), .indexOf(), .clear(), .isEmpty(), .contains(), .toArray(), 
        //.sort(), .equals(), .lastIndexOf(), .subList(), .toString(), .hashCode(), .clone(), .ensureCapacity(), 
        //.trimToSize(), .replaceAll(), .retainAll(), .removeIf(), .forEach(), .spliterator(), .stream(),  
        //.iterator(), .of(), .copyOf(), .copyOfRange(), .fill(), .binarySearch(), .parallelStream(), 
        //.asList(), .reverse(), .swap(), .shuffle(), .rotate(), .replaceAll(), .listIterator()

        // Do While Loop: Used when you want to run the loop at least once
        int k = 0;                  // starting point of the loop
        do {                       // do this code block while this condition is true
            System.out.println("Do while loop iteration: " + k);
            k++;                 // incrementation 
        } while (k < 7);        // the conditional 

        // Break: Used to exit a loop
        for (int l = 0; l < 7; l++) {    // for (starting point; condition; increment)
            if (l == 3) {               // if this condition is true, break out of the loop
                break; 
            }
            System.out.println("Break loop iteration: " + l);
        }

        // Continue: Used to skip the current iteration of a loop
        for (int m = 0; m < 7; m++) {      // for (starting point; condition; increment)
            if (m == 3) {                 // if this condition is true, skip this iteration of the loop and continue to next iteration
                continue;    
            }
            System.out.println("Continue loop iteration: " + m);
        }

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Use a for loop to print all odd numbers on the same line
        // Expected output: 13579
        for (int n = 0; n < numbers.length; n++){
            if (numbers[n] % 2 != 0){          //if the number is not divisible by 2, it is odd
                System.out.print(numbers[n]); //print the number; output: 13579 
            }
        }
    }
}

