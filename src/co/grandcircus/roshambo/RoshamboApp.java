package co.grandcircus.roshambo;

import java.util.Scanner;

public class RoshamboApp {

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	HumanPlayer player = new HumanPlayer();
	Player goron = new RockAI();
	Player roche = new RandomAI();
	Player com = null;
	String userName = Validator.getString(userInput, "What is your name? ");
	player.setName(userName);
	String playerAI = "";
	while (!playerAI.equalsIgnoreCase(goron.getName()) && !playerAI.equalsIgnoreCase(roche.getName())) {
	    System.out.printf("Would you like to play against %s or %s? ", goron.getName(), roche.getName());
	    playerAI = userInput.next();

	    if (playerAI.equalsIgnoreCase(goron.getName())) {
		com = goron;
	    } else {
		com = roche;
	    }
	}
	
	userInput.nextLine();

	int wins = 0;
	int losses = 0;
	String run = "yes";
	while(run.equalsIgnoreCase("yes")) {
	    String selection = Validator.getValidRoshamboInput(userInput, "Rock, paper, or scissors? ");
	    Roshambo playerChoice = player.generateRoshambo(selection);
	    Roshambo comChoice = com.generateRoshambo();

	    String winOrLose = playerChoice.winLoseTie(comChoice);
	    System.out.println(player.getName() + ": " + playerChoice);
	    System.out.println(com.getName() + ": " + comChoice);
	    System.out.println("You " + winOrLose);

	    if (winOrLose.equalsIgnoreCase("Win")) {
		wins++;
	    } else if (winOrLose.equalsIgnoreCase("Lose")) {
		losses++;
	    }
	    
	    System.out.println("Would you like to continue? (y/n)");
	    run = userInput.next();
	}
	
	System.out.println("Wins: " + wins);
	System.out.println("Losses: " + losses);
	System.out.println("Goodbye.");
	userInput.close();
    }
}
