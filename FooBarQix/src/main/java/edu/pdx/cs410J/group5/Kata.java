	package edu.pdx.cs410J.group5;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

	/*
	If the number is divisible by 3, write “Foo” instead of the number
	If the number is divisible by 5, add “Bar”
	If the number is divisible by 7, add “Qix”

	 */

  public static void main(String[] args) {

    int arg = Integer.valueOf(args[0]);
    StringBuilder output = new StringBuilder();

  	//Check number of command line args
	  if (args.length == 0){
		  System.err.println("Missing command line arguments");
		  System.exit(0);
	  } else if (args.length > 1) {
	  	System.err.println("Too many command line arguments");
	  	System.exit(0);
	  } else {
	  	//Correct number of command line args

        //divisibility
        if(arg % 3 == 0)
          output.append("Foo");
        if(arg % 5 == 0)
          output.append("Bar");
        if(arg % 7 == 0)
          output.append("Qix");

        //System.out.println("After divisible = " + output);

        char[] chars = args[0].toCharArray();

        //For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
		  for (int i = 0; i < chars.length; ++i){
			  //System.out.println(chars[i]);
			  if(chars[i] == '3')
				  output.append("Foo");
			  else if(chars[i] == '5')
				  output.append("Bar");
			  else if(chars[i] == '7')
				  output.append("Qix");
			  else if(chars[i] == '0')
			      output.append("*");
			  else if(output.indexOf("Foo") < 0 && output.indexOf("Bar") < 0 && output.indexOf("Qix") < 0 )
			      output.append(chars[i]);
		  }


	  }

	  System.out.println("Input: " + args[0] + "\nOutput: " + output);

    System.exit(1);
  }
}