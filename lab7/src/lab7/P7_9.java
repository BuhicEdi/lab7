package lab7;

import java.util.Scanner;
/**
 * Program som testar klassen MultiChoiceQuestion.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_9 {

	public static void main(String args[]) {
		MultiChoiceQuestion question = new MultiChoiceQuestion();

		question.setText("Vika länder ingår i 'Skandinavien'?");

		question.addChoice("Sverige", true);
		question.addChoice("Norge", true);
		question.addChoice("Finland", false);
		question.addChoice("Danmark", true);
		question.addChoice("Island", false);

		System.out.println(question.toString());

		System.out.print("Your answer: ");
		Scanner answerInput = new Scanner(System.in);

		System.out.println(question.checkAnswer(answerInput.nextLine()));
		answerInput.close();
	}
}
