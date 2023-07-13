package fundamentals.__ASSIGNMENTS__.cafe_business_logic_assignment;


import java.util.ArrayList; 

public class TestCafe {
    public static void main(String[] args) {
        
    /* 
    You will need add 1 line to this file to create an instance 
    of the CafeUtil class. 
    Hint: it will need to correspond with the variable name used below..
    */
        CafeUtil appTest = new CafeUtil();
        System.out.println("----- Streak Goal Test -----");
        

        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        //the format specifier %s is used to print a string value (return value of getOrderTotal)
        // \n\n is used to print a new line twice

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>(); //instantiating an ArrayList of Strings called menu
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 2; i++) {
        appTest.addCustomer(customers);
        System.out.println("\n");
        }

        System.out.println("----- Print Price Chart Test-----");
        appTest.printPriceChart("\n Chai Latte Mix", 4.5, 3);
        appTest.printPriceChart("\n Specialty Coaster", 2.0, 5);
        appTest.printPriceChart("\n Zaza latte", 5.0, 4);

        //System.out.println("----- Add Multiple Customers Test-----");
        //appTest.addCustomers(customers, 5);
        //System.out.println(customers);

        System.out.println("----- Display Menu Test-----");
        ArrayList<Double> itemPrices = new ArrayList<Double>();
        itemPrices.add(3.50);
        itemPrices.add(1.50);
        itemPrices.add(4.00);
        itemPrices.add(4.50);
        appTest.displayMenu(menu, itemPrices);
    }
}