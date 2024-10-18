package lab7;
/**
 * Program som testar klassen TallyCounterUndo
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_1 {

	public static void main(String[] args) {
		TallyCounterUndo count = new TallyCounterUndo();

		count.count();
		count.count();
		System.out.println(count.getValue());

		count.undo();
		System.out.println(count.getValue());

	}
}
