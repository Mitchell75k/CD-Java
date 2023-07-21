package oop.__assignments__.advanced_oop.abstract_art_assignment;

public class Painting extends Art { //Painting is a subclass of Art
    //this class must implement the abstract method viewArt() because it is a subclass of Art (which is abstract). 
    //And because its a subclass of an abstract class, it must be declared abstract as well (or implement all abstract methods) to be able to be instantiated.
    //constructor
    public Painting (String title, String author, String paintType, String description) {
        this.title = title;
        this.author = author;
        this.paintType = paintType;
        this.description = description;
    }
    private String paintType; //oil, watercolor, acrylic, etc.

    //abstract method: viewArt(); its purpose is to print out the painting's details
    public void viewArt() {
        System.out.println("\nThis is a " + this.paintType + " painting by " + this.author + " titled " + this.title + ". " + this.description);
    }
}
