package co.grandcircus.roshambo;

public class RandomAI extends Player {

    public RandomAI() {
	super.setName("Roche");
    }

    @Override
    public Roshambo generateRoshambo() {
	int random = (int) (Math.random() * 3) + 1;
	switch (random) {
	case 1:
	    return Roshambo.ROCK;
	case 2:
	    return Roshambo.PAPER;
	default:
	    return Roshambo.SCISSORS;
	}
    }

}
