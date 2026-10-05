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
		int n = 0;
		double total = 0;
		int count = 0;
		int highest = 0;
		int lowest = 100;
		while (n<=100){
			System.out.println("Enter a grade");
			n = in.nextInt();
		if (n>=0) {
			total = total + n;
			count++;
			
			if (n > highest) {
				highest = n;
			}
			if (n<lowest) {
				lowest = n;
			}
		}
		if (n == -1) {
			double avg = total /count;
			System.out.println("The highest grade: "+highest );
			System.out.println("The lowest grade: "+lowest );
			System.out.println("The avg of grades: "+ avg);
			break;
			
		}
		
	}

}
}