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
		Cordonees cordoneesInitiales = chargement.chargerCordonnees("chemin1.chm");
		
		Joueur joueur = new Joueur("joueur1", cordoneesInitiales);
		ArrayList<Cordonees>chemin = chargement.chargerChemin("chemin1.chm", cordoneesInitiales);
		
		Jeu jeu = chargement.chargerJeu(joueur, cordoneesInitiales, chemin);	
	}
}
