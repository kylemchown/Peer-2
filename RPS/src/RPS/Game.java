package RPS;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Game {

	Game() {

	}

	public void runGame() {
		Scanner s = new Scanner(System.in);
		int totalGames = 0;
		int computerWins = 0;
		int playerWins = 0;
		int ties = 0;
		int playerRock = 0;
		int playerPaper = 0;
		int playerScissors = 0;
		int playerLizard = 0;
		int playerSpock = 0;
		String input = "";

		while (input != "exit") {
			System.out.println("rock/paper/scissors/lizard/spock");
			input = s.nextLine();
			int r = ThreadLocalRandom.current().nextInt(1, 6);
			switch (input) {
			case "rock":

				playerRock++;
				totalGames++;

				if (r == 1) {
					System.out.println("Rock! It's a tie");
					ties++;
				} else if (r == 2) {
					computerWins++;
					System.out.println("Paper! Computer wins");
				} else if (r == 3) {
					playerWins++;
					System.out.println("Scissors! You win");
				} else if (r == 4) {
					playerWins++;
					System.out.println("Lizard! You win");
				} else if (r == 5) {
					computerWins++;
					System.out.println("Spock! Computer wins");
				}
				break;
			case "paper":

				playerPaper++;
				totalGames++;

				if (r == 1) {
					System.out.println("Rock! You win");
					playerWins++;
				} else if (r == 2) {
					System.out.println("Paper! It's a tie");
					ties++;
				} else if (r == 3) {
					computerWins++;
					System.out.println("Scissors! Computer wins");
				} else if (r == 4) {
					computerWins++;
					System.out.println("Lizard! Computer wins");
				} else if (r == 5) {
					playerWins++;
					System.out.println("Spock! You win");
				}
				break;
			case "scissors":

				playerScissors++;
				totalGames++;

				if (r == 1) {
					System.out.println("Rock! Computer wins");
					computerWins++;
				} else if (r == 2) {
					System.out.println("Paper! You win");
					playerWins++;
				} else if (r == 3) {
					System.out.println("Scissors! It's a tie");
					ties++;
				} else if (r == 4) {
					playerWins++;
					System.out.println("Lizard! You win");
				} else if (r == 5) {
					computerWins++;
					System.out.println("Spock! Computer wins");
				}
				break;
			case "lizard":

				playerLizard++;
				totalGames++;

				if (r == 1) {
					System.out.println("Rock! Computer wins");
					computerWins++;
				} else if (r == 2) {
					System.out.println("Paper! You win");
					playerWins++;
				} else if (r == 3) {
					System.out.println("Scissors! Computer wins");
					computerWins++;
				} else if (r == 4) {
					ties++;
					System.out.println("Lizard! It's a tie");
				} else if (r == 5) {
					playerWins++;
					System.out.println("Spock! You win");
				}
				break;
			case "spock":

				playerSpock++;
				totalGames++;

				if (r == 1) {
					System.out.println("Rock! You win");
					playerWins++;
				} else if (r == 2) {
					System.out.println("Paper! Computer wins");
					computerWins++;
				} else if (r == 3) {
					System.out.println("Scissors! You win");
					playerWins++;
				} else if (r == 4) {
					computerWins++;
					System.out.println("Lizard! Computer wins");
				} else if (r == 5) {
					ties++;
					System.out.println("Spock! It's a tie");
				}
				break;
			case "exit":
				System.out.println("Total games played: " + totalGames);
				System.out.println("Computer wins: " + computerWins);
				System.out.println("Computer percentage: " + computerWins / totalGames * 100);
				System.out.println("Your wins: " + playerWins);
				System.out.println("Your percentage: " + playerWins / totalGames * 100);
				System.out.println("Ties: " + ties);
				System.out.println("Tie percentage: " + ties / totalGames * 100);
				if (playerRock >= playerPaper && playerRock >= playerScissors && playerRock >= playerLizard
						&& playerRock >= playerSpock) {
					System.out.println("Your most commonly picked action was Rock: " + playerRock + ", Percentage: "
							+ (playerRock / totalGames * 100));
				} else if (playerPaper >= playerRock && playerPaper >= playerScissors && playerPaper >= playerLizard
						&& playerPaper >= playerSpock) {
					System.out.println("Your most commonly picked action was Paper: " + playerPaper + ", Percentage: "
							+ (playerPaper / totalGames * 100));
				} else if (playerScissors > playerRock && playerScissors >= playerPaper
						&& playerScissors >= playerLizard && playerScissors >= playerSpock) {
					System.out.println("Your most commonly picked action was Scissors: " + playerScissors
							+ ", Percentage: " + (playerScissors / totalGames * 100));
				} else if (playerLizard >= playerRock && playerLizard >= playerScissors && playerLizard >= playerPaper
						&& playerLizard >= playerSpock) {
					System.out.println("Your most commonly picked action was Lizard: " + playerLizard + ", Percentage: "
							+ (playerLizard / totalGames * 100));
				} else {
					System.out.println("Your most commonly picked action was Spock: " + playerSpock + ", Percentage: "
							+ (playerSpock / totalGames * 100));
				}
				System.exit(0);
			}
		}
	}
}