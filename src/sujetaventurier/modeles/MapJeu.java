package sujetaventurier.modeles;

public class MapJeu {
	/**
	 * D�fine une position invalide avec le charact�re '#'
	 */
	public static final char INVALID_POSITION = '#';
	/**
	 * D�fine une position valide avec le charact�re ' '
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
	 * @return le map du jeu (array de charact�res)
	 */
	public char[][] getPoints() {
		return points;
	}
}
