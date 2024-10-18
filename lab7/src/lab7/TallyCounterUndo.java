package lab7;
/**
 * Denna klass är ett arv till huvudklassen TallyCounter som adderar funktionen att ångra ett klick.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

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
