package lab7;
/**
 * Detta program testar klassen Question.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_6 {

	public static void main(String[] args) {
		Question q = new Question();

		q.setText("Hej, hur mår du?");
		System.out.println(q.toString());

		q.setAnswer("Jag                           mår bra");
		System.out.println(q.getAnswer());
	}
}
