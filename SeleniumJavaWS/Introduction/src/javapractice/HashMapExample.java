package javapractice;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(0, "Rushi");
		hm.put(1, "Ankita");
		hm.put(2, "Nikita");
		hm.put(3, "Naveen");
		hm.put(4, "Ashwin");
		hm.put(5, "Megha");
		hm.put(6, "LT");
		System.out.println(hm);
		System.out.println(hm.get(6));
		hm.remove(3);
		System.out.println(hm);
		
	}

}
