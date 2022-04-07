package Assignment;

public class Car {
	
	static double dist;
	static double time;
	static double speed;
	//protected static double test;
	public static void calSpeed(double d, double t)
	{
		dist=d;
		time= t;
		speed=d/t;
		//return speed;
		System.out.println(speed);
		
	}

}
