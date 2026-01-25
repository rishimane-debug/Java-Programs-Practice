package javapractice;

public class Dog extends Animal{

	public void bark()
	{
		System.out.println("Dog is barking");
	}
	public void eat()
	{
		System.out.println("Dog is eating ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animal A = new Dog();
			Dog d = new Dog();
			A.eat();   //method overriding 
			d.eat();
			d.bark();
					
	}

}
