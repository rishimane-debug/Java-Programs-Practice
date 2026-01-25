package javapractice;

public class AirIndia extends ParentAircarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirIndia ai = new AirIndia();
		ai.engine();
		ai.sefty();
		ai.bodyColor();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red color for body");
	}

}
