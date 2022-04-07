package Assignment;

public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method Initialized");
		System.out.println("Value of Instance variable is:" +a);
		System.out.println("Value of instance variable is:" +b);

	}
static int a=6, b;
static     //this line of code gets executed first
{
	System.out.println("Static block intialized.");
	b=a*5;
}
}
