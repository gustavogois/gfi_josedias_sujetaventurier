package sujetaventurier.models;

public class Map {
	public static final char INVALID_POSITION = '#';
	public static final char VALID_POSITION = ' ';
	private char[][]points;
	
	public char[][] getPoints() {
		return points;
	}
	public void setPoints(char[][] points) {
		this.points = points;
	}
}
