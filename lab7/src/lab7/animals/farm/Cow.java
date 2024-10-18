package lab7.animals.farm;

import lab7.animals.Animal;
/**
 * Denna klass är ett arv till huvudklassen Animal som registrerar en ko.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class Cow extends Animal {

	// Klassattribut
	private int id;

	// Konstruktor
	public Cow(int id, int birthYear) {
		super("Ko", birthYear);
		this.id = id;
	}

	// Metod som returnerar kossans läte
	public String makeSound() {
		return "Mu, mu!";
	}

	// Metod som returnerar en full beskrivning av kossan
	public String getDescription() {
		return "Pet: Cow, ID: " + id + ", Age: " + super.getAge() + ".";
	}
}
