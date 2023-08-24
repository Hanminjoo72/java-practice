package ch08;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student(100,"Lee");
		Student studentKim = new Student(101,"kim");
		
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학",95);
		
		studentKim.setKoreanSubject("국어", 100);
		studentKim.setMathSubject("수학",95);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
