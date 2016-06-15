
public class Building {

	String name;
	String campus;
	
	Building(String name, String campus)
	{
		this.name = name;
		this.campus = campus;
	}
	
	protected String getBuildingName()
	{
		return name;
	}
	protected String getBuildingCampus()
	{
		return campus;
	}
}
