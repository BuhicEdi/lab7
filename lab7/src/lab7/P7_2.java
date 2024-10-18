package lab7;
/**
 * Program som testar klassen TallyCounterLimit.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_2 {

	public static void main(String[] args) {

		try {
			TallyCounterLimit count = new TallyCounterLimit(-5);
			count.setLimit(2);

		} catch (IllegalArgumentException err) {
			System.out.println("Error creating counter: " + err.getLocalizedMessage());
		}

		try {
			TallyCounterLimit count = new TallyCounterLimit(1);
			count.count();
			count.count();

		} catch (IllegalStateException err) {
			System.out.println("Error counting: " + err.getLocalizedMessage());
		}
	}
}
