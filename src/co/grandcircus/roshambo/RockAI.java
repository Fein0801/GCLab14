package co.grandcircus.roshambo;

public class RockAI extends Player {

    public RockAI() {
	super.setName("Goron");
    }

    @Override
    public Roshambo generateRoshambo() {
	return Roshambo.ROCK;
    }

}
