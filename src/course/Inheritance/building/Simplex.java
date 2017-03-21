package course.Inheritance.building;

public class Simplex {

// declaring variables
private int bedRoom;
private int hall;
private int kitchen;

// declaring constructor without fields
Simplex(){
	
}

// constructor with variables
public Simplex(int bedRoom, int hall, int kitchen) {
	this.bedRoom = bedRoom;
	this.hall = hall;
	this.kitchen = kitchen;
}
// method to get  bedroom value
public int getBedRoom() {
	return bedRoom;
}
//method to set bedroom value
public void setBedRoom(int bedRoom) {
	this.bedRoom = bedRoom;
}
// method to get hall value
public int getHall() {
	return hall;
}

//method to set hall value
public void setHall(int hall) {
	this.hall = hall;
}
//method to get kitchen value
public int getKitchen() {
	return kitchen;
}
//method to set kitchen value
public void setKitchen(int kitchen) {
	this.kitchen = kitchen;
}


}
