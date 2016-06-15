
public class Building {

	String name;
	String campus;
	
	Building(String name, String campus)
	{
		this.name = name;
		this.campus = campus;
	}
	
	public String getBuildingName()
	{
		return name;
	}
	public String getBuildingCampus()
	{
		return campus;
	}
}
