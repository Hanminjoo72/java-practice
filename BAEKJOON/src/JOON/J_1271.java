package JOON;

import java.math.BigInteger;
import java.util.Scanner;

public class J_1271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		BigInteger money = in.nextBigInteger();
		BigInteger people = in.nextBigInteger();
		in.close();

		System.out.println(money.divide(people));
		System.out.println(money.remainder(people));
	}

}
