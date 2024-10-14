package lab7;

public class TallyCounter {
	protected int counter = 0;
	
	public TallyCounter() {
		
	}
	
	public void count() {
		this.counter++;
	}
	
	public int getValue() {
		return counter;
	}
	
	public void reset() {
		this.counter = 0;
	}
}
