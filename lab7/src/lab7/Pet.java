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
		if (petName.length() > 0) {
			this.name = petName;
		} else {
			throw new IllegalArgumentException("Name can't be empty!");
		}
	}
	
	private void setBirthYear(int birthYear) {
		if (birthYear.length = 4 || birthYear >= LocalDate.now().getYear()) {
			this.birthYear = birthYear;
		}
	}
}
