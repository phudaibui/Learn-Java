package Practice;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("How old are you?: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What is your GPA?: ");
		double gpa = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Are you student? (true/false): " );
		boolean isStudent = scanner.nextBoolean();
		scanner.close();
		
		System.out.println("You are " + age + " years old");
		System.out.println("Your gpa is " + gpa);
		System.out.println("Hello " + name);


		if (isStudent) {
			System.out.println("You are a student");
		}
		else {
			System.out.println("You are not a student");
		}
		
	}
}
