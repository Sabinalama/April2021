package Assignment;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Program to check whether given number is prime or not using while and do wile loop
		
	
			int c, i, num;
			c=0; // the variable "c" stores the number of factors of a given number. for eg: for 3, the factors are 1, 3; hence, c=2
			i=1;  
			/* intiatlize the value of divider to "1"; This number needs to be 1 and not 0, because any given 
			number divided by 0, does not give any factor or remainder
			*/
			
			
			System.out.println("Enter any number");
			
			
			Scanner s = new Scanner(System.in);
			num=s.nextInt();
			
			while (i<=num)
			{
				if(num%i==0)
				{
					c++;
				}
				i++;
				}
			if(c==2)
				System.out.println("Given number is Prime.");
			else
				System.out.println("Given number is not Prime.");
			
		
			
			}
	
			
			
		
		


		}
	

	

