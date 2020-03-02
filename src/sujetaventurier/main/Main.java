package sujetaventurier.main;

import java.io.IOException;

import controls.Chargement;
import sujetaventurier.modeles.Jeu;
import sujetaventurier.modeles.Joueur;

public class Main {

	public static void main(String[] args) throws IOException {
		Chargement chargement = new Chargement();
		Joueur joueur = new Joueur("joueur1", null);
		Jeu jeu = chargement.chargerJeu(joueur);
	}
}
