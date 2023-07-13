package fundamentals.__NOTES__.exceptional_handling_notes; 


//exception handling is a way to handle/prevent errors in your code, both potential and unexpected
//there are two types of errors: compile-time errors and runtime errors
//compile-time errors are errors that are caught by the compiler, and will prevent the program from running
//runtime errors are errors that occur while the program is running, and will cause the program to crash
//we can make sure our program doesn't crash by using try-catch blocks for when we expect an error to occur. This is called exception handling


//in this example, we have a friend that is going to deliver a message for us, but we don't know if they will be able to deliver it or not because they might run out of gas (exception)
import java.util.Random;
class OutOfGasException extends Exception{}
class UnreliableFriend {                            //this is just an example of a class that we can use to demonstrate exception handling, it will randomly run out of gas when delivering a message for testing purposes
    public boolean deliverMessage() throws OutOfGasException{
        Random r = new Random();
        boolean hasGas = r.nextBoolean();
        if (hasGas){
            return true;
        }
        throw new OutOfGasException();
    }
}

public class DeliverMessage {
    public static void main(String[] args) {
        UnreliableFriend friend = new UnreliableFriend(); //just an example of a class that we can use to demonstrate exception handling
        try {
                friend.deliverMessage();
                System.out.println("The message was delivered!"); //--IMPORTANT-- try-catch blocks are used to handle exceptions (expected errors)
        } 
        catch (OutOfGasException e) {                                  //we can use multiple catch blocks to handle different types of exceptions
            System.out.println("Hey, uh, so, I ran out of gas..");
            // back-up code for if this exception is encountered here
        }
        
        catch (Exception e) {       //we can also use a generic exception to catch any other exceptions that we didn't account for
            System.out.println("Hey, uh, so, something unexpected happened..");
            // back-up code for if this exception is encountered here
        }
    }
}
//when we run the code we can see either message being printed, depending on if the friend ran out of gas or not. If they did, we are seeing the message that we wrote in the catch block (line 32)