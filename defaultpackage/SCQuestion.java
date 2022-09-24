package defaultpackage;

import java.util.LinkedList;
import java.util.List;

public class SCQuestion extends Question{

	private List<String> answer;
	
	public SCQuestion(String q) {
		super(q);
		answer = new LinkedList<String>();
	}
	
	public void setAnswer(List<String> ans) {
		answer.add(0,ans.get(0));
	}
	
	public String configAnswer() {
		return answer.get(0);
	}

}
