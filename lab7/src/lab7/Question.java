package lab7;

public class Question {

	private String text;
	private String answer;
	
	public Question() {
		this.text = "";
		this.answer = "";
	}
	
	public void setText(String question) {
		question = question.trim();
		question = question.replaceAll("\s+", " ");
		question = question.replace('-', ' ');
		
		this.text = question;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean checkAnswer(String response) {
		return response.equalsIgnoreCase(answer);
	}
	
	public String toString() {
		return text;
	}
}
