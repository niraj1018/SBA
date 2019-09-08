import java.util.Scanner;

class Shapes
{
	void area()
	{
		System.out.println("Displaying Area of different shapes");
	}
}
// Fill your code to display the formula for area of Circle and Square
class Circle extends Shapes		//Make other changes but DO NOT change name of the class
{
	 void area()
	{
		System.out.println("Area of circle = pi*radius*radium");
	}
}

class Square extends Shapes		//Make other changes but DO NOT change name of the class
{
	 void area()
	{
		System.out.println("Area of sqaure = side*side");
	}
}

public class Main {
	public static void main(String args[])
	{
		//Call the method to print the formula for area of respective shapes using Runtime Polymorphism
		String shape;
		System.out.println("Please tell shape to calc area");
		Scanner sc = new Scanner (System.in);
		shape = sc.next();
		
		if (shape.equalsIgnoreCase("circle"))
		{
			Shapes sp = new Circle();
			sp.area();
		}
		
		if (shape.equalsIgnoreCase("square"))
		{
			Shapes sp = new Square();
			sp.area();
		}
	}
	
}
