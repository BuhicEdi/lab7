package lab7.animals;

import java.time.LocalDate;
/**
 * Denna klass är en huvudklass som agerar mall till registrering av djur.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class Animal {
	
	// Klassattribut
	private String name = "";
	private int birthYear;

	// Konstruktorer
	public Animal(String petName) {
		this(petName, LocalDate.now().getYear());
	}

	public Animal(String petName, int birthYear) {
		this.setName(petName);
		this.setBirthYear(birthYear);
	}

	// Metod som registrerar djurets namn
	private void setName(String petName) {
		if (petName == null || petName.length() == 0) {
			throw new IllegalArgumentException("Name can't be empty!");
		} else {
			this.name = petName;
		}
	}

	// Metod som registrerar djurets födelseår
	private void setBirthYear(int birthYear) {
		if (String.valueOf(birthYear).length() == 4 && LocalDate.now().getYear() >= birthYear) {
			this.birthYear = birthYear;
		} else {
			throw new IllegalArgumentException("Invalid birth year!");
		}
	}

	// Metod som returnerar djurets namn
	public String getName() {
		return name;
	}

	// Metod som beräknar samt returnerar djurets ålder
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}
}
