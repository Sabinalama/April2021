package Assignment;

import java.util.Scanner;

public class multiplicationWithoutMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=s.nextInt();
		System.out.println("Enter the value of b: ");
		b=s.nextInt();
		
		//c=a*b
		c=0;
		while(b>0)
		{
			c=c+a;
			b--;
		}
		System.out.println("The value of multiplication is: " + c);
		
	}
		
	}

	
	
