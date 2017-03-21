package course.Inheritance.building;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// initializing variables through constructor 
	Duplex d=new Duplex(2,1,1,2,1);
	
	// passing values from get methods to local variables   
	int bedroom=d.getBedRoom();
	int hall=d.getHall();
	int kitchen=d.getKitchen();
	int floor=d.getFloor();
	int stairs=d.getStaircase();
	
	// displays the output values of Simplex class
	System.out.println("Simplex has:");
    // displays value of bedroom 
	System.out.println("No of Bed rooms :"+" "+bedroom);
	// displays value of hall
	System.out.println("No of Halls :"+" "+hall);
	// displays value of kitchen
	System.out.println("No of Kitchens :"+" "+kitchen);
	// displays empty line 
	System.out.println("");
	
	// displays the output values of Duplex class
	System.out.println("Duplex has :");
	// displays value of bedroom
	System.out.println("No of Bed rooms :"+" "+bedroom);
	// displays value of halls
	System.out.println("No of Halls :"+" "+hall);
	// displays value of kitchen
	System.out.println("No of Kitchens :"+" "+kitchen);
	// displays value of floor
	System.out.println("No of floor :"+" "+floor);
	// displays value of stairs
	System.out.println("No of staircase :"+" "+stairs); 
	}

}
