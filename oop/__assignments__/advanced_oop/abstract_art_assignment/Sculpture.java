package oop.__assignments__.advanced_oop.abstract_art_assignment;

public class Sculpture extends Art {
    private String material; //stone, marble, wood, plastic, etc.
    //constructor
    public Sculpture(String title, String author, String material, String description){
        this.title = title;
        this.author = author;
        this.description = description;
        this.material = material;
    }

    //abstract method: viewArt(); its purpose is to print out the sculpture's details
    public void viewArt(){
        System.out.println("\nThis is a " + this.material + " sculpture by " + this.author + " titled " + this.title + ". " + this.description); //assign its member variables in the 
    }
}
