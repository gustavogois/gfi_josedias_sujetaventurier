package sujetaventurier.main;

import java.io.IOException;

import controls.Chargement;

public class Main {

	public static void main(String[] args) throws IOException {
		Chargement chargement = new Chargement();
		chargement.chargerJeu();
	}
}
