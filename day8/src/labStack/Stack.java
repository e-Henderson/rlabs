package labStack;

import java.util.Arrays;

public class Stack {
	private int lastItem=0;
	private int[] items = new int[0];
	
	//adding items to the stack
	public void push(int newItem) {
		int index = items.length;//gets current length
		System.out.println("Array length in push is: " + index);
		items = new int[items.length + 1];//increases array by one
		System.out.println("Items after expansion is: " + Arrays.toString(items));
		items[index] = newItem;//stores the new value
		System.out.println("Items after storage: " + Arrays.toString(items));
		
		lastItem = newItem;//updates the lastItem
		System.out.println("Last item: " + lastItem);
	}
	
	//remove the items
	public int pop() {
		//return 0;
		int tempItem = lastItem;//stores the lastItem
		
		//copies new array but removes last item
		int[] newArray = new int[items.length-1];//subtracts array by one
		
		for(int i=0; i< newArray.length;i++) {
			newArray[i]=items[i];
		}
		
		items=newArray;//updates array
		lastItem=items[items.length-1];//updates last item
		
		return tempItem;
	}
	
	//view last item
	public int peek() {
		return 0;
	}
}
