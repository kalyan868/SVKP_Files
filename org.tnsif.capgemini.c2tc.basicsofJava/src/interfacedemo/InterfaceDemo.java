package interfacedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		//you can't instantiate the interface itself
		Car car=new Car("Toyota corolla");
		Bike bike=new Bike("Mountain Bike");
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("Maximun speed for vehicle" );
	}

}