package lab7.animals.pet;

import lab7.animals.Animal;
/**
 * Denna klass är ett arv till huvudklassen Animal som registrerar en katt.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class Cat extends Animal {

	// Klassattribut
	private boolean indoor;

	// Konstruktorer
	public Cat(String name) {
		super(name);
		this.indoor = false;
	}

	public Cat(String name, int age) {
		super(name, age);
		this.indoor = false;
	}

	public Cat(String name, int age, boolean isIndoor) {
		this(name, age);
		this.indoor = isIndoor;
	}

	// Metod som returnerar kattens läte
	public String makeSound() {
		return "Mjau, mjau";
	}

	// Metod som returnerar en full beskrivning av katten
	public String getDescription() {
		return "Pet: Cat, Name: " + super.getName() + ", Age: " + super.getAge() + ", Indoor Cat: " + indoor + ".";
	}

	// Metod som returnerar ifall katten är en innekatt
	public Boolean isIndoor() {
		return indoor;
	}
}
