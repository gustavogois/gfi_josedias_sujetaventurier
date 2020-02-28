package sujetaventurier.main;

import java.io.IOException;

import donnees.ChargeurMap;
import sujetaventurier.modeles.Jeu;
import sujetaventurier.modeles.MapJeu;

public class Main {

	public static void main(String[] args) throws IOException {
		Jeu jeu = chargerJeu();
	}
	
	private static Jeu chargerJeu() throws IOException {
		char[][]donneesMap = ChargeurMap.chargeMap();
		MapJeu mapJeu = new MapJeu(donneesMap);
		
		return new Jeu(mapJeu,null,null); // paramètres cordonnesinitiales et chemin à inclure en autre développement.
	}
}
