package lab7;
/**
 * Denna klass är en huvudklass som agerar mall till att konstruera en räknare.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class TallyCounter {

	// Klassattribut
	protected int counter;

	// Konstruktor
	public TallyCounter() {
		this.counter = 0;
	}

	// Metod som ökar räknare med 1
	public void count() {
		this.counter++;
	}

	// Metod som returnerar antal klick
	public int getValue() {
		return counter;
	}

	// Metod som återställer räknare
	public void reset() {
		this.counter = 0;
	}
}
