package lab7;

public class MultiChoiseQuestion extends Question {

	String[] alternatives = new String[10];
	Boolean[] isTrue = new Boolean[10];
	int totalAlternatives = 0;
	
	
	public void addChoise(String alt, boolean isTrue) {
		this.alternatives[totalAlternatives] = alt;
		this.isTrue[totalAlternatives] = isTrue;
		
	}
	
	public Boolean checkAnswer(int input) {
		return isTrue[input - 1];
	}
	
	
}
