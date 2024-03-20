package is.hi.hbv202g.ass9;

import is.hi.hbv202g.ass9.composite.*;

/**
 * The `CompositeMain` class represents the main entry point of the program. 
 */
public class CompositeMain {

	/**
	 * Main method executes a mathemetical expression. It creates three NumberLeaf objects, uses 
	 * PlusComposite to add two of them together and then uses MultiplyComposite to multiply the sum
	 * of the two numbers with the third number. The expression and result are finally printed.
	 *
	 * @param args The command-line arguments passed to the program, but main method does not use any.
	 */
	public static void main(String[] args) {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		System.out.println("The result of (" + number1.getResult() + "+" + number2.getResult() + ")*" +
				number4.getResult() + " is: " + multiplyComposite.getResult());
	}
}
