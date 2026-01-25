package javapractice;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.getData("rushi");
		m.getData(5);

	}
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}

}
