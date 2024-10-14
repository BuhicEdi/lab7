package lab7;

public class TallyCounterUndo extends TallyCounter {
	
	public TallyCounterUndo() {
		super();
	}
	
	public void undo() {
		if (this.counter != 0) {
			this.counter--;
		}
	}
	
	
}
