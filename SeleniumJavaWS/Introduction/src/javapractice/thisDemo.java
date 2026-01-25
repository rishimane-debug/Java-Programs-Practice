package javapractice;

import AccessModifierPack.DefaultDemo;

public class thisDemo extends DefaultDemo {
	int a = 2;
	

	public void getNumber()
	{
		int a = 3;
		int c = a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			thisDemo td = new thisDemo();
			td.getNumber();
			DefaultDemo d1 = new DefaultDemo();
			d1.publidGetData();
		    td.protectedgetData();
		    
		    
			
		
		
	}

}
