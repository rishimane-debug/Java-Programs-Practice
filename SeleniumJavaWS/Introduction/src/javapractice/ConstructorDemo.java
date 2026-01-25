package javapractice;

public class ConstructorDemo {
	
	//This is constructor
	public ConstructorDemo()
	{
		System.out.println("I am in comstructor");
	}
	
	public ConstructorDemo(String name)
	{
		System.out.println(name);
	}
	
	public void getData()
	{
		System.out.println("I am in the method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		cd.getData();
		

	}

}
