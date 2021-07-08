	package edu.pdx.cs410J.group5;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

	/**
	 * Error checks the number of args in a string.
	 * @param args String of arguments passed in.
	 */
	private static void checkArgs (String [] args) {
		//Check number of command line args
		if (args.length == 0) {
			System.err.println("Missing command line arguments");
			System.exit(0);
		} else if (args.length > 1) {
			System.err.println("Too many command line arguments");
			System.exit(0);
		}
	}

	/**
	 * Constructs a string based on rules assigned to character values.
	 * @param args String array containing an argument to parse.
	 * @return Constructed string.
	 */
	private static StringBuilder compute (String[] args) {

		int arg = Integer.parseInt(args[0]);
		StringBuilder output = new StringBuilder();

		//divisibility
		if (arg % 3 == 0)
			output.append("Foo");
		if (arg % 5 == 0)
			output.append("Bar");
		if (arg % 7 == 0)
			output.append("Qix");

		char[] chars = args[0].toCharArray();

		//For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
		for (char aChar : chars) {
			//System.out.println(chars[i]);
			if (aChar == '3')
				output.append("Foo");
			else if (aChar == '5')
				output.append("Bar");
			else if (aChar == '7')
				output.append("Qix");
			else if (aChar == '0')
				output.append("*");
			else if (output.indexOf("Foo") < 0 && output.indexOf("Bar")
					< 0 && output.indexOf("Qix") < 0)
				output.append(aChar);
		}

		return output;
	}

	/**
	 * Main entry point for the FooBarQix constructor. Reads in an argument
	 * from the command line and computes it according to the rules.
	 * @param args Command line arguments as a string array.
	 */
    public static void main(String[] args) {

    	checkArgs(args);
	    StringBuilder output = compute(args);
	    System.out.println("Input: " + args[0] + "\nOutput: " + output);
	    System.exit(1);
    }

}