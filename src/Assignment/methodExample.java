package Assignment;

public class methodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Example m =new Method_Example();
		m.mul_1();
		
		
	}

	public void mul_1()
	{
		int a,b,c;
		a=10;
		b=20;
		//c=a*b
		c=0;
		while (b>0)
		{c=a+b;
		b--;
		}
		
		System.out.println("The value of multiplication i: "+ c);
		
		}
	}

