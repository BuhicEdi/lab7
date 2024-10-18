package lab7;
/**
 * Program som testar klassen Pet.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_3 {

	public static void main(String[] args) {
		try {
			Pet camel = new Pet(null);
			camel.getAge();

		} catch (IllegalArgumentException err) {
			System.out.println(err.getLocalizedMessage());
		}
	}
}
