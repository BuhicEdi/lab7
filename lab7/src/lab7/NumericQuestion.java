package lab7;

public class NumericQuestion extends Question {

	public boolean checkAnswer(String response) {
		System.out.println(getAnswer());
		
		double resp = Double.parseDouble(response);
		double answer = Double.parseDouble(getAnswer());
		
		System.out.println(resp);
		System.out.println(answer);
		
		if (resp == answer) {
			return true;
		}
		
		return false;
	}
	
	
	
}
