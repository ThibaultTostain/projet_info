package fr.insa.tttsat.projet_info;

import java.util.ArrayList;
import java.util.List;

//On pr�suppose que le terrain est d�j� cr�� (on ne peut pas mettre de neouds simples dans un triangle).

public abstract class Noeud {//On n'utilise pas Noeud en tant que tel, cela permet de factoriser l'id de tous les points

	private String id;
	private static List <Noeud> listeNoeud = new ArrayList <Noeud> ();
	
	public Noeud() {
		super();
		this.id = "S"+newId(); //Identificateur : "SN" o� N est un entier
		listeNoeud.add(this); //Correspondance entre l'index de la list et l'id
	}
	
	public static synchronized String newId() {
	    return String.valueOf(listeNoeud.size());
	}
	
	public static List <Noeud> getListeNoeud() {
		return listeNoeud;
	}
	
	public String getId()
	{
		return this.id;
	}
}
