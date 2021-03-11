/**
@author Dustin Stewart
@version 2/22/18
*/
/**
This MyObservable class uses an array to keep track of all of the observers (dog walkers). 
It implements methods that can be used to read the state of an observable class. It holds a 
variable to count the number of observers, a variable that flags wether the state has changed
and builds an array called myObservers that holds the observers.
*/
public class MyObservable{
	private int count = 0;
	private boolean changed = false;
	private MyObserver[] myObservers = new MyObserver[10];
/**
The addObserver method assigns a new observer at the end of the list by assigning it to the list,
then incrementing the count variable to change that number resulting in a new slot to put a dog
Walker in. unfortunately in this case it only goes to ten, but it could be scaled or accounted for.
*/
	public void addObserver(MyObserver o){
		myObservers[count]=o;
		count++;
	}
/**
This method reverts the value of changed back to false from true if it has been changed.
*/
	public void clearChanged(){
		changed=false;
	}
/**
This method returns the number of observers it has recorded in the count variable.
*/
	public int countMyObservers(){
		return count;
	}
/**
This method, hasChanged, returns the value of changed. If and only if it has changed, it returns true. 
*/
	public boolean hasChanged(){
		return changed;
	}
/**
This method changes the value of changed to true in the event of a state change in a dog object. In
this case, wether the dog has pooped, or not.
*/
	protected void setChanged(){
		changed=true;
	}
/**
This method notifies the observers on the array by updating them one by one, unless the position in 
the array is occupied by null.
*/
	public void notifyMyObservers(){
		int i = 0;
		while (myObservers[i] != null){
			myObservers[i].update(this,"");
			i++;
		}
		clearChanged();
	}
/**
This method notifies the observers on the array by updating them one by one, unless the position in 
the array is occupied by null. It also take an object called args and passes it to the observer in
order for the observer to utilize it. It then clears the changed flag.
*/
	public void notifyMyObservers(Object arg){
		int i = 0;
		while (myObservers[i] != null){
			myObservers[i].update(this, arg);
			i++;
		}	
	clearChanged();
	}
/**
This method searches for an input name and deletes that name from the array.
*/
	public void deleteMyObserver(MyObserver o){
		int i;
		for(i=0; i<10; i++)			
			if (myObservers[i] !=null && myObservers[i] == o)
				myObservers[i]=null;
	}
/**
This method cycles the array and deletes all of the elements (dog walkers)
*/
	public void deleteObservers(){
		int i;
		for(i=0;i<10;i++)
			myObservers[i]=null;
	}
}