package lab7;

import java.util.Scanner;

public class P7_9 {

	public static void main(String args[]) {
		MultiChoiceQuestion question = new MultiChoiceQuestion();
		question.setText("Vika länder ingår i 'Skandinavien'? (Svara med korrekt siffra/siffor med mellanslag)");
		question.addChoice("Sverige", true);
		question.addChoice("Norge", true);
		question.addChoice("Finland", false);
		question.addChoice("Danmark", true);
		question.addChoice("Island", false);
		System.out.println(question.toString());
		System.out.print("Your answer: ");
		Scanner answerInput = new Scanner(System.in);
		System.out.println(question.checkAnswer(answerInput.nextInt()));
		answerInput.close();

		
	}
	
}
