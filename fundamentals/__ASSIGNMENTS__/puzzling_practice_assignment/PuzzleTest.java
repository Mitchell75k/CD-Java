package fundamentals.__assignments__.puzzling_practice_assignment;

import java.util.Arrays;
public class PuzzleTest {
    
	public static void main(String[] args) {

        System.out.println("\n\n--------getTenRolls Test----------");
		PuzzleJava generator = new PuzzleJava();
		int[] randomRolls = generator.getTenRolls();
		System.out.println("\nTen Rolls Array: " + Arrays.toString(randomRolls)); // print the array returned from the getTenRolls method
        //remember: Arrays.toString() is a method that converts an array to a string
        
		System.out.println("\n\n--------getRandomLetter Test----------");
        char randomLetter = generator.getRandomLetter();
        System.out.println("\nRandom Letter: " + randomLetter); 
	
        System.out.println("\n\n--------generatePassword Test----------");
        String randomPassword = generator.generatePassword();
        System.out.println("\nGenerated Password: " + randomPassword);

        System.out.println("\n\n--------getNewPasswordSet Test----------");
        int length = 5;
        String[] newPasswordSet = generator.getNewPasswordSet(length);
        System.out.println("\nNew Password Set of " + length + ": "  + Arrays.toString(newPasswordSet));

        System.out.println("\n\n--------shuffleArray Test----------");
        int[] arrayToShuffle = {1,2,3,4,5,6,7,8,9,10};
        int[] shuffledArray = generator.shuffleArray(arrayToShuffle);
        System.out.println("\nShuffled Array: " + Arrays.toString(shuffledArray));


    }
}