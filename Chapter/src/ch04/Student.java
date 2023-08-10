package ch04;

public class Student {

	int studentId;
	String studentName;
	String studentAddress;

	// 인스턴스 변수
	public Student() {
	}

	public Student(int Id, String Name) {
		studentId = Id;
		studentName = Name;
	}

	public Student(int Id, String Name, String studentAddress) {
		studentId = Id;
		studentName = Name;
		this.studentAddress = studentAddress;
	}

	public void showStudentInfo() {
		System.out.println(studentName + "," + studentId + "," + studentAddress);
	}

	public String getStudentName() {
		return studentName;
	}
}
