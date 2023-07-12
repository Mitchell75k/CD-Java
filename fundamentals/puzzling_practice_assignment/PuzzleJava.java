package fundamentals.puzzling_practice_assignment;
import java.util.Random; // random is a class used for generating random numbers


public class PuzzleJava {
    //the type for a method that would return an array of integers is: public static int[] methodName() {}
    //instead of using static in 'public static int[] methodname()' , we could use 'public int[] methodname()'
    //but then we would have to create an instance of the class known as: PuzzleJava puzzle = new PuzzleJava();
    //and then call the method using the instance: puzzle.methodName();
    //but since we are using static, we can call the method directly: PuzzleJava.methodName();
    //static methods are methods that belong to the class and not to the object of the class
    //static methods can be called without creating an instance of the class

    public int[] getTenRolls() { //int[] refers to the type that the method returns
        Random randmachine = new Random(); 
        //random is a class used for generating random numbers, we will use this to generate random numbers

        int[] rndmRolls = new int[10];
        //int[] refers to the type of the array, this array will hold 10 integers
        
        //create a for loop that will iterate through the array and assign a random number to each index
        for ( int i = 0; i < rndmRolls.length; i++ ) {  
            rndmRolls[i] = randmachine.nextInt(20) + 1; 
            //nextInt(20) generates a random number between 0 and 19, +1 makes it between 1 and 20 by adding 1 to the random number
        }
        return rndmRolls;
    }

    public  char getRandomLetter() {
        Random randmachine = new Random();
        char[] alphabet= "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
        //toCharArray() converts a string to a character array, ex: "abc" -> ['a', 'b', 'c'], its part of the String class
        char rndmLetter = alphabet[randmachine.nextInt(26)];
        //nextInt(26) generates a random number between 0 and 25, which is the length of the alphabet array
        // System.out.println(rndmLetter); //prints the letter, but we're already printing in PuzzleTest.java
        return rndmLetter;
    }

    public  String generatePassword() {
        String password = ""; //empty string
        for (int i = 0; i < 8; i ++) { //iterate 8 times, we are looping through the string
            password += getRandomLetter(); //add a random letter to the string
        }
        return password;
    }

    public  String[] getNewPasswordSet(int length) {
        //create an array of strings that will hold however many passwords we want passed in as an argument
        String[] passwordSet = new String[length]; 
        for (int i = 0; i < length; i++ ) {       //iterate through the array "passwordSet"
            passwordSet[i] = generatePassword(); //add a password to the array
        }
        return passwordSet;
    }

    public  int[] shuffleArray(int[] array){
        Random randmachine = new Random();

        for (int i = 0; i < array.length; i++) { //iterate through the array
            int randomIndexToSwap = randmachine.nextInt(array.length);
            //.nextInt(array.length) generates a random number between 0 and the length of the array
            int temp = array[randomIndexToSwap];
            //temp is a temporary variable that will hold the value of the random index
            array[randomIndexToSwap] = array[i];
            //the random index will be assigned the value of the current index
            array[i] = temp;
            //the current index will be assigned the value of the random index
        }
        return array;
    }
}
