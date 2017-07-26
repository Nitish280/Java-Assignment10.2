/*
 * here we are Creating  a java program where only 
 * declared class of a package will be accessible
 */
//here we are creating a package
package package_one;

import java.util.Scanner;
//here we creating a class
public class Palindrome {
	//here we are creating a method 
	public void display(){
		//here we are taking one Original String
		String original, reverse = "";
		//here we are using scanner for taking an input
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome:");
	 
	      original = in.nextLine();
	 //here we are finding the  length of the orginal String
	      int length = original.length();
	 //here we are applying the condition for to convert the 
	      //original string into Reverse Order
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 //here we are applying the condition for checking
	      //String is palindrome or not
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
		
	}

}
