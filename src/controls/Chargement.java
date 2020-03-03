package controls;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import donnees.ChargeurDonnees;
import sujetaventurier.modeles.Boussole;
import sujetaventurier.modeles.Cordonees;
import sujetaventurier.modeles.Jeu;
import sujetaventurier.modeles.Joueur;
import sujetaventurier.modeles.MapJeu;

public class Chargement {
	public Chargement() {}
	
	public Jeu chargerJeu(Joueur joueur, Cordonees cordoneesInitiales, ArrayList<Cordonees>chemin) throws IOException {
		char[][]donneesMap = ChargeurDonnees.chargeMap();
		MapJeu mapJeu = new MapJeu(donneesMap);
		return new Jeu(mapJeu,cordoneesInitiales,chemin);
	}
	
	public Cordonees chargerCordonnees(String nomFichier) throws IOException {
		String donnees =  ChargeurDonnees.chargeFichierAvecChemin(nomFichier);
		String[] donneesCordonnees = donnees.split("\n");
		String[] cordonees = donneesCordonnees[0].split(",");
		
		int cordonneesX = Integer.parseInt(cordonees[0]);
		int cordonneesY = Integer.parseInt(cordonees[1]);
		
		return new Cordonees(cordonneesX, cordonneesY);
	}
	
	public ArrayList<Cordonees> chargerChemin(String nomFichier, Cordonees cordoneesInitiales) throws IOException {
		String donnees =  ChargeurDonnees.chargeFichierAvecChemin(nomFichier);
		String[] donneesChemin = donnees.split("\n");
		ArrayList<Cordonees>itineraire = new ArrayList<Cordonees>();
		Boussole boussole = new Boussole();
		itineraire.add(cordoneesInitiales);
		
		for(int i = 0; i < donneesChemin[1].length(); i++) {
			char c = donneesChemin[1].charAt(i);
			boussole.setDirection(c);
			if(i==0) {
				Cordonees cordoneesCourantes = getCurrentCoordinates(cordoneesInitiales,boussole);
				itineraire.add(cordoneesCourantes);
			}else {
				Cordonees cordoneesAnterieures = itineraire.get(i);
				Cordonees cordoneesCourantes = getCurrentCoordinates(cordoneesAnterieures,boussole);
				itineraire.add(cordoneesCourantes);
			}
		}
		return new ArrayList<Cordonees>(itineraire);
	}
	
	private static Cordonees getCurrentCoordinates(Cordonees cordoneesAnterieures, Boussole direction ) {
		Cordonees cordonees;
		switch(direction.getDirection()) {
		case Nord:
			cordonees = new Cordonees(cordoneesAnterieures.getxPosition(), cordoneesAnterieures.getyPosition() - 1);
			return cordonees;
		case Sud:
			cordonees = new Cordonees(cordoneesAnterieures.getxPosition(), cordoneesAnterieures.getyPosition() + 1);
			return cordonees;
		case Est:
			cordonees = new Cordonees(cordoneesAnterieures.getxPosition() + 1, cordoneesAnterieures.getyPosition());
			return cordonees;
		case Ouest:
			cordonees = new Cordonees(cordoneesAnterieures.getxPosition() - 1, cordoneesAnterieures.getyPosition());
			return cordonees;
		default:
			return new Cordonees();
		}	
	}
}
