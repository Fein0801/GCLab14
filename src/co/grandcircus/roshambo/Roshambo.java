package co.grandcircus.roshambo;

public enum Roshambo {

    ROCK, PAPER, SCISSORS;

    public String toString() {
	switch (this) {
	case ROCK:
	    return "rock";
	case PAPER:
	    return "paper";
	default:
	    return "scissors";
	}
    }

    public String winLoseTie(Roshambo r) {
	if ((this == ROCK && r == SCISSORS) || (this == PAPER && r == ROCK) || (this == SCISSORS && r == PAPER)) {
	    return "Win";
	} else if (this == r) {
	    return "Tied";
	}
	return "Lose";
    }
}
