package sujetaventurier.modeles;

public class Joueur {
	private String name;
	private Cordonees currentPosition;
	
	public Joueur() {
		this.name = new String();
		this.currentPosition = new Cordonees();
	}
	
	public Joueur(String name, Cordonees currentPosition) {
		this.name = name;
		this.currentPosition = currentPosition;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cordonees getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(Cordonees currentPosition) {
		this.currentPosition = currentPosition;
	}

	@Override
	public String toString() {
		return "Joueur [name=" + name + ", currentPosition=" + currentPosition.toString() + "]";
	}
}
