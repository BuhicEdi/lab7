package lab7;
/**
 * Denna klass är en huvudklass som agerar mall till att skapa ett quiz.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class Question {

	// Klassattribut
	private String text;
	private String answer;

	// Konstruktor
	public Question() {
		this.text = "";
		this.answer = "";
	}

	// Metod som tar emot frågan
	public void setText(String question) {
		this.text = question;
	}

	// Metod som tar emot ett svar
	public void setAnswer(String answer) {
		answer = answer.trim();
		answer = answer.replaceAll("\s+", " ");

		if (Character.isDigit(answer.charAt(1)) == false) {
			answer = answer.replace('-', ' ');
		}

		this.answer = answer;
	}

	// Metod som returnerar korrekta svaret
	public String getAnswer() {
		return answer;
	}

	// Metod som kontrollerar ifall ett svar är korrekt
	public boolean checkAnswer(String response) {
		response = response.trim();
		response = response.replaceAll("\s+", " ");
		response = response.replace('-', ' ');

		return response.equalsIgnoreCase(answer);
	}

	// Metod som returnerar frågan
	public String toString() {
		return text;
	}
}
