package lab7.animals;

import java.time.LocalDate;

public class Animals {
	
	private String name = "";
	private int birthYear;
	
	public Animals(String petName) {
		this(petName, LocalDate.now().getYear());
	}
	
	public Animals(String petName, int birthYear) {
		this.setName(petName);
		this.setBirthYear(birthYear);
	}
	
	private void setName(String petName) {
		if (petName == null || petName.length() == 0) {
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
		return LocalDate.now().getYear() - birthYear;
	}
}
