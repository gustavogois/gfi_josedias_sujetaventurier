package sujetaventurier.modeles;

public class Boussole {
	private Direction direction;

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		for(Direction d : Direction.values()) {
			if(direction == d.direction) {
				this.direction = d;
				break;
			};
		}
	}
}
