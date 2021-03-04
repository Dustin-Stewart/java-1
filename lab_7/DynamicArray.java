/*dustin stewart
11-1-17
resizable arrays*/
import java.util.Arrays;

public class DynamicArray{
private String[] array;
private int numberOfElements;
private int nextIndex;
	
	public DynamicArray(){
		this(10);
	}	//end no argument array
	
	public DynamicArray(int size){
		this.array = new String[size];
		this.numberOfElements = 0;
		this.nextIndex = 0;
	}	//end sizeable array 
	
	public DynamicArray(String[] initialStrings){
		this.array = Arrays.copyOf(initialStrings, initialStrings.length);
		this.numberOfElements = initialStrings.length;
		this.nextIndex = initialStrings.length;
	}	//end overloaded constructor
	
	public void add(String stringToAdd){//check if there is room in the array
		if (this.array.length == numberOfElements){
			expandArray();//add space if not
			}
		this.array[this.nextIndex] = stringToAdd;
		this.numberOfElements = this.numberOfElements + 1;
		this.nextIndex++;		
	}//end add method
	
	private void expandArray(){
		String[] newArray = new String[(this.numberOfElements * 3) / 2];
		for (int i = 0; i< numberOfElements; i++){
		newArray[i] = this.array[i];
		}
		this.array = newArray;	
	}//end expand array
		
	private void remove(int val){
		for (int i = val; i<this.numberOfElements; i++){
		this.array[i] = this.array[i+1];
		this.numberOfElements--;
		this.nextIndex--;
		}
	}//end remove method
	
	private String get(int indexVal){
		if ((indexVal < this.array.length )||(indexVal > this.array.length)){
			System.out.println("There is no value at " + indexVal);
			}
		return this.array[indexVal];
			 }	//end get method
		
	
	private boolean isEmpty(){
		if (this.numberOfElements == 0){
		return true;
		}
		else {
		return false;
		}	
	}//end is empty
	private int sizeOf(){
		return numberOfElements;
	}
	 
}//end class RUNNER METHOD ON MOODLE