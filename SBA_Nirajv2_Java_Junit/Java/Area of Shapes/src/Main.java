import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		//Call the method to print the formula for area of respective shapes using Runtime Polymorphism
		String shape;
		System.out.println("Please enter the shape for which you need the formula for area");
		
		
		// TAKE INPUTS DURING RUNTIME
		Scanner sc = new Scanner (System.in);
		shape = sc.next();
		

		// Area of circle is pi*side*side

if (shape.equalsIgnoreCase("circle"))
		{
			Shapes sp = new Circle();
			sp.area();
		}

// Area of square is side*side
	if (shape.equalsIgnoreCase("square"))
		{
			Shapes sp = new Square();
			sp.area();
		}
	}
	
}
