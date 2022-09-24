package defaultpackage;

import java.util.List;

public class Student {
	public static int counter;
	private String studentId;
	private List<String> answer;
	
	public Student(List<String> ans) {
		studentId = "Student" + counter++;
		answer = ans;
	}
	public String getStudentId() {
		return studentId;
	}
	public List<String> getAnswer(){
		return answer;
	}
	
	public void setAnswer(List<String> ans) {
		answer = ans;
	}
	
	public String configAnswer(){
		String ans = answer.get(0);
		for(int i = 1; i < answer.size(); ++i) {
			ans += ", " + answer.get(i);
		}
		
		return ans;
	}

}
