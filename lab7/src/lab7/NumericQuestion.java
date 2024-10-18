package lab7;
/**
 * Denna klass är ett arv till huvudklassen Question som konverterar samt jämför flyttal.
 * 
 * @author Edi Buhic
 * @version 2024-10-18
 */

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
