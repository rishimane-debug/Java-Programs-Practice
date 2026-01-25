package javapractice;

public class ChildClass extends ParentClass {

	String name = "Mane";
	
	
	public ChildClass()
	{
		super();
		System.out.println("This is child Constructor");
	}
	
	
	public void getString()
	{
		System.out.println(name);
		System.out.println(super.name);
		super.getData();
	}
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cd = new ChildClass();
		cd.getString();
		cd.getData();

	}

}
