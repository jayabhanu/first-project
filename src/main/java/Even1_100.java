/**
 *   File Name: Prime1_100.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * Prime1_100 //ADDD (description of class)
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
 * Write a java program which prints all even number from 1 to 100 Use Java
 * loops Use % operator to check if a number is even or not.
 */

public class Even1_100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println();
		// int[] arry = new int[100];

		for (int i = 1; i <= 100; i++) {
			// if (i == 1) {
			// System.out.println("Neither prime or composite");
			// } else
			if (i % 2 == 0) {
				System.out.println(i);
			}
			//
			// else if (i % 2 == 0) {
			// // System.out.println("hey it's not prime");
			// }
			//
			// else {
			// System.out.println(i);
			// }

		}
	}
}
