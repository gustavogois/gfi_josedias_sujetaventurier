package sujetaventurier.main;

import java.io.IOException;
import java.util.ArrayList;

import controls.Chargement;
import sujetaventurier.modeles.Cordonees;
import sujetaventurier.modeles.Jeu;
import sujetaventurier.modeles.Joueur;

public class Main {

	public static void main(String[] args) throws IOException {
		Chargement chargement = new Chargement();
		String nomFichier = new String("chemin2.chm");
		Cordonees cordoneesInitiales = chargement.chargerCordonnees(nomFichier);
		
		Joueur joueur = new Joueur("joueur1", cordoneesInitiales);
		ArrayList<Cordonees>chemin = chargement.chargerChemin(nomFichier, cordoneesInitiales);
		
		Jeu jeu = chargement.chargerJeu(joueur, cordoneesInitiales, chemin);
		
		boolean positionValide = true;
		
		for(Cordonees c : jeu.getChemin()) {
			if(!jeu.positionEsDansLeMap(c) || !jeu.positionEstValide(c)) {
				positionValide = !positionValide;
				break;
			}
		}
	}
}
