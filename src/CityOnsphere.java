import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CityOnsphere
{
	public static City parse(String line)
	{
		City city = new City();
		String []ss = line.split(",");
		city.Country 		= ss[0];
		city.City 			= ss[1];
		city.AccentCity 	= ss[2];
		city.Region 		= ss[3];
		if(ss[4] == "")
		{
			city.Population 	= Long.parseLong(ss[4]);
		}
		
		city.Latitude 		= Double.parseDouble(ss[5]);
		city.Longitude 		= Double.parseDouble(ss[6]);
		return city;

		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.err.println("Please Input Your City :");
		
		String cityname = sc.nextLine().trim().toLowerCase();
		System.err.println("Please Input Length (km) :");
		double k = sc.nextDouble();
		
		try
		{
			Scanner filesc = new Scanner(
					new BufferedReader ( new FileReader( new File(
							"/Users/ASUS A15/Downloads/worldcitiespop.txt"))));
		
		while(filesc.hasNextLine())
		{
			String s = filesc.nextLine();
			City city = parse(s);
			System.out.println(city);
		}
		
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		

	}

}
