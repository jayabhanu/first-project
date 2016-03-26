/**
 *   File Name: Exe1.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * Exe1 //ADDD (description of class)
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
 * Write a function which takes a int parameter and print the message on screen
 * that “number is greater than 10” otherwise it should print “number is smaller
 * then 10” (Can you support if parameter is equal to 10)
 */
public class Exe1 {

	/**
	 * @param args
	 */
	public static void greater_or_smaller(int a) {
		System.out.println("number to validate is:" + a);
		if (a > 10) {
			System.out.println("Entered number is greater than 10!");
		} else if (a == 10) {
			System.out.println("Entered number is equal to 10!");
		} else {
			System.out.println("Entered number is smaller than 10!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exe1 obj = new Exe1();
		obj.greater_or_smaller(10);

	}

}
