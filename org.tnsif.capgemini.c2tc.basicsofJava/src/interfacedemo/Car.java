package interfacedemo;
//implement the interface in a class
public class Car 
{
    private String model;
    
    
    //constructor
          
   public Car(String model2) {
	// TODO Auto-generated constructor stub
}

	public  void start() {
		
		System.out.println("Car " + model + " is starting");
	}

	public void stop() {
		System.out.println("Car " +model +" is stopped");
		
	}

}