//Luis Lopez
//Assignment 2



public class Item {

	private int key;
	private int timeStamp;
	
	
	public Item(int k, int ts) {
		
		key = k;
		timeStamp = ts;
		
	}
	public int getKey() {
		return key;
	}
	public int getTimeStamp() {
		return timeStamp;
	}
	public void setKey(int k) {
		key = k;
	}
	public void setTimeStamp(int ts) {
		key = ts;
	}
	public String toString() {
		
		return key + ":" + timeStamp;
	}
}
