package lab7.animals.pet;

import lab7.animals.Animal;

public class Dog extends Animal {

	private boolean hunting;
	
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
	
	public String makeSound() {
		return "Vov, vov";
	}
	
	public String getDescription() {
		return "Pet: Dog, Name: " + super.getName() + ", Age: " + super.getAge() + " Hunting Dog: " + hunting + "." ;
	}
	
	public Boolean isHunting() {
		return hunting;
	}
}
