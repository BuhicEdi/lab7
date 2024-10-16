package lab7;

public class Question {

	private String text;
	private String answer;
	
	public Question() {
		this.text = "";
		this.answer = "";
	}
	
	public void setText(String question) {
		this.text = question;
	}
	
	public void setAnswer(String answer) {
		answer = answer.trim();
		answer = answer.replaceAll("\s+", " ");
		answer = answer.replace('-', ' ');
		
		this.answer = answer;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean checkAnswer(String response) {
		response = response.trim();
		response = response.replaceAll("\s+", " ");
		response = response.replace('-', ' ');
		
		return response.equalsIgnoreCase(answer);
	}
	
	public String toString() {
		return text;
	}
}
