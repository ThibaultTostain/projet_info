package main;

import java.util.ArrayList;
import java.util.List;

public class TriangleTerrain {
	
	private PointTerrain start, middle, end;
	private String id;
	private static List<TriangleTerrain> listeTriangleTerrain = new ArrayList<TriangleTerrain> ();
	
	public TriangleTerrain(PointTerrain start, PointTerrain middle, PointTerrain end) {
		super();
		this.start = start;
		this.middle = middle;
		this.end = end;
		this.id = "TT"+newId(); //identificateur : "TTN" où N est un entier
		listeTriangleTerrain.add(this);
	}
	
	public static List<TriangleTerrain> getListeTriangleTerrain() {
		return listeTriangleTerrain;
	}
	
	public static synchronized String newId() {
	    return String.valueOf(listeTriangleTerrain.size());
	}

	public PointTerrain getStart() {
		return start;
	}

	public void setStart(PointTerrain start) {
		this.start = start;
	}

	public PointTerrain getMiddle() {
		return middle;
	}

	public void setMiddle(PointTerrain middle) {
		this.middle = middle;
	}

	public PointTerrain getEnd() {
		return end;
	}

	public void setEnd(PointTerrain end) {
		this.end = end;
	}

	public String getId() {
		return id;
	}
}
