package lab7;
/**
 * Denna klass är ett arv till huvudklassen Pet som registrerar en hund.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class Dog extends Pet {

	// Klassattribut
	private boolean hunting;

	// Konstruktorer
	public Dog(String name) {
		super(name);
		this.hunting = false;
	}

	public Dog(String name, int age) {
		super(name, age);
		this.hunting = false;
	}

	public Dog(String name, int age, boolean isIndoor) {
		this(name, age);
		this.hunting = isIndoor;
	}

	// Metod som returnerar hundens läte
	public String makeSound() {
		return "Vov, vov";
	}

	// Metod som returnerar en full beskriving av hunden
	public String getDescription() {
		return "Pet: Dog, Name: " + super.getName() + ", Age: " + super.getAge() + ", Hunting Dog: " + hunting + "." ;
	}

	// Metod som returnerar ifall det är en jakthund
	public Boolean isHunting() {
		return hunting;
	}
}
