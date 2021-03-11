/**
@author Dustin Stewart
@version 2/22/18
*/
/**
A class can implement the MyObserver interface when it wants to be informed of changes in observable objects.
*/
public interface MyObserver{
/**
This method is called whenever the observed object is changed.
@param o - the observable object.  
@param arg - an argument passed to the notifyObservers method.
*/
	public void update(MyObservable o, Object arg);

}//end class MyObserver