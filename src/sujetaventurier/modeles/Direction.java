package sujetaventurier.modeles;

public enum Direction {
	Nord('N'),
	Sud('S'),
	Est('E'),
	Ouest('O');
	
	public final char direction;
	
	private Direction(char c) {
		this.direction = c;
	}
}
