package co.grandcircus.roshambo;

public class HumanPlayer extends Player {

    @Override
    public Roshambo generateRoshambo() {
	return null;
    }

    public Roshambo generateRoshambo(String selection) {
	if (selection.equalsIgnoreCase("rock"))
	    return Roshambo.ROCK;
	else if (selection.equalsIgnoreCase("paper"))
	    return Roshambo.PAPER;
	else if (selection.equalsIgnoreCase("scissors"))
	    return Roshambo.SCISSORS;
	else
	    return null;
    }

}
