package lab7;

public class MultiChoiceQuestion extends Question {

	String[] alternatives = new String[11];
	Boolean[] isTrue = new Boolean[11];
	int totalAlternatives = 0;
	
	
	public void addChoice(String alt, boolean isTrue) {
		this.alternatives[totalAlternatives] = alt;
		this.isTrue[totalAlternatives] = isTrue;
		totalAlternatives++;
	}
	
	public boolean checkAnswer(String input) {
		int alt = Integer.parseInt(input);
		
		return isTrue[alt];
	}
	
	public String toString() {
		return null;
	}
	
}
