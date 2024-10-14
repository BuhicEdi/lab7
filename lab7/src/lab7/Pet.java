package lab7;

import java.time.LocalDate;

public class Pet {

	private String name = "";
	private int birthYear;
	
	public Pet(String petName) {
		this(petName, LocalDate.now().getYear());
	}
	
	public Pet(String petName, int birthYear) {
		this.setName(petName);
		this.setBirthYear(birthYear);
	}
	
	private void setName(String petName) {
		if (petName.length() > 0 || petName == null) {
			this.name = petName;
		} else {
			throw new IllegalArgumentException("Name can't be empty!");
		}
	}
	
	private void setBirthYear(int birthYear) {
		if (String.valueOf(birthYear).length() == 4 && LocalDate.now().getYear() >= birthYear) {
			this.birthYear = birthYear;
		} else {
			throw new IllegalArgumentException("Invalid birth year!");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return birthYear - LocalDate.now().getYear();
	}
}
