import java.io.BufferedReader;
import java.io.IOException;
// import needed package
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

//declare an array list
	static ArrayList<String> proverbs = new ArrayList<String>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 proverbs to add");
		proverbs.add(br.readLine());
		proverbs.add(br.readLine());
		proverbs.add(br.readLine());
		// Get 3 proverbs and store in Arraylist..

		String filename = "proverbs.txt";
		// write into a plain text (.txt) file named proverbs.txt. Each proverb should
		// be a separate line.
		// MUST NOT contain any empty new line as the first or last line in the text
		// file.

		PrintWriter out = new PrintWriter(filename);

		for (int i = 0; i < proverbs.size(); i++) {
			if (i == proverbs.size() - 1)
				out.print(proverbs.get(i));
			else
				out.println(proverbs.get(i));
		}
		out.close();
		System.out.println("proverbs has been added to the file!");

	}
}
