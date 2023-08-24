package ch09;

public class BirthDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Birthday day = new Birthday();
		day.setYear(2023);
		day.setMonth(1);
		day.setDay(30);
		
		System.out.println((day).isValid());
	}
}
