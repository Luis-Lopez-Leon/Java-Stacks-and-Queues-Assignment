//Luis Lopez
//Assignment 2


public class Queue {

	private int maxSize;
	private Item[] queArray;
	private int front;
	private int rear;
	//--------------------------------------------------------------
	public Queue(int s) // constructor
	{
	maxSize = s+1; // array is 1 cell larger
	queArray = new Item[maxSize]; // than requested
	front = 0;
	rear = -1;
	}
	//--------------------------------------------------------------
	public void insert(Item j) // put item at rear of queue
	{
	if(rear == maxSize-1)
	rear = -1;
	queArray[++rear] = j;
	}
	//--------------------------------------------------------------
	public Item remove() // take item from front of queue
	{
	Item temp = queArray[front++];
	if(front == maxSize)
		front = 0;
		return temp;
	}
	//--------------------------------------------------------------
	public Item peek() // peek at front of queue
	{
	return queArray[front];
	}
	//--------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{
	return ( rear+1==front || (front+maxSize-1==rear) );
	}
	//--------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
	return ( rear+2==front || (front+maxSize-2==rear) );
	}
	//--------------------------------------------------------------
	public int size() // (assumes queue not empty)
	{
	if(rear >= front) // contiguous sequence
	return rear-front+1;
	else // broken sequence
	return (maxSize-front) + (rear+1);
	}
	public int queueSize()
	{
		return rear+1;
	}
	public Item peekN(int n)
	{
		return queArray[n];
	}
	public void displayQueue()
	{
		for(int i = 0; i < queueSize(); i++) {
			
			System.out.print(peekN(i).toString() + " ");
		}
	}
	
	
}
