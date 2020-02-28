package sujetaventurier.modeles;

public class Joueur {
	private String name;
	private Cordonees currentPosition;
	
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
}
