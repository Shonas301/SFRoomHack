import java.util.ArrayList;

public class Building {

	String name;
	String campus;
	ArrayList<Floor> floors;
	
	Building(String name, String campus)
	{
		this.name = name;
		this.campus = campus;
		floors = new ArrayList<Floor>();
	}
	
	public String getBuildingName()
	{
		return name;
	}
	public String getBuildingCampus()
	{
		return campus;
	}
	public void addFloor(Floor f) {
		floors.add(f);
	}
	public ArrayList<Floor> getFloors() {
		return floors;
	}
}
