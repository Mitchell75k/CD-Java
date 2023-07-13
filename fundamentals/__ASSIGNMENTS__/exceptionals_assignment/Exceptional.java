package fundamentals.__ASSIGNMENTS__.exceptionals_assignment;

import java.util.ArrayList;


//Your new PM knows you don't know Java too well. 
//She wants you to familiarize yourself with generics and exceptions and figure out exactly how they work. 
//First, she wants you to make an ArrayList with both numbers and strings in it.

//You will loop through the list and try assigning each item to an int variable. To do this, you will also need to cast your list item as an Integer
//After you have set up this code, try running it. It should throw a ClassCastException. Change the program above to utilize exception handling to print out the error messages
//, the index of the ArrayList where the error occurred, and the value of the object that triggered the error. The program should continue after printing this to the console.

public class Exceptional {
    public static void main(String[] args) {
        
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
    
    //-------OLD CODE BEFORE TRY-CATCH BLOCKS-------
        //for(int i = 0; i < myList.size(); i++) {
        //    Integer castedValue = (Integer) myList.get(i); // when running this old code, we get : ERROR- java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        //    System.out.println(castedValue);
        //}
    
    //-------ADAPTED CODE WITH TRY-CATCH BLOCKS-------
        try { //try to run the code in the try block and if there is an error, run the code in the catch block
            for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i); //this will throw an error if the value is not an Integer
                System.out.println(castedValue);
            }
        } catch (ClassCastException e) { //the expected error is ClassCastException, 
            System.out.println("ERROR ON INDEX: " + myList.indexOf(e));            //grabs the index of the error. We'll get -1 because the error is not in the ArrayList but in the code 
            System.out.println("ERROR MESSAGE: " + e.getMessage());               //grabs the error message
            System.out.println("ERROR VALUE: " + myList.get(myList.indexOf(e))); //grabs the value of the index
        }
    }
}
//-------OUTPUT-------
//ERROR ON INDEX: -1
//ERROR MESSAGE: java.lang.String cannot be cast to java.lang.Integer
//ERROR VALUE: "hello world"