class Vehicle{
	protected String vehicleNumber;
	protected String model;
	protected String companyName;
    protected int noOfWheels;
    protected double price;

    Vehicle(String vehicleNumber, String model,String companyName, int noOfWheels,double price) {

        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.companyName = companyName;
        this.noOfWheels = noOfWheels;
        this.price = price;
    }
}

class Bike extends Vehicle{
	 int noOfStands;
	 int noOfHelmets;
	 String bikeCategory;
	 
	 Bike(String vehicleNumber, String model,String companyName, int noOfWheels,double price,int noOfStands,int noOfHelmets,String bikeCategory){
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.noOfStands=noOfStands;
		 this.noOfHelmets=noOfHelmets;
		 this.bikeCategory=bikeCategory;
	 }
} 

class Car extends Vehicle{
    boolean hasPowerSteering;
    String driveMode;
    int parkingAssistSensors;
    
    Car(String vehicleNumber, String model,String companyName, int noOfWheels,double price,boolean hasPowerSteering,String driveMode,int parkingAssistSensors){
    super( vehicleNumber,model,companyName,noOfWheels,price);
    this.hasPowerSteering=hasPowerSteering;
    this.driveMode=driveMode;
    this.parkingAssistSensors=parkingAssistSensors;
    
}}

class Bus extends Vehicle{
	 int passengerCapacity;
	    int standingCapacity;

	    Bus(String vehicleNumber, String model,String companyName, int noOfWheels,double price, int passengerCapacity,int standingCapacity) {

	        super(vehicleNumber, model, companyName,noOfWheels, price);

	        this.passengerCapacity = passengerCapacity;
	        this.standingCapacity = standingCapacity;
	    }
}

class TestVehicle {
	public static void main(String[] args) {
		
	
	Bike bike=new Bike("MH50AB6362", "Unicorn","Honda", 2, 180000,1, 2, "Sports");
	Car car=new Car("MH14d1148","Breeza","Suzuki",4,150000,true,"manual",6);
	Bus bus=new Bus("MH20PQ1111", "Eicher","Tata", 6, 3500000,50,20);
	
	System.out.println("\nVEHICLE HIERARCHY");
    System.out.println(bike.model);
    System.out.println(car.model);
    System.out.println(bus.model);
}
}