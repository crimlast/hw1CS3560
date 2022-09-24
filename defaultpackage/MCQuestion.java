package defaultpackage;

import java.util.LinkedList;
import java.util.List;

public class MCQuestion extends Question{

private List<String> answer;
	
	public MCQuestion(String q, List<String> ans) {
		super(q);
		answer = new LinkedList<String>();
	}

	@Override
	public String configAnswer() {
		String ans = answer.get(0);
		for(int i = 1; i < answer.size(); ++i) {
			ans += ", " + answer.get(i);
		}
		
		return ans;
	}

	@Override
	public void setAnswer(List<String> ans) {
		answer = ans;
	}

}
