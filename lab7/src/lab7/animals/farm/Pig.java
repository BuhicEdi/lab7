package lab7.animals.farm;

import lab7.animals.Animal;
/**
 * Denna klass är ett arv till huvudklassen Animal som registrerar en gris.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class Pig extends Animal{

	// Klassattribut
	private int id;

	// Konstruktor
	public Pig(int id, int birthYear) {
		super("Gris", birthYear);
		this.id = id;
	}

	// Metod som returnerar grisens läte
	public String makeSound() {
		return "Nöff, nöff";
	}

	// Metod som returnerar en full beskrivning av djuret
	public String getDescription() {
		return "Pet: Pig, ID: " + id + ", Age: " + super.getAge() + ".";
	}
}
