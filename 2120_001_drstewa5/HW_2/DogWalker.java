/**
@author Dustin Stewart
@version 2/22/18
*/
/**
import java.util.* brings in all java utilities.
*/
import java.util.*;
/**
public class DogWalker represents Dog Walkers. These are observer objects so they 
implement class MyObserver. Objects of this type can be updated when observable 
objects change.
*/
public class DogWalker implements MyObserver {

    private String name;
/**
This constructor builds an observer object by assigning it a name as a String.
@param name - a string representing a name.
*/
    public DogWalker(String name) {
        this.name = name;
    }
/**
Update method. This method overrides the update method in MyObserver class.It implements
the update method and tacks on a message when observers get updated.
@param o - an observable object. arg - an object
*/
@Override
    public void update(MyObservable o, Object arg) {

        System.out.println("Hey, " + name + " has been notified that " + arg);

    }
}/**
end class DogWalker
*/
