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
		if (petName.isBlank() || petName == null) {
			throw new IllegalArgumentException("Name can't be empty!");
		} else {
			this.name = petName;
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
