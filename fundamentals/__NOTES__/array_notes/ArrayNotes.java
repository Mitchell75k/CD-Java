import java.util.Arrays;
import java.util.ArrayList;

public class ArrayNotes { 
    public static void main(String[] args){
        //How to create a basic ARRAY:
        String[] fruits = {"banana", "pear", "papaya", "kiwi"}; //size of 4, index of 0-3
        // To swap the value at index 0 and index 3
        String temp = fruits[0];{// assigns temp to "banana"
        fruits[0] = fruits[3]; // { "kiwi", "pear", "papaya", "kiwi"}
        fruits[3] = temp; // { "kiwi", "pear", "papaya", "banana"}
        System.out.println(fruits); // prints the memory location of the array
        System.out.println(Arrays.toString(fruits)); // prints the array (must import java.util.Arrays;) 
        
        //or else you'd have to loop through the array like this:
        for (int i = 0; i < fruits.length; i++){ // prints the array using a for loop
            System.out.println(fruits[i]);
        }
        System.out.println(fruits[0]); // prints a single value at the index 0

        int[] numbers = {2, 4, 12, 7, 23, 44, 5, 9, 7, 11, 10, 3};
        // Use the numbers array to print the following sums: 9, 56, 24, 100
        // The first one (9) has been done for you
        System.out.println(numbers[0] + numbers[3]);
        System.out.println(numbers[5] + numbers[2]);
        System.out.println(numbers[2] + numbers[2]);
        System.out.println(numbers[5] + numbers[5] + numbers[2]);
        }
//-----------------------------------------------------------------------------------------------
        //How to create an ARRAYLIST: (first import java.util.ArrayList;)
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        // we are creating an instance of the ArrayList class to store integers, 'new' is a keyword that creates a new instance of a class
        // we are assigning the instance to the variable myArray
        // we are using the <> to specify the type of data that will be stored in the ArrayList, in this case, integers - this is called a generic
        //ArrayList's generic type must be a class, not a primitive type. For ex, we can't use int, but we can use Integer.
        // we are using the () to call the constructor of the ArrayList class
        //ArrayLists are used when we don't know how many items we will need to store, 
        //or when we need to add or remove items from the middle of the list

        //How to MANIPULATE an ArrayList:
        myArray.add(10); //we use setter methods to add values to an ArrayList, in this case '.add()'
        myArray.add(11);
        //to retrieve a value from an ArrayList we need to use a getter method, in this case '.get()'
        Integer num = myArray.get(1);                    //we are retrieving the value at index 0 and storing it in 'num'
        System.out.println("Arraylist Value: " + myArray.get(0)); //prints 10
        System.out.println("Arraylist Value: " + num);       //prints 11
        System.out.println("Full Arraylist: " + myArray);   //prints [10, 11], we don't need to use Arrays.toString() or a getter method
        
        //To change a value in an ArrayList we use a setter method, in this case '.set()'
        myArray.set(0, 9);                   //we are changing the value at index 0 to 9; myArray is now [9, 11]
        System.out.println("New Arraylist Value: " + myArray.get(0)); //prints 9

        //What if we want an ArrayList of multiple data types? We can use an ArrayList of type <Object>:
        ArrayList<Object> myArray2 = new ArrayList<Object>();
        myArray2.add(10);
        myArray2.add("Hello");
        myArray2.add(new ArrayList<Integer>());                               //we can even add an ArrayList to an ArrayList 
        myArray2.add(12.5);                                                //to create a 2D ArrayList (an ArrayList of ArrayLists)
        System.out.println("Full Multi-valued Arraylist: " + myArray2);     //prints [10, "Hello", [], 12.5]
    }   
}
