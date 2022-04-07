package Assignment;

public class ClassObject {
	
	int x,y,z; //data
	public void add() //Void - returns nothing === method with no args with no rethurn type 
	
 { 
		z = x+y;
		System.out.println(z);
		
	}

	public int sub() // with return type and no arguments
	{
	z=x-y;
	return z;
	}
	public int mul(int a, int b) //with returntype and with arguments 
	{
	//x=a;
	//y=b;
	//z=x*y;
	z=a*b; //435*10
	return z;
	}
	
	public void div(int a, int b)
	{
		x=a;
		y=b;
		z=x/y;
		System.out.println("Value of division is:" +z );
	}
}
