package sujetaventurier.modeles;

public enum Direction {
	North('N'),
	South('S'),
	East('E'),
	West('O');
	
	public final char direction;
	
	private Direction(char c) {
		this.direction = c;
	}
}
