
//Luis Lopez
//Assignment 2


public class StackX {


	private int maxSize;
	private Item[] stackArray;
	private int top;
	//--------------------------------------------------------------
	public StackX(int size) // constructor
	{
	maxSize = size;
	stackArray = new Item[maxSize];
	top = -1;
	}
	//--------------------------------------------------------------
	public void push(Item j) // put item on top of stack
	{ stackArray[++top] = j; }
	//--------------------------------------------------------------
	public Item pop() // take item from top of stack
	{ return stackArray[top--]; }
	//--------------------------------------------------------------
	public Item peek() // peek at top of stack
	{ return stackArray[top]; }
	//--------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{ return (top == -1); }
	//--------------------------------------------------------------
	public boolean isFull() // true if stack is full
	{ return (top == maxSize-1); }
	//--------------------------------------------------------------
	public int size() // return size
	{ return top+1; }
	//--------------------------------------------------------------
	public Item peekN(int n) // peek at index n
	{ return stackArray[n]; }
	//--------------------------------------------------------------
	public void displayStack()
	{

		for(int i = 0; i < size(); i++) {
			
			System.out.print(peekN(i).toString() + " ");
		}
		
	}

}
