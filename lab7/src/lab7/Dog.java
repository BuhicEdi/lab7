package lab7;

public class Dog extends Pet {

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
		return "Pet: Cat, Name: " + super.getName() + ", Age: " + super.getAge() + ".";
	}
	
	public Boolean isHunting() {
		return hunting;
	}
}
