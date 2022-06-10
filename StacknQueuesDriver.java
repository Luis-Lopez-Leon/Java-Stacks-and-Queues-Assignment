import java.security.SecureRandom;
import java.util.Scanner;
//Luis Lopez
//Assignment 2

public class StacknQueuesDriver {

	public static void main(String[] args) {
		
		SecureRandom randomNumGenerator = new SecureRandom();//SecureRandom number generator for number of elements to store on the arrays
		Scanner userDataSize = new Scanner(System.in);
		int timeStamp = 1, dataSize;
		Item maxKeyValue;
		
		System.out.println("Please enter the size of data, not exceeding 20.\n");
		dataSize = userDataSize.nextInt();
		System.out.println("\n");
		while(dataSize > 20 || dataSize < 1) {//ensuring user enters a valid data size.
			
			System.out.println("Size too large or negative! Please enter the size of data, not exceeding 20.\n");
			dataSize = userDataSize.nextInt();
			System.out.println("\n");
		}
		
		
		StackX MainStack = new StackX(dataSize);
		StackX TempStack = new StackX(dataSize);
		Queue itemQueue = new Queue(dataSize);
		Item finalOutputItemArray [] = new Item[dataSize];
		
		for(int i = 0; i < dataSize; i++) {
			
			while(!itemQueue.isFull()) {
				
				Item tempItem = new Item((randomNumGenerator.nextInt(11)+1),timeStamp++);
				
				itemQueue.insert(tempItem);
				
			}
			
		}
		
		
		
		
		maxKeyValue = itemQueue.remove();//First assumption
		itemQueue.displayQueue();
		int MaxTimeStamp = dataSize;
		
		while(!itemQueue.isEmpty()) {
			
			
			while(itemQueue.peek().getTimeStamp() != MaxTimeStamp){
				
				
				Item tempItem = itemQueue.remove();
				
				if(tempItem.getKey() > maxKeyValue.getKey())
				{
				
					itemQueue.insert(maxKeyValue);
					maxKeyValue = tempItem;
					
					
				}
				else if(tempItem.getKey() < maxKeyValue.getKey()) {
					
					itemQueue.insert(tempItem);
					
					
				}
				else if(tempItem.getKey() == maxKeyValue.getKey()) {
					
					TempStack.push(maxKeyValue);
					maxKeyValue = tempItem;
					
					
				}
				
			}//End cycling through queue
			
			

			/*
			if(TempStack.isEmpty()) {
				
				
				MainStack.push(maxKeyValue);
				
			}
			else if(!TempStack.isEmpty()) {
				
				while(!TempStack.isEmpty()) {
					
					MainStack.push(maxKeyValue);
					
				}
				
			}
			*/
			
			

			
		}
		
		
		
		
	}

}
