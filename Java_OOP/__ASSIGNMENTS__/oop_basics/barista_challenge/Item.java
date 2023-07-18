package Java_OOP.__assignments__.oop_basics.barista_challenge;

public class Item {
    private String name;
    private double price;
    public Item(String name, double price) { //constructor
        this.name = name;
        this.price = price;
    }
    public String getName() { //getter
        return name;
    }
    public double getPrice() { //getter
        return price;
    }
    public void setName(String name) { //setter
        this.name = name;
    }
    public void setPrice(double price) { //setter
        this.price = price;
    }
}

