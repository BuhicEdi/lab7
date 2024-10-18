package lab7;
/**
 * Denna klass är ett arv till klassen TallyCounterUndo som lägger till spärrhantering.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class TallyCounterLimit extends TallyCounterUndo {

	// Klassattribut
	private int limit;

	// Konstruktorer
	public TallyCounterLimit() {
		this(Integer.MAX_VALUE);
	}

	public TallyCounterLimit(int startLimit) {
		super();

		if (startLimit > 0) {
			this.limit = startLimit;
		} else {
			throw new IllegalArgumentException("Limit can't be negative!");
		}
	}

	// Överlagrad metod som adderar ett klick till räknaren ifall spärren inte är nådd
	public void count() {
		if (super.counter < limit) {
			super.count();
		} else {
			throw new IllegalStateException("Limit is reached!");
		}
	}

	// Metod som sätter en ny spärr
	public void setLimit(int newLimit) {
		if (newLimit > 0) {
			this.limit = newLimit;
		} else {
			throw new IllegalArgumentException("Limit can't be negative!");
		}
	}
}
