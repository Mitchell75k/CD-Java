package oop.__assignments__.oop_basics.barista_challenge;
public class TestOrders {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Mitchell");
        Order order4 = new Order("Ashy");

    
        //Instantiating Items:
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("Latte", 3.0);
        Item item3 = new Item("Frappe", 6.5);
        Item item4 = new Item("Cappuccino", 4.0);

        //adding items to the orders
        //adding items to order1
        order1.additem(item1); //adds Mocha to order1, adding 3.5 to order1.total.
        order1.additem(item4); //adds Cappuccino to order1, adding 4.0 to order1.total
        System.out.println(order1.getStatusMessage());
        System.out.println("\n" + order1.getName()+ "'s Order Total: " + order1.getOrderTotal());
        order1.displayOrder(); //no need system.out.println because the method already has a print statement
        order1.setReady(true); //changes order1.ready from false to true
        System.out.println("\n" + order1.getStatusMessage());

        //adding items to order2
        order2.additem(item1); 
        order2.additem(item2); 
        order2.displayOrder();

        //adding items to order3
        order3.additem(item3); 
        order3.additem(item4);
        order3.displayOrder();

        //adding items to order4
        order4.additem(item2);
        order4.additem(item2); 
        order4.displayOrder(); 
    }
}
