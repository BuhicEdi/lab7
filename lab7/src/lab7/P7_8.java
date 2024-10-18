package lab7;
/**
 * Program som testar klassen FillInQuestion.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_8 {

	public static void main(String[] args) {
		FillInQuestion q = new FillInQuestion();

		q.setText("SHLs gud heter _Jakob Silfverberg_");
		System.out.println(q.toString());
		System.out.println("Answer: " + q.getAnswer());
	}
}
