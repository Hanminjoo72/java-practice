package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.studentName = "Lee";
		studentLee.studentAddress = "Seoul";
		
		Student studentKim = new Student();
		studentKim.studentName = "kim";
		studentKim.studentAddress = "New York";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}
}
