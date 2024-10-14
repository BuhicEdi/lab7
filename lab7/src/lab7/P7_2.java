package lab7;

public class P7_2 {

	public static void main(String[] args) {
		
		try {
			TallyCounterLimit count = new TallyCounterLimit(-5);
			count.setLimit(-9);
		} catch (IllegalArgumentException err) {
			System.out.println("Error creating counter: " + err.getLocalizedMessage());
		}
		
		try {
			TallyCounterLimit count = new TallyCounterLimit();
			count.setLimit(-98);
		} catch (IllegalStateException err) {
			System.out.println("Error setting new limit: " + err.getLocalizedMessage());
		}
	}

}
