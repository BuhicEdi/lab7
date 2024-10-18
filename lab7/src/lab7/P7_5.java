package lab7;

import lab7.animals.pet.Cat;
import lab7.animals.pet.Dog;
/**
 * Detta program testar klasserna Dog, Cat och Animal.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_5 {

	public static void main(String[] args) {
		Cat katt = new Cat("Krister", 2006, false);
		Dog hund = new Dog("Pärlan", 2008, true);

		System.out.println(katt.getDescription());
		System.out.println(hund.getDescription());
	}
}
