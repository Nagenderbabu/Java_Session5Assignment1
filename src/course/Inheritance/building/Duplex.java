package course.Inheritance.building;

public class Duplex extends Simplex{

	// declaring variables
	private int floor;
	private int staircase;

	// constructor without fields(parameters)
	public Duplex(){
		
	}

	//constructor with parameters(fields)
	public Duplex(int bedRoom, int hall, int kitchen,int floor,int staircase) {
		super(bedRoom, hall, kitchen);
		this.floor = floor;
		this.staircase = staircase;
	}
	//method to get floor value
	public int getFloor() {
		return floor;
	
	}
	//method to set floor value
	public void setFloor(int floor) {
		this.floor = floor;
	}
	//method to get staircase value
	public int getStaircase() {
		return staircase;
	}
	//method to set staircase value
	public void setStaircase(int staircase) {
		this.staircase = staircase;
	}

}
