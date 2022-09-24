package defaultpackage;

import java.util.LinkedList;
import java.util.List;

public class VotingService {
	private List<Student> students;
	private Question question;
	
	public VotingService(Question question){
		this.students = new LinkedList<Student>();
		this.question = question;
	}
	
	public void submit(Student student) {
		int index = 0;
		boolean isHere = false;
		for(int i = 0; i < students.size(); ++i) {
			if(students.get(i).getStudentId().equals(student.getStudentId())) {
				index = i;
				isHere = true;
			}
		}
		if(isHere) {
			students.set(index, student);
		}
		else {
			students.add(student);
		}
	}
	
	public void checkAnswers() {
		System.out.println("Question: " + question.getQuestion());
		System.out.println("Answer: " + question.configAnswer());
		int counter = 0;
		for(Student s: students) {
			System.out.print(s.getStudentId() + " got ");
			if(s.configAnswer().equals(question.configAnswer())) {
				System.out.print(s.configAnswer());
				System.out.println(" correct");
				++counter;
			}
			else {
				System.out.println(s.configAnswer());
			}
		}
		System.out.println(counter + " Student(s) got it right");

	}
	
	public Student getStudent(int i) {
		if(i > students.size()) {
			return null;
		}
		return students.get(i);
	}
	
	

}
