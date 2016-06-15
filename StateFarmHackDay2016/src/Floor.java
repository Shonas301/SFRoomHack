import java.util.ArrayList;

public class Floor extends Building{

	int floorNumber;
	String divisions;
	ArrayList<Room> rooms;
	
	Floor(String name, String campus, int floorNumber, String divisions) {
		super(name, campus);
		this.floorNumber = floorNumber;
		this.divisions = divisions;
		this.rooms = new ArrayList<Room>();
		// TODO Auto-generated constructor stub
	}
	protected int getFloor()
	{
		return floorNumber;
	}

	protected String getDivisions()
	{
		return divisions;
	}
	public void addRoom(Room r) {
		rooms.add(r);
	}
	public ArrayList<Room> getRooms() {
		return rooms;
	}
}
