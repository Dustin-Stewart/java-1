import java.util.ArrayList;
/**
@author Dustin Stewart
@version 2/22/18
This is bonus material for the homework assignment. Instead of an array in this example I used an array
list which was significantly easier thanks to the .equals,.clear, and .remove methods. This type of observer object
receives a notification when the state of the object they are observing (a dog). This is kind of a basic example
where the observer class gets a notification and prints a thing to the screen saying that it has received
that message. A more functional version would perhaps do something when it observes that an object has changed.
For example a traffic camera that activates a camera when a car exceeds the speed limit, where the traffic cam 
object is notified by an observable video camera object that a car is speeding and as a result takes a picture 
with its camera.  
*/
public class MyObservable {
/**
An ArrayList of MyObserver type objects named observers hold the DogWalkers and a boolean called changed holds a 
record of wether an observable objects state has been changed. In this example, when a dog poops ( @see Poop ) its
state changes from true to false. 
*/
	private ArrayList <MyObserver> observers;
	private boolean changed = false;

	public void MyObservable(){

		observers = new ArrayList<MyObserver>();
	}/**
To addd new dogwalkers we use the addObserver method. It checks to see if you are adding the same dog walker or if 
you are adding a null reference. If neither it adds your dog walker to the array list. It also throws a null pointer 
Exception in the case that it gets passed a null reference.
@param o - A MyObserver type 
	*/
	public void addObserver(MyObserver o) throws NullPointerException{
		
		boolean sameWalker = false;
		
		if(o.equals(null)){

			throw new NullPointerException("Null can't be added.");
		}

		for(MyObserver i : observers){
			
			if(o.equals(i))
				sameWalker = true;
		}

		if(sameWalker == false)
			observers.add(o);
		else
			System.out.println("That DogWalker is already on the list.");
	}
/**
This method deletes an observer and verifies it with a message. It cycles through the list and find the reference 
that matches the one supplied (an observer type), and deletes it.
*/
	
	public void deleteMyObserver (MyObserver o){

		for(MyObserver observer : observers)
		{
			if(observer.equals(o))
				observers.remove(observer);
		}
		System.out.println("Deleted" + o);
	}
/**
This method uses .clear to delete all elements of the arraylist.
*/
	public void deleteObservers(){

		this.observers.clear();
	}
/**
This method reverts the value of changed back to false from true if it has been changed.
*/
	protected void clearChanged(){

		this.changed = false;
	}	
/**
This method changes the value of changed to true in the event of a state change in a dog object. In
this case, wether the dog has pooped, or not.
*/
	protected void setChanged(){

		this.changed = true;
	}
/**
This method, hasChanged, returns the value of changed. If and only if it has changed, it returns true. 
*/
	public boolean hasChanged(){

		return changed;
	}
/**
Thiis method returns the number of observers via the size method of arraylist which returns the amount of entries.
*/
	public int countMyObservers( MyObserver o) {

		return this.observers.size();
	}	
/**
This method updates the observer class but does nnot provide an argument. sort of unneccesary for this example,
but it is important to note that an argument is not always needed. It returns the changed state variable to false afterwards.
*/
	public void notifyMyObservers(){

		if(changed == true){

			for(MyObserver observer : observers){

			observer.update(this, null);
			}

			clearChanged();
		}
	} 
/**
This is probably the most important method in this class. It updates the observer class, and passes an object (arg) into the 
update method. In our case, a string that says "has pooped".It also returns the changed state variable to false afterwards.
*/
	public void notifyMyObservers(Object arg){

		if(changed == true){

			for(MyObserver observer : observers){
				
				observer.update(this, arg);
			}
			clearChanged();
		}
	}
 } // end class