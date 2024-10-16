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
		input.replaceAll("\s", "");
		
		for (int i = 0; 0 < input.length(); i++) {
			if (isTrue[i - 1] == false) {
				return false;
			}
		}
		
		return true;
	}
	
	public String toString() {
		return null;
	}
	
}
