import java.util.Scanner;

public class gradebook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Greet the user and welcome them to the Grade Book
		// Loop until they enter a negative number.
		// Read in grades until a negative is entered.
		// After done looping, print out:
		// - How many grades were entered
		// - The highest grade
		// - The lowest grade
		// - The average of grades
		System.out.println("whats your name?");
		String name = in.nextLine();
		System.out.println("Welcome "+name+" to the grade book");
		System.out.println("Enter grades (1-100). Enter - 1 to stop");
		int n = in.nextInt();
		while (n!=-1){
			
		}
	}

}
