package javapractice;

public class FinalDemoChildClass extends FinalDemo {
	
	public void getString()
	{
		System.out.println("This is child method");
	}
	
public static void main(String[] args)
{
	FinalDemoChildClass Cd = new FinalDemoChildClass();
	Cd.getString();
}

}
