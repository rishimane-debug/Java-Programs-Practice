package javapractice;

import InterFacePack.CentralTraffic;

public class ImplementingInterFace implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic c = new ImplementingInterFace();
		ImplementingInterFace c1 = new ImplementingInterFace();
		c.goGreen();
		c.redStop();
		c.yelloWait();
		c1.stopTrain();
		
	
	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("You can go");
	}
	
	public void stopTrain()
	{
		System.out.println("Stop it's Train Signal");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop it's red light");
	}

	@Override
	public void yelloWait() {
		// TODO Auto-generated method stub
		System.out.println("Wait for next signal");
		
	}

}
