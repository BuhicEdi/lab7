package lab7;

public class P7_3 {

	public static void main(String[] args) {
		try {
			Pet jap = new Pet(null);
		} catch (IllegalArgumentException err) {
			System.out.println(err.getLocalizedMessage());
		}

	}

}
