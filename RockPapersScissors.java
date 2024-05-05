import java.util.Scanner;

public class RockPapersScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input their choice
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userInput = scan.nextLine();

        // Generate a random number between 1 and 3 for the computer's choice
        int computerChoice = (int) (Math.random() * 3 + 1);

        // Check who wins the game
        if (userInput.equals("rock")) {
            if (computerChoice == 2 || computerChoice == 3) {
                System.out.println("You lose!");
            } else {
                System.out.println("It's a tie!");
            }
        } else if (userInput.equals("paper")) {
            if (computerChoice == 1 || computerChoice == 3) {
                System.out.println("You lose!");
            } else {
                System.out.println("It's a tie!");
            }
        } else if (userInput.equals("scissors")) {
            if (computerChoice == 1 || computerChoice == 2) {
                System.out.println("You lose!");
            } else {
                System.out.println("It's a tie!");
            }
        } else {
            System.out.println("Invalid input, please enter rock, paper or scissors only.");
        }
        scan.close();
    }
}