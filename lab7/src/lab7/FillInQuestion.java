package lab7;
/**
 * Denna klass är ett arv till huvudklassen Question som klipper ut svaret direkt ur frågan.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class FillInQuestion extends Question {

	// Överlagrad metod som lokaliserar samt klipper ut svaret
	public void setText(String text) {
		String answer = "";
		String newText = "";

		if (text.contains("_")) {
			int start = text.indexOf('_') + 1;
			int stop = text.lastIndexOf('_');

			answer = text.substring(start, stop);
			newText += text.substring(0, start);

			for(int i = start + 1; i < stop - 1; i++) {
				newText += "_";
			}
			newText += text.substring(stop);
		}

		super.setText(newText);
		super.setAnswer(answer);
	} 
}
