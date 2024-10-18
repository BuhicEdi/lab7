package lab7;
/**
 * Detta program testar klassen NumericQuestion.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_7 {

	public static void main(String[] args) {
		NumericQuestion q = new NumericQuestion();

		q.setAnswer("-3.14");	
		System.out.println(q.checkAnswer("-3.14"));
	}
}
