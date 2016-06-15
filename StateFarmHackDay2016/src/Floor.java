
public class Floor extends Building{

	String floorNumber;
	String divisions;
	
	
	
	Floor(String name, String campus, String floorNumber, String divisions) {
		super(name, campus);
		this.floorNumber = floorNumber;
		this.divisions = divisions;
		// TODO Auto-generated constructor stub
	}
	protected String getFloor()
	{
		return floorNumber;
	}

	protected String getDivisions()
	{
		return divisions;
	}
	
}
