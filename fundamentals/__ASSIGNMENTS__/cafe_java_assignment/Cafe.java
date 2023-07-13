
public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", your total is $";
        
        // Menu variables (add yours below)
        Double dripCoffee = 3.5;
        Double latte = 4.5;
        Double cappuccino = 5.0;
        
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Jimmy";
        String customer3 = "Noah";
        String customer4 = "Sam";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        
        //APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(isReadyOrder1 ? customer1 + readyMessage : customer1 + pendingMessage);
        
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(customer3 + displayTotalMessage + cappuccino);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println(isReadyOrder4 ? customer4 + displayTotalMessage + (latte + latte) : customer4 + pendingMessage);
        
        System.out.println(customer2 + displayTotalMessage + (latte - dripCoffee));
    }
}
