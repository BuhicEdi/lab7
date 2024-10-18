package lab7;
/**
 * Detta program testar klasserna Cat och Dog.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_4 {

	public static void main(String[] args) {
		Cat katt = new Cat("Gustaf", 2008, true);
		Dog hund = new Dog("Kent", 2006, false);

		System.out.println(katt.getDescription());
		System.out.println(hund.getDescription());
	}
}
