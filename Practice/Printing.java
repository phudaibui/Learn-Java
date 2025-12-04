package Practice;
import java.util.Scanner;
public class Printing {

	public static void main(String[] args) {
		double height = 0;		
		double width = 0; 
		double area = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the height of the rectangle: ");
		height = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter the width of the rectangle: ");
		width = scanner.nextDouble();
		scanner.nextLine();

		area = width * height;
		System.out.println("The area of the rectangle is " + area);
		
		scanner.close();
	}
}
