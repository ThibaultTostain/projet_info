package main;

public class NoeudAppui extends Noeud {
	
	private TriangleTerrain triangleTerrain;
	private int numPoint;
	private double position;
	
	public NoeudAppui(TriangleTerrain triangleTerrain, int numPremierPoint, double position) {
		super();
		this.triangleTerrain = triangleTerrain;
		if(numPremierPoint < 0 || numPremierPoint > 2) {throw new Error("Point mismatch");}
		this.numPoint = numPremierPoint;
		if(position < 0 || position > 1) {throw new Error("Position mismatch");}
		this.position = position;
	}

	public TriangleTerrain getTriangleTerrain() {
		return triangleTerrain;
	}

	public int getNumPremierPoint() {
		return numPoint;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}
	
	
	
	
}
