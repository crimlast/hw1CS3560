package defaultpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {

	public static void main(String[] args) {
		
		
		//Testing Using a test that uses multiple choices of a, b, c, d;		
		List<String> answerSC1 = new LinkedList<String>();
		answerSC1.add("a");
		
		List<String> answerSC2 = new LinkedList<String>();
		answerSC2.add("b");
		
		List<String> answerSC3 = new LinkedList<String>();
		answerSC3.add("c");
		
		List<String> answerSC4 = new LinkedList<String>();
		answerSC4.add("d");
			
		
		//Must be ordered from a to d
		//Create some combinations of answers for multiple choices question.
		List<String> answerMC1 = new LinkedList<String>();
		answerMC1.add("a");
		answerMC1.add("b");
		answerMC1.add("c");

		List<String> answerMC2 = new LinkedList<String>();
		answerMC2.add("b");
		answerMC2.add("c");
		answerMC2.add("d");
		
		List<String> answerMC3 = new LinkedList<String>();
		answerMC3.add("c");
		answerMC3.add("d");
		
		List<String> answerMC4 = new LinkedList<String>();
		answerMC4.add("a");
		answerMC4.add("b");
		
		List<String> answerMC5= new LinkedList<String>();
		answerMC5.add("b");
		answerMC5.add("c");
		
		List<String> answerMC6 = new LinkedList<String>();
		answerMC6.add("a");
		answerMC6.add("d");
		
		List<String> answerMC7 = new LinkedList<String>();
		answerMC7.add("a");
		answerMC7.add("c");
		
		List<String> answerMC8 = new LinkedList<String>();
		answerMC8.add("b");
		answerMC8.add("d");

		//Question creation
		Question question1 = new SCQuestion("q1 Single Choice");	
		question1.setAnswer(answerSC1);
		VotingService iVote1 = new VotingService(question1);
		
		Question question2 = new SCQuestion("q2 Single Choice");	
		question2.setAnswer(answerSC3);
		VotingService iVote2 = new VotingService(question2);

		Question question3 = new MCQuestion("q2 Multiple Choices", answerMC7);
		question3.setAnswer(answerMC3);
		VotingService iVote3 = new VotingService(question3);

		
		
		Random rand = new Random();
		//5-14 students
		int numStudents = rand.nextInt(10) + 5 ;
		int temp = 0;
		Student s = null;
		//Question1 submission
		for(int i = 0; i < numStudents; i++) {
			temp = rand.nextInt(4);
			if(temp == 1) {
				s = new Student(answerSC1);
				iVote1.submit(s);
			}
			else if(temp == 2) {
				s = new Student(answerSC2);
				iVote1.submit(s);
			}
			else if(temp == 3) {
				s = new Student(answerSC3);
				iVote1.submit(s);
			}
			else {
				s = new Student(answerSC4);
				iVote1.submit(s);
			}
		}
		iVote1.checkAnswers();
		
		//gap between the questions
		System.out.println();
		
		
		//Question2 submission
		for(int i = 0; i < numStudents; i++) {
			temp = rand.nextInt(4);
			s = iVote1.getStudent(i);

			if(temp == 1) {
				s.setAnswer(answerSC1);
				iVote2.submit(s);
			}
			else if(temp == 2) {
				s.setAnswer(answerSC2);
				iVote2.submit(s);
			}
			else if(temp == 3) {
				s.setAnswer(answerSC3);
				iVote2.submit(s);
			}
			else {
				s.setAnswer(answerSC4);
				iVote2.submit(s);
			}
		}
		iVote2.checkAnswers();
		
		//gap between the questions
		System.out.println();
		
		//Question3 submission
		for(int i = 0; i < numStudents; i++) {
			temp = rand.nextInt(8) + 1;
			s = iVote1.getStudent(i);
			if(temp == 1) {
				s.setAnswer(answerMC1);
				iVote3.submit(s);
			}else if(temp == 2) {
				s.setAnswer(answerMC2);
				iVote3.submit(s);
			}else if(temp == 3) {
				s.setAnswer(answerMC3);
				iVote3.submit(s);
			}else if(temp == 4) {
				s.setAnswer(answerMC4);
				iVote3.submit(s);
			}else if(temp == 5) {
				s.setAnswer(answerMC5);
				iVote3.submit(s);
			}else if(temp == 6) {
				s.setAnswer(answerMC6);
				iVote3.submit(s);
			}else if(temp == 7) {
				s.setAnswer(answerMC7);
				iVote3.submit(s);
			}
			else{
				s.setAnswer(answerMC8);
				iVote3.submit(s);
			}
		}
		iVote3.checkAnswers();
		
	}
}
