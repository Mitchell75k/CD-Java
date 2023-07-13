package fundamentals.__ASSIGNMENTS__.alfred_bot_assignment;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod) {         //example of method overloading
        return String.format("Hello %s. Lovely to see you this %s.", name, dayPeriod);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date(); //here we are creating a new instance of the Date class to get the current date, which is imported above
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) { //this method takes in a string and returns a string
        if (conversation.indexOf("Alexis") > -1) 
        {return "Right away, sir. She certainly isn't sophisticated enough for that.";}
        
        else if (conversation.indexOf("Alfred") > -1)
        {    return "At your service. As you wish, naturally.";}
        
        else 
        {return "Right. And with that I shall retire.";}
    }
    
}
