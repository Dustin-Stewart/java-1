import java.util.*;
/**
@author Dustin Stewart
@version 2/22/18
*/
/**
Public class Dog is an extension of class MyObservable. It is the super class 
of any dog object built and is observable by nature meaning that it updates 
any observer object observing it when it changes. In this case it poops.
*/
public class Dog extends MyObservable {

    private String name;
    private boolean hasPooped;
/**
The constructor simply assigns each instance of dog a name.
@param name - takes in a String representing a name.
*/
    public Dog(String name) {
        this.name = name;
    }
/**
A getName method returns the name of the dog.
@return name - The dogs name
*/
    public String getName() {
        return this.name;
    }
/**
This method represents a pooping dog. It prints a message, and changes a 
variable hasPooped. It calls a setChanged mathod to mark itself as changed  in 
terms of being observable, and sends a message to the observer.
*/
    public void poop() {
        System.out.println("I'm pooping!!");
        hasPooped = true;
        setChanged();
        notifyMyObservers(name + " has pooped!");
   
    }
}
