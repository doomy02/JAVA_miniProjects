import java.util.Scanner;

public class NumberGuesser {

	public static int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public static void main(String[] args) {
		int no = getRandomNumber(1, 100);
		int tries = 0;
		boolean found = false;

		Scanner scan = new Scanner(System.in);
		System.out.println("Guess the number!");

		while (found == false) {
			System.out.print("Your guess: ");
			int number = scan.nextInt();
			tries++;

			if (number == no) {
				System.out.println();
				System.out.println("GOOD JOB, you found the number!");
				found = true;
			} else if (number < no) {
				System.out.println("The number is higher!");
			} else if (number > no) {
				System.out.println("The number is lower!");
			}

		}
		System.out.println("Tries: " + tries);

	}

}
