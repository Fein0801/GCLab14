package co.grandcircus.roshambo;

public class HumanPlayer extends Player {

    private String playerChoice;

    public String getPlayerChoice() {
	return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
	this.playerChoice = playerChoice;
    }

    @Override
    public Roshambo generateRoshambo() {
        if (playerChoice.equalsIgnoreCase("rock"))
            return Roshambo.ROCK;
        else if (playerChoice.equalsIgnoreCase("paper"))
            return Roshambo.PAPER;
        else if (playerChoice.equalsIgnoreCase("scissors"))
            return Roshambo.SCISSORS;
        else
            return null;
    }

}
