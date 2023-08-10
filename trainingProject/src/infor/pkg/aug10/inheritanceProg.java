package infor.pkg.aug10;



class Bike {
	public static int gear;
	public static int speed;
	
	public Bike(int gear , int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public static void applyBrake (int decrement) {
		speed-=decrement;
		System.out.println(speed);
	}
	
	public static void speedUp(int increment) {
		speed+=increment;
		System.out.println(speed);
	}
	
}


public class inheritanceProg extends Bike{



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike honda = new Bike(4,60);
		applyBrake(10);
		speedUp(20);
		
	}

}
