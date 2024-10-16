package lab7;

public class MultiChoiceQuestion extends Question {

	String[] alternatives = new String[11];
	Boolean[] isTrue = new Boolean[11];
	int totalAlternatives = 1;
	
	
	public void addChoice(String alt, boolean isTrue) {
		this.alternatives[totalAlternatives] = alt;
		this.isTrue[totalAlternatives] = isTrue;
		totalAlternatives++;
	}
	
	public boolean checkAnswer(String input) {
		String[] nextInt = input.split("\s");
		
		for (int i = 0; i < nextInt.length; i++) {
			if (isTrue[Integer.parseInt(nextInt[i])] == false) {
				return false;
			}
		}
		
		return true;
	}
	
	public String toString() {
		return null;
	}
	
}
