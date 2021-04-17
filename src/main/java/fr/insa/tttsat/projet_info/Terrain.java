package fr.insa.tttsat.projet_info;

import java.util.ArrayList;
import java.util.List;

public class Terrain {
	
	double absMin, absMax, ordMin, ordMax;
	List <TriangleTerrain> ensembleTriangleTerrain = new ArrayList <TriangleTerrain> ();
	public Terrain(double absMin, double absMax, double ordMin, double ordMax, List<TriangleTerrain> ensembleTriangleTerrain) {
		super();
		this.absMin = absMin;
		this.absMax = absMax;
		this.ordMin = ordMin;
		this.ordMax = ordMax;
		this.ensembleTriangleTerrain = ensembleTriangleTerrain;
	}
	
	
	
}