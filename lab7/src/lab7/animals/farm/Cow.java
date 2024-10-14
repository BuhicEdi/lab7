package lab7.animals.farm;

import lab7.animals.Animals;

public class Cow extends Animals {
	private int id;
	
	public Cow(int id, int birthYear) {
		super("Ko", birthYear);
		this.id = id;
	}
	
	public String makeSound() {
		return "Mu, mu!";
	}
	
	public String getDescription() {
		return "Pet: Cow, Name: " + id + ", Age: " + super.getAge() + ".";
	}

}
