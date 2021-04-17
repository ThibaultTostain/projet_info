package fr.insa.tttsat.projet_info;

public class PointTerrain {
	
	private double abs, ord;
	private int num;
	private static int counter = -1;

	public PointTerrain(double abs, double ord) {
		this.abs = abs;
		this.ord = ord;
		this.num = newNum();
	}

	public static synchronized int newNum() {
		counter ++;
		if(counter == 3) {counter = 0;}
		return counter;
	}
	
	public double getAbs() {
		return abs;
	}

	public void setAbs(double abs) {
		this.abs = abs;
	}

	public double getOrd() {
		return ord;
	}

	public void setOrd(double ord) {
		this.ord = ord;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public static double angle (PointTerrain A, PointTerrain B, PointTerrain C) { //angle ABC pointu positif
		PointTerrain BA = new PointTerrain(A.getAbs()-B.getAbs(), A.getOrd()-B.getOrd());
		PointTerrain BC = new PointTerrain(C.getAbs()-B.getAbs(), C.getOrd()-B.getOrd());
		
		double num = BA.getAbs()*BC.getAbs() + BA.getOrd()*BC.getOrd();
		double denom = Math.sqrt(BA.getAbs()*BA.getAbs() + BA.getOrd()*BA.getOrd()) * Math.sqrt(BC.getAbs()*BC.getAbs() + BC.getOrd()*BC.getOrd());
		return Math.acos(num/denom);
	}
	
	public boolean col (SegmentTerrain seg) {
		return angle(this, seg.getStart(), seg.getEnd()) == 0 || angle(this, seg.getStart(), seg.getEnd()) == Math.PI;
	}
	
	public boolean pos (SegmentTerrain seg) {
		return 0 < angle(this, seg.getStart(), seg.getEnd()) && angle(this, seg.getStart(), seg.getEnd()) > Math.PI;
	}
	
	public boolean neg (SegmentTerrain seg) {
		return Math.PI < angle(this, seg.getStart(), seg.getEnd()) && angle(this, seg.getStart(), seg.getEnd()) > 2*Math.PI;
	}
	
}
