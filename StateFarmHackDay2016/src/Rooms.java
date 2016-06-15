
public class Rooms extends Floor {

	
	String roomName;
	String availability;
	int width, length, location;
	
	
	
	Rooms(String name, String campus, String floorNumber, String divisions, String roomName, String availability, int width, 
			int length, int location) 
	{
		super(name, campus, floorNumber, divisions);
		// TODO Auto-generated constructor stub
		this.roomName = roomName;
		this.availability = availability;
		this.width = width;
		this.length = length;
		this.location = length;
	}

	String getRoomName()
	{
		return roomName;
	}
	String getAvailability()
	{
		return availability;
	}
	
}
