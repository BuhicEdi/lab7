package lab7;

import java.util.Arrays;

public class MultiChoiceQuestion extends Question {

	String[] alternatives = new String[10];
	int[] isTrue = new int[10];
	int totalAlternatives = 1;
	
	
	public void addChoice(String alt, boolean isTrue) {
		alternatives[totalAlternatives - 1] = alt;
		
		if (isTrue = true) {
			this.isTrue[totalAlternatives - 1] = totalAlternatives;
		}
		totalAlternatives++;
	}
	
	public boolean checkAnswer(String input) {
		String inpAns = input.replaceAll("\s", "");
		
		if (Arrays.toString(isTrue).contains(inpAns)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return null;
	}
	
}
