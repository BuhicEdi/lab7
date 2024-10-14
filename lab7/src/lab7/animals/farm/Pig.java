package lab7.animals.farm;

import lab7.animals.Animals;

public class Pig extends Animals{
	private int id;
	
	public Pig(int id, int birthYear) {
		super("Gris", birthYear);
		this.id = id;
	}
	
	public String makeSound() {
		return "Nöff, nöff";
	}
	
	public String getDescription() {
		return "Pet: Pig, Name: " + id + ", Age: " + super.getAge() + ".";
	}
}
