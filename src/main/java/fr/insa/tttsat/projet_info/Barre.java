package fr.insa.tttsat.projet_info;

import java.awt.color;
import java.util.ArrayList;
import java.util.List;

public class Barre {
	
	private Noeud start, end;
	private TypeBarre type;
	private Color color;
	private String id;
	private static List <Barre> listeBarre = new ArrayList <Barre> ();
	
	public Barre(Noeud start, Noeud end, TypeBarre type) { //noir comme couleur de base
		this(start, end, type, Color.black);
	}

	public Barre(Noeud start, Noeud end, TypeBarre type, Color color) {
		super();
		this.start = start;
		this.end = end;
		this.type = type;
		this.color = color;
		this.id = "B"+newId(); //identificateur : "BN" o� N est un entier
		listeBarre.add(this);
	}
	
	public static synchronized String newId() {
	    return String.valueOf(listeBarre.size());
	}	
	
	public Noeud getStart() {
		return start;
	}

	public void setStart(Noeud start) {
		this.start = start;
	}

	public Noeud getEnd() {
		return end;
	}

	public void setEnd(Noeud end) {
		this.end = end;
	}

	public TypeBarre getType() {
		return type;
	}

	public void setType(TypeBarre type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public static List <Barre> getListeBarre() {
		return listeBarre;
	}
}

