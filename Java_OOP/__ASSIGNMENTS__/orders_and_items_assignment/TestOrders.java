package Java_OOP.__ASSIGNMENTS__.orders_and_items_assignment;
//javac Java_OOP/__ASSIGNMENTS__/orders_and_items_assignment/TestOrders.java
//java Java_OOP/__ASSIGNMENTS__/orders_and_items_assignment/TestOrders
public class TestOrders {
    public static void main(String[] args) {

    
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 3.0;
        
        Item item3  = new Item();
        item3.name = "Frappe";
        item3.price = 6.5;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 4.0;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

    //adding items to the orders
        //adding items to order1
        order2.items.add(item1); //adds Mocha to order1, adding 3.5 to order2.total.
        order2.items.add(item2); //adds Latte to order1, adding 3.0 to order2.total
        order2.total += item1.price + item2.price; //adds 3.5 + 3.0 to order2.total, which is 6.5

        //Noah orders a Capuccino
        order3.items.add(item4); //adds Frappe to order3
        order3.total += item4.price; //adds 6.5 to order3.total, which is 6.5

        //Sam orders a Latte
        order4.items.add(item2); //adds Latte to order4
        order4.total += item2.price; //adds 3.0 to order4.total, which is 3.0

        //cinhduri's order is ready
        order1.ready = true; //changes order1.ready from false to true

        //Sam orders 2 more Latte's
        order4.items.add(item2); //adds Latte to order4
        order4.items.add(item2); //adds another Latte to order4
        order4.total += item2.price * 2; //adds 6.0 to order4.total, which is 9.0

        //Jimmy order is ready
        order2.ready = true; //changes order2.ready from false to true

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Order Name: %s\n", order1.name);
        System.out.printf("%s's Order Status- Ready?: %s\n", order1.name, order1.ready);
        System.out.printf("%s's Order Total: %s\n\n", order1.name, order1.total);

        System.out.printf("%s's Order Total: %s\n", order2.name, order2.total); //order2.total is a %s because it's a Double, not a double
        System.out.printf("%s's Order Status- Ready?: %s\n\n", order2.name, order2.ready);

        System.out.printf("%s's Order Total: %s\n", order3.name, order3.total);
        System.out.printf("%s's Order Status- Ready?: %s\n\n", order3.name, order3.ready);

        System.out.printf("%s's Order Total: %s\n", order4.name, order4.total);
        System.out.printf("%s's Order Status- Ready?: %s\n\n", order4.name, order4.ready);
    }
}