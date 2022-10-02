import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	final static String[] str = { "Rock", "Paper", "Scissors" };

	public static String getRandom(String[] str) {
		Random random = new Random();
		return str[random.nextInt(str.length)];
	}

	public static void main(String[] args) {
		boolean playing = true;
		int scorePC = 0;
		int scorePlayer = 0;
		int scoreDraws = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Let's play Rock/Paper/Scissors!");
		System.out.println("Press 'Q' if you want to quit!");
		System.out.println();

		while (playing == true) {
			System.out.print("Your choise: ");
			String choise = scan.nextLine();
			String PC = getRandom(str);

			if (choise.equals("Q")) {
				playing = false;
			} else if (choise.equals("Rock") && PC.equals("Scissors")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("Player Won!");
				System.out.println();

				scorePlayer++;
			} else if (choise.equals("Rock") && PC.equals("Paper")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("PC Won!");
				System.out.println();

				scorePC++;
			} else if (choise.equals("Rock") && PC.equals("Rock")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("Draw!");
				System.out.println();

				scoreDraws++;
			} else if (choise.equals("Paper") && PC.equals("Rock")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("Player Won!");
				System.out.println();

				scorePlayer++;
			} else if (choise.equals("Paper") && PC.equals("Scissors")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("PC Won!");
				System.out.println();

				scorePC++;
			} else if (choise.equals("Paper") && PC.equals("Paper")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("Draw!");
				System.out.println();

				scoreDraws++;
			} else if (choise.equals("Scissors") && PC.equals("Paper")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("Player Won!");
				System.out.println();

				scorePlayer++;
			} else if (choise.equals("Scissors") && PC.equals("Rock")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("PC Won!");
				System.out.println();

				scorePC++;
			} else if (choise.equals("Scissors") && PC.equals("Scissors")) {
				System.out.println("Player: " + choise + ", PC: " + PC);
				System.out.println("Draw!");
				System.out.println();

				scoreDraws++;
			} else {
				System.out.println("Wrong input! Try again!");
			}

		}
		System.out.println();
		System.out.println("Thanks for playing!");
		System.out.println("Player's score: " + scorePlayer + ", PC's score: " + scorePC + ", Draws: " + scoreDraws);
	}

}
