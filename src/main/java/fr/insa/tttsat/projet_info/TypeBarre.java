package fr.insa.tttsat.projet_info;

import java.util.ArrayList;
import java.util.List;

public class TypeBarre {
	
	private float cout;
	private double longMin, longMax;
	private double resTension, resCompression;
	private String id;
	private static List <TypeBarre> listeTypeBarre = new ArrayList <TypeBarre> ();
	
	public TypeBarre(float cout, double longMin, double longMax, double resTension, double resCompression) {
		super();
		this.cout = cout;
		this.longMin = longMin;
		this.longMax = longMax;
		this.resTension = resTension;
		this.resCompression = resCompression;
		this.id = "TB"+newId(); //identificateur : "TBN" o� N est un entier
		listeTypeBarre.add(this);
	}

	public static synchronized String newId()
	{
	    return String.valueOf(listeTypeBarre.size());
	}
}
