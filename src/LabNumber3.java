import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num = 0;
		String ifContinue;
		String name;

		// ask for user name
		System.out.print("Please enter your name: ");
		name = scnr.nextLine();
		do {// do-while loop ask user if they want to continue
			// prompt user for enter a number
			do {
				System.out.print(name + ", Enter a number between 1 and 100: ");

				// check if the input are integer
				while (!scnr.hasNextInt()) {
					System.out.print("That's not a valid number!" + "\n" + "Enter a number between 1 and 100: ");
					scnr.next();// garbage line important to have. clear the input.
				}
				num = scnr.nextInt();
				// check if the input are positive
			} while (num <= 0);

			// Determine the number odd or even
			if ((num % 2) == 0) { // even number
				if (num <= 25) {
					System.out.println("Even and less than 25.");
				} else if (num > 60) {
					System.out.println(num + " Even.");

				} else {
					System.out.println("Even.");
				}

			}

			else { // odd number
				if (num <= 60) { // if the number is smaller than 60
					System.out.println(num + " Odd.");
				}

				else {// if the number is odd and greater than 60
					System.out.println(num + " Odd and over 60.");
				}
			}

			// prompt user to enter if they want to continue
			System.out.print("Continue? (y/n): ");

			ifContinue = scnr.next();
		} while (ifContinue.equalsIgnoreCase("y"));// determine the input
		System.out.println("Bye!");
		scnr.close();
	}
}
