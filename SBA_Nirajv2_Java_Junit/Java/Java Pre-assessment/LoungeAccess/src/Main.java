import java.io.BufferedReader;
import java.io.IOException;
//all needed package imports here
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	// declare your enumerated data type for the cards here
	// declare the hash map here for card type to hours allowed mapping
	// Key MUST BE enumerated data type

	enum Card {
		Amex, Diners, Visa, Masters;
	}

	public static void main(String[] args) throws IOException {
		// load the hash map
		HashMap cardcompanies = new HashMap();
		cardcompanies.put(Card.Amex, "4");
		cardcompanies.put(Card.Diners, "0");
		cardcompanies.put(Card.Visa, "2");
		cardcompanies.put(Card.Masters, "1");

		// Getting the input as card type from the user..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to TIA! Please enter the Card that you hold:");
		String card = br.readLine();
		//
		Card obj = Card.valueOf(card);
		// case structure code goes here
		switch (obj) {
		case Amex:
			System.out.println("Lounge access granted for "+cardcompanies.get(obj) + " hours. Thank you!");
			break;
		case Diners:
			System.out.println("Lounge access denied. Thank you!");
			break;
		case Visa:
			System.out.println("Lounge access granted for "+cardcompanies.get(obj) + " hours. Thank you!");
			break;
		case Masters:
			System.out.println("Lounge access granted for "+cardcompanies.get(obj) + " hours. Thank you!");
			break;

		}
	}

}
