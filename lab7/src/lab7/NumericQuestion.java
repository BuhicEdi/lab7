package lab7;

public class NumericQuestion extends Question {

	public boolean checkAnswer(String response) {
		double resp = Double.parseDouble(response);
		double answer = Double.parseDouble(getAnswer());
		
		if (resp == answer) {
			return true;
		}
		
		return false;
	}
	
	
	
}
