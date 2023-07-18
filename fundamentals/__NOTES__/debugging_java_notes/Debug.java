package fundamentals.__notes__.debugging_java_notes;

import java.util.ArrayList;

public class Debug {
//Simple Java Program to demonstrate how to debug a program in Eclipse:

//This program will remove all snacks that start with the letter A from the ArrayList
//The program has a bug, it will not remove all snacks that start with the letter A because the size of the ArrayList changes
//So when the ArrayList shrinks, the loop will skip over the next snack "Almonds", and will not remove it since it is now at index 1 and not 2
//Here we are demonstrating how to debug using print statements


    public static void main(String[] args){
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

        System.out.println(snacks);

        for(int i=0; i<snacks.size(); i++) {
            //we are using this print statement to see what the value of i and the snack at index i is
            System.out.println(String.format("i = %d AND snack = %s", i, snacks.get(i)));

            if(snacks.get(i).charAt(0) == 'A') {
                //we are to see what the value of i and the snack at index i is when we remove it
                System.out.println(String.format("i = %d AND we are removing %s", i, snacks.get(i)));
                snacks.remove(i);
            }
        }
        System.out.println(snacks); //now when we print the ArrayList, we can see that "Almonds" was not removed since it was skipped over

        //now that we know what the bug is, we can fix it by taking a step back by adding "i--" to the if statement, or by iterating backwards all together
        for(int i=0; i<snacks.size(); i++) { // or we can use: for(int i=snacks.size()-1; i>=0; i--) to iterate backwards 
            if(snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
                --i;
            }
        }
        System.out.println(snacks); //now when we print the ArrayList, we can see that "Almonds" was removed, even if we were to only use the loop starting from line 36
        
        //we can then remove the print statements that we used to debug the program, but will leave them here for reference
    }
}

