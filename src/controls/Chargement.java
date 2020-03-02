package controls;

import java.io.IOException;

import donnees.ChargeurDonnees;
import sujetaventurier.modeles.Jeu;
import sujetaventurier.modeles.MapJeu;

public class Chargement {
	public Chargement() {}
	
	public Jeu chargerJeu() throws IOException {
		char[][]donneesMap = ChargeurDonnees.chargeMap();
		MapJeu mapJeu = new MapJeu(donneesMap);
		return new Jeu(mapJeu,null,null); // paramètres cordonnesinitiales et chemin à inclure en autre développement.
	}
}
