import java.util.*;

/**
 *   File Name: Exe2.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * Exe2 //ADDD (description of class)
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
 * Write a program that prints the name of month using switch statement given a
 * number from the user. *You will need to use the Integer.parseInt() method to
 * convert a user supplied string to a number type variable that can be
 * evaluated
 */

public class Exe2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		String month;
		String monthName;

		System.out.println("Please enter the number");
		Scanner scan = new Scanner(System.in);
		month = scan.nextLine();
		number = Integer.parseInt(month);
		// System.out.println(number);

		switch (number) {

		case 1:
			System.out.println("hey it's jan month!");
			break;

		case 2:
			System.out.println("hey it's feb month!");
			break;

		case 3:
			System.out.println("hey it's march month");
			break;

		case 4:
			System.out.println("hey it's apr month");

		case 5:
			System.out.println("hey it's may month");
			break;

		case 6:
			System.out.println("hey it's june month");
			break;

		case 7:
			System.out.println("hey it's july month");
			break;

		case 8:
			System.out.println("hey it's aug month");
			break;

		case 9:
			System.out.println("hey it's sep month");
			break;

		case 10:
			System.out.println("hey it's oct month");
			break;

		case 11:
			System.out.println("hey it's nov month");
			break;

		case 12:
			System.out.println("hey it's dec month");
			break;

		default:
			System.out.println("Invalid month");
			break;
		}
	}
}
