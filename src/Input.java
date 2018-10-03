/**
 * 
 * jgonsalves21
 * Input
 * 
 */
	import java.util.Scanner;

public class Input {

	
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the length of the rectangle: ");
		double length = in.nextDouble();
		
		System.out.print("Please enter the width of the rectangle: ");
		double width = in.nextDouble();
		
		double area = length*width;
		System.out.printf("The area of the rectangle is %.2f. %n", area);
		in.nextLine();
		
		double perimeter = 2*length + 2*width;
		System.out.printf("The perimeter of the rectangle is %.2f. %n", perimeter);
		
		double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
		System.out.printf("The diagonal of the rectangle is %.2f. %n", diagonal);
		
	}

}
