package fundamentals.__ASSIGNMENTS__.cafe_business_logic_assignment;

import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numweeks) {          //this method finds the sum of all numbers from 1 to numweeks
        int sum = 0;                                 // sum = sum of all numbers from 1 to numweeks
        for (int i = 1; i <= numweeks; i++) {       //i = 1-10 (numweeks) 
            sum += i;
        }
        return sum;                              //return sum of all numbers from 1 to numweeks
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) { //for each price in prices
            sum = sum + price;       //add price to sum
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) { 
        for (int i = 0; i <menuItems.size(); i++) {               //for each item in menuItems
            System.out.println((i+1) + ". " + menuItems.get(i)); //print the item number and the item
        }// using .println(i+1) instead of (i) makes the first item be item 1 instead of 0 (formatting purposes)
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String customerName = System.console().readLine(); //readLine() reads a line of text from the console
        System.out.println("Hello " + customerName + ". There are " + customers.size() + " people ahead of you.");
        customers.add(customerName);    //adds customerName to the end of the customers ArrayList
        System.out.println(customers); //prints the customers ArrayList
    }

    //-------------- COULD NOT GET THIS TO WORK --------------
    //add multiple customers at once! Make a method addCustomers in which a barista can enter multiple customers.
    //You can use a while loop and ask the user to type "q" when they are finished entering names.

    //public void addCustomers(ArrayList<String> customers, int numCustomers) {
    //    for (int i = 0; i < numCustomers; i++) { //for each customer in numCustomers
        
    //        // implementing asking the user to type "q" when they are finished entering names, use a while loop
    //        
    //        while (System.console().readLine() != "q") {
    //            System.out.println("Press q when you are finished entering names.");
    //            System.out.println("Please enter names: ");
    //            String customerName = System.console().readLine(); //readLine() reads a line of text from the console
    //            System.out.println("Hello " + customerName + ". There are " + customers.size() + " people ahead of you.");
    //            customers.add(customerName);              //adds customerName to the end of the customers ArrayList
    //            System.out.println(customers);           //prints the customers ArrayList
    //        }
    //    }
//    }


    public void printPriceChart(String productName, double price, int maxNumber) {
        System.out.println(productName);
        for (int i = 1; i <= maxNumber; i++) {
            if (i > 1) {   //if i > 1, print the price with discount of 50 cents
                System.out.println(i + " - " + "$" + (price * i - 0.5));
            } 
            else {      //if i <= 1, print the price without a discount
             System.out.println(i + " - " + "$" + (price * i)); 
            }
        }
    }

    //overloading the displayMenu method to display prices and menu items side by side
        public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> itemPrices) {
            if (menuItems.size() != itemPrices.size()) { //if the size of menuItems and prices are not equal, return false
                return false;
            }
            for (int i = 0; i < menuItems.size(); i++) { //for each item in menuItems
                System.out.println((i + 1) + ". " + menuItems.get(i) + " - - $" + itemPrices.get(i)); //print the item number, item, and price
            }
            return true; //if the size of menuItems and prices are equal, return true
        } 
}