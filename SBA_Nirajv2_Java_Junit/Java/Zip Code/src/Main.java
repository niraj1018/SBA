
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
//import the required packages
import java.util.Map;

public class Main {

//declare the Hash Map here with integer as key

	static HashMap<Integer, String> hm = new HashMap<Integer, String>();

	public static void main(String[] args) throws IOException {
// load the map
//DO NOT forget to add Beverly Hills and Manhattan!!

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//Pre requisistes - Add zip codes highlighted in blue in question to hashmap 
		hm.put(90210, "Beverly Hills");
		hm.put(10118, "Manhattan");
//take user entry - zip code and area name
		System.out.println("Enter number of zip codes to be entered");
		int noOfZipCodes = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < noOfZipCodes; i++) {
			System.out.println("Enter a Zip Code:");
			int zipCode = Integer.parseInt(br.readLine().trim());
//Check Zip Code should be 5 digit integer
			if (Integer.toString(zipCode).length() != 5) {
				System.out.println("Invalid zip code - Zip Code is not a five digit integer");
				continue;
			}
			System.out.println("Enter Area Name for zip code " + zipCode);
			String areaName = br.readLine().trim();

			hm.put(zipCode, areaName);
		}

//your code to retrieve area for the zipCode
		System.out.println("Enter zipCode for which area needs to be retrieved");
		int zipCode = Integer.parseInt(br.readLine().trim());
		if (hm.containsKey(zipCode)) // Check if hashmap contains the entered zip code as Key
		{
			System.out.println("Area for " + zipCode + " is " + hm.get(zipCode));
		} else {
			System.out.println("not found");
		}
	}
}
