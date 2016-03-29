
import java.util.*;

/**
 *   File Name: MyGradeavg.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 27, 2016
 *
 */

/**
 * MyGradeavg //ADDD (description of class)
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
 * Write a java program which prints the grade average of given user based on a
 * user supplied set of grade values. Repeat execution until user has no more
 * item to add to grade. Use Java loops Use + operator to add numbers
 */
public class MyGradeavg {

	static int gradeval;
	static int gradevalhold;
	static String store;
	static String yes_or_no;

	public static void main(String[] args) {
		// static String store;
		// static int gradeval;
		String test1 = new String("Hello");
		String test2 = new String("Hello");
		String testStr = yes_or_no;
		if (test1 == test2) {
			System.out.println("matched");
		}

		System.out.println("Please enter the grades");
		Scanner scan = new Scanner(System.in);
		store = scan.nextLine();

		System.out.println("Do you want to continue? : Y / N ");
		yes_or_no = scan.nextLine();
		System.out.println("[" + yes_or_no + "]");
		if (yes_or_no.equalsIgnoreCase("Y")) {
			System.out.println("Please enter the grade");
			gradevalhold = scan.nextInt();
			gradeval = gradeval + gradevalhold;
		} else {
			System.out.println("Please wait!");
		}

	}

	/**
	 * @param args
	 */
	// Using variables to manipulate
	// Keeping this variables as cla variabssles because inside main method we
	// get modifier problem which ask us to do in finall

	static void calculategrade() {

		gradeval = Integer.parseInt(store);
	}

}
