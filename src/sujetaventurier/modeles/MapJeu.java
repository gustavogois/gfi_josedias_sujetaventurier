package sujetaventurier.modeles;

public class MapJeu {
	/**
	 * Défine une position invalide avec le charactère '#'
	 */
	public static final char INVALID_POSITION = '#';
	/**
	 * Défine une position valide avec le charactère ' '
	 */
	public static final char VALID_POSITION = ' ';
	private char[][]points;
	
	/**
	 * Constructeur de MapJeu
	 * @param points
	 */
	public MapJeu(char[][] points) {
		this.points = points;
	}
	
	/**
	 * Le getter de la classe MapJeu
	 * @return le map du jeu (array de charactères)
	 */
	public char[][] getPoints() {
		return points;
	}
}
