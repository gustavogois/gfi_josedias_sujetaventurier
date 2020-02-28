package sujetaventurier.models;

public class Player {
	private String name;
	private Coordinates currentPosition;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coordinates getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(Coordinates currentPosition) {
		this.currentPosition = currentPosition;
	}
}
