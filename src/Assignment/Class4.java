package Assignment;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class3 abc =new Class3(); // class3 automatically inherit the values from class1 and class2
		abc.a1=88;
		System.out.println("Value of variable in class3: " +abc.c1);
		System.out.println("Value of variable in class2: " +abc.b1);
		System.out.println("Value of variable in class1: " +abc.a1);
		abc.sample1();
		abc.sample2();
		abc.sample3();
	}
		
}
