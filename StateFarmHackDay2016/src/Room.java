import java.util.ArrayList;

public class Room extends Floor {

	
	String roomName;
	String availability;
	int width, length, locationX, locationY;
	boolean isAvailable;
	ArrayList<String> taken;
	ArrayList<String> allTimes;
	
	
	Room(String name, String campus, int floorNumber, String divisions, String roomName, ArrayList<String> taken, int width, 
			int length, int locationX, int locationY) 
	{
		super(name, campus, floorNumber, divisions);
		// TODO Auto-generated constructor stub
		this.roomName = roomName;
		this.taken = taken;
		this.width = width;
		this.length = length;
		this.locationX = locationX;
		this.locationY = locationY;
		allTimes = new ArrayList<String>() {{
			add("7:00");add("7:30");add("8:00");add("8:30");add("9:00");add("9:30");add("10:00");add("10:30");
			add("11:00");add("11:30");add("12:00");add("12:30");add("1:00");add("1:30");add("2:00");
			add("2:30");add("3:00");add("3:30");add("4:00");add("4:30");add("5:00");add("5:30");
		}};
	}

	public String getRoomName()
	{
		return roomName;
	}
	public ArrayList<String> getAvailability()
	{
		ArrayList<String> availability = (ArrayList<String>)allTimes.clone();
		for(String x: taken) {
			availability.remove(x);
		}
		return availability;
	}
	
	public boolean isAvailble(String time) {
		ArrayList<String> availability = getAvailability();
		if(availability.contains(time))
			isAvailable = true;
		else
			isAvailable = false;
		return isAvailable;
	}
	
	public boolean takeAvailability(String time) {
		if(isAvailble(time)) {
			taken.add(time);
			return true;
		}
		else {
			System.out.println("Time is already occupied");
			return false;
		}
	}
}
