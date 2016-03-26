/**
 *   File Name: Exe3.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * Exe3 //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */

/*
 * Write a program that can ask the user for a grade value and print the
 * associated grade letter.
 */
import java.util.*;

public class Exe3 {

	static String gradenum;
	/**
	 * @param args
	 */

	static int gradeValue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int gradeValue;

		System.out.println("Please enter grade value");
		Scanner scan = new Scanner(System.in);
		gradenum = scan.nextLine();
		gradeValue = Integer.parseInt(gradenum);
		if (gradeValue < 40) {
			System.out.println("sorry failed");
		} else if (gradeValue >= 40 && gradeValue <= 59) {
			System.out.println("Hey congrats you got grade C");
		} else if (gradeValue >= 60 && gradeValue <= 79) {
			System.out.println("Hey congrats you got grade B");
		} else if (gradeValue >= 80 && gradeValue <= 100) {
			System.out.println("Hey congrats you got grade A");
		} else {
			System.out.println("Invalid gradevalue entered");
		}
	}

}
