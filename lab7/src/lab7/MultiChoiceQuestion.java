package lab7;

public class MultiChoiceQuestion extends Question {

	String[] alternatives = new String[10];
	Boolean[] isTrue = new Boolean[10];
	int totalAlternatives = 0;
	
	
	public void addChoice(String alt, boolean isTrue) {
		this.alternatives[totalAlternatives] = alt;
		this.isTrue[totalAlternatives] = isTrue;
		totalAlternatives++;
	}
	
	public Boolean checkAnswer(int input) {
		return isTrue[input];
	}
	
	public String toString() {
		return null;
	}
	
}
