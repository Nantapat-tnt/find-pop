
public class City
{
	String Country;
	String City;
	String AccentCity;
	String Region;
	long Population;
	double Latitude,Longitude;
	
	//Country,City,AccentCity,Region,Population,Latitude,Longitude
	
	public String toString()
	{
		return String.format("%s\t%s\t%s\t%s\t%d\t%f\t%f", 
				Country,City,AccentCity,Region,Population,Latitude,Longitude);
	}
	
	

}
