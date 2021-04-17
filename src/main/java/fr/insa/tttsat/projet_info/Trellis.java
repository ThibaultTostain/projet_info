package main;

import java.util.ArrayList;
import java.util.List;

public class Trellis {
	Terrain terrain;
	List<Noeud> ensembleNoeud = new ArrayList<Noeud> ();
	List<Barre> ensembleBarre = new ArrayList<Barre> ();
	List<TypeBarre> ensembleTypeBarre = new ArrayList<TypeBarre> ();
	
	public Trellis(Terrain terrain, List<TypeBarre> ensembleTypeBarre) {
		super();
		this.terrain = terrain;
		this.ensembleNoeud = Noeud.getListeNoeud();
		this.ensembleBarre = Barre.getListeBarre();
		this.ensembleTypeBarre = ensembleTypeBarre;
	}
}
