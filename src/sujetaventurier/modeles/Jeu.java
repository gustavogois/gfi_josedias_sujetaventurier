package sujetaventurier.modeles;

import java.util.ArrayList;

public class Jeu {
	private MapJeu mapJeu;
	private Cordonees cordonneesInitiales;
	private ArrayList<Cordonees>chemin;
	
	/**
	 * Constructeur de Jeu
	 * @param mapJeu le map du jeu
	 * @param cordonneesInitiales les cordonn�es initiales du joueur
	 * @param chemin le chemin � suivre
	 */
	//todo 
	public Jeu(MapJeu mapJeu, Cordonees cordonneesInitiales, ArrayList<Cordonees>chemin) {
		this.mapJeu = mapJeu;
		this.cordonneesInitiales = cordonneesInitiales;
		this.chemin = chemin;
	}
	
	/**
	 * Getter de MapJeu
	 * @return le map du jeu
	 */
	public MapJeu getMapJeu() {
		return mapJeu;
	}
	
	/**
	 * Setter de MapJeu
	 * @param mapJeu map � ajouter au jeu
	 */
	public void setMapJeu(MapJeu mapJeu) {
		this.mapJeu = mapJeu;
	}
	
	/**
	 * Getter de CordonnesInitiales
	 * @return les cordonn�es initiales du joueur
	 */
	public Cordonees getCordonneesInitiales() {
		return cordonneesInitiales;
	}
	
	/**
	 * Setter de cordonn�es initiales
	 * @param cordonneesInitiales les cordonn�es initiales du joueur
	 */
	public void setCordonneesInitiales(Cordonees cordonneesInitiales) {
		this.cordonneesInitiales = cordonneesInitiales;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Cordonees> getChemin() {
		return chemin;
	}
	
	public void setChemin(ArrayList<Cordonees> chemin) {
		this.chemin = chemin;
	}
}
