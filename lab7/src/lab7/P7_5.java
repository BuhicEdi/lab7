package lab7;

import lab7.animals.pet.Cat;
import lab7.animals.pet.Dog;
import lab7.animals.farm.Cow;
import lab7.animals.farm.Pig;
/**
 * Detta program testar klasserna Dog, Cat, Pig, Cow och Animal.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

public class P7_5 {

	public static void main(String[] args) {
		Cat katt = new Cat("Krister", 2006, false);
		Dog hund = new Dog("Pärlan", 2008, true);

		Cow kossa = new Cow(28, 2012);
		Pig gris = new Pig(43, 2015);

		System.out.println(katt.getDescription());
		System.out.println(hund.getDescription());
		System.out.println(kossa.getDescription());
		System.out.println(gris.getDescription());
	}
}
