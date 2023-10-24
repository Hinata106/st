import java.util.Scanner;

public class VotingSystem {
    private int voteCount;

    public VotingSystem() {
        this.voteCount = 0;
    }

    public void vote() {
        this.voteCount++;
    }

    public int getVoteCount() {
        return this.voteCount;
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the voting system!");
        System.out.println("Type 'VOTE' to cast your vote. Type 'EXIT' to end voting.");

        String input = scanner.nextLine().toUpperCase();

        while (!input.equals("EXIT")) {
            if (input.equals("VOTE")) {
                votingSystem.vote();
                System.out.println("Thank you for voting!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }

            System.out.println("Type 'VOTE' to cast your vote. Type 'EXIT' to end voting.");
            input = scanner.nextLine().toUpperCase();
        }

        System.out.println("Voting has ended. Total votes: " + votingSystem.getVoteCount());

        scanner.close();
    }
}

