package defaultpackage;

import java.util.List;

public abstract class Question {
	
	private String question;
	private boolean multChoice;
	
	public Question(String q) {
		question = q;
		multChoice = false;
	}
	
	public void setType() {
		multChoice = true;
		
	}
	
	public String getQuestion() {
		return question;
	}
	
	public abstract String configAnswer();
	
	public abstract void setAnswer(List<String> ans);
	
	

}
