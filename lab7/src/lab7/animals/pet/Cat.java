package lab7.animals.pet;

import lab7.animals.Animal;

public class Cat extends Animal {

	private boolean indoor;
	
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
	
	public String makeSound() {
		return "Mjau, mjau";
	}
	
	public String getDescription() {
		return "Pet: Cat, Name: " + super.getName() + ", Age: " + super.getAge() + " Indoor Cat: " + indoor + ".";
	}
	
	public Boolean isIndoor() {
		return indoor;
	}
}
