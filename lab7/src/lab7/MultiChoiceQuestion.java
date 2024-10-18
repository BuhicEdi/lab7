package lab7;
/**
 * Denna klass är ett arv till huvudklassen Question som tillåter flera svarsalternativ.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

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

		for (int i = 0; i < inpAns.length(); i++) {

		}

		return true;
	}

	public String toString() {
		return super.toString();
	}

}
