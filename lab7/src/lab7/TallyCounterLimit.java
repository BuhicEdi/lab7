package lab7;

public class TallyCounterLimit extends TallyCounterUndo {

	private int limit;
	
	public TallyCounterLimit() {
		super();
		this.limit = Integer.MAX_VALUE;
	}
	
	public TallyCounterLimit(int startLimit) {
		super();
		
		if (limit > 0) {
			this.limit = startLimit;
		} else {
			throw new IllegalArgumentException("Limit can't be negative!");
		}
	}
	
	public void count() {
		if (this.counter < limit) {
			super.count();
		} else {
			throw new IllegalStateException("Limit is reached!");
		}
	}
	
	public void setLimit(int newLimit) {
		if (newLimit > 0) {
			this.limit = newLimit;
		} else {
			throw new IllegalArgumentException("Limit can't be negative!");
		}
	}
}
