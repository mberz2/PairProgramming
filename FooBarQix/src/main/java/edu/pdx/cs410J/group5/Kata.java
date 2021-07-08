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
	For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
	 */

  public static void main(String[] args) {

    int arg = Integer.valueOf(args[0]);
    String output = null;

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
          output = "Foo";
        if(arg % 5 == 0)
          output = output + "Bar";
        if(arg % 7 == 0)
          output = output + "Qix";
	  }

	  System.out.println(output);

    System.exit(1);
  }
}