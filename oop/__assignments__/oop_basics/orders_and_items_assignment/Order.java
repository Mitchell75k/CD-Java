package oop.__assignments__.oop_basics.orders_and_items_assignment;
import java.util.ArrayList;

public class Order {
    String name;
    double total; //default value is 0.0
    //Double vs double?: Double is a class, double is a primitive type. we use Double when we want to use methods on the variable, like .toString(), 
    //and double when we want to do math on the variable, like +, -, *, /, etc.
    boolean ready; //default value is false 
    ArrayList <Item> items = new ArrayList<Item>();
    //we are creating an instance of the ArrayList class to store Items, 'new' is a keyword that creates a new instance of a class

}
