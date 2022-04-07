package Assignment;

import java.util.Scanner;


//THERE IS AN ERROR IN PRINTING RESULT!!!

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next(); //assigning string in an empty scanner
		String org = str; //fixing inserted str in to original string
		String rev ="";
		int len=str.length();
		for (int i=len-1;i>0;i--) {
			rev=rev+str.charAt(i);
		}
		if (org.equals(rev)) {
			
			System.out.println("It is a Palindrome String");
		}
		else {
			System.out.println("It is not a Palindrome String");
		}
		
	}

}
