package oop.__assignments__.advanced_oop.abstract_art_assignment;
import java.util.ArrayList; //we will use ArrayLists to store our Art objects and iterate through them to display them
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> Museum = new ArrayList<Art>(); //create an ArrayList of Art objects called Museum. This can hold any object that is a subclass of Art, regardless of the subclass type (Painting, Sculpture, etc.)

        //create some Art objects
        Sculpture herculesSculpture = new Sculpture("Hercules", "Giambologna", "marble", "\nIn this sculpture, Hercules stands tall, displaying a moment of strength.");
        Sculpture davidSculpture = new Sculpture("David", "Michelangelo", "marble", "\nIn this sculpture, David sits, displaying a moment of concentration.");
        Painting banana = new Painting("Banana", "Andy Warhol", "acrylic", "\nIn this painting, Andy Warhol depicts a rotting banana in the palms of an orangutan.");
        Painting monaLisa =new Painting("Mona Lisa", "Leonardo da Vinci", "oil", "\nIn this painting, Leonardo paints Mona Lisa's warm smile, while she sits in front of a mountainous landscape.");
        //add them to the Museum ArrayList
        Museum.add(herculesSculpture);
        Museum.add(monaLisa);
        Museum.add(davidSculpture);
        Museum.add(banana);
        //shuffle the Museum ArrayList and print out the Art objects
        System.out.println("\nWelcome to Mitchell's Museum! Here are some of our featured pieces:------------------------------------------");
        Collections.shuffle(Museum); //shuffle the Museum ArrayList
        for (Art art : Museum) { //loop through the Museum ArrayList and print out each Art object
            art.viewArt();
        }
    }
} //javac oop/__assignments__/advanced_oop/abstract_art_assignment/Museum.java -d oop/__assignments__/advanced_oop/abstract_art_assignment/bin //compile and put the .class files in the bin folder (package) to run
//java -cp oop/__assignments__/advanced_oop/abstract_art_assignment/bin oop.__assignments__.advanced_oop.abstract_art_assignment.Museum //run the program from the bin folder (package)