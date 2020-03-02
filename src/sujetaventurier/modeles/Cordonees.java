package sujetaventurier.modeles;

public class Cordonees {
	private int xPosition;
	private int yPosition;
	
	public Cordonees() {
		this.xPosition = 0;
		this.yPosition = 0;
	}
	
	public Cordonees(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	@Override
	public String toString() {
		return "Cordonees [xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
	}

	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
}
