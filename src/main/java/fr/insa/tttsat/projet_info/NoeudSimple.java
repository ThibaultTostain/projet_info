package main;

import java.util.List;

public class NoeudSimple extends Noeud
{
	private double abs;
	private double ord;
	
	public NoeudSimple(double x, double y) {
		super();
		this.abs = x;
		this.ord = y;
	}
	
	public double getAbs()
	{
		return this.abs;
	}
	
	public void setAbs(double x)
	{
		this.abs = x;
	}
	
	public double getOrd()
	{
		return this.ord;
	}
	
	public void setOrd(double y)
	{
		this.ord = y;
	}
	
	//___________________________
	
	public String toString()
	{
			return "("+this.getAbs()+", "+this.getOrd()+")";
	}
	public double distance(NoeudSimple p)
	{
		double distAbs = this.getAbs() - p.getAbs();
		double distOrd = this.ord - p.getOrd();
		
		return Math.sqrt(distAbs*distAbs + distOrd*distOrd);
	}
	public Noeud milieu(NoeudSimple p)
	{
		Noeud res = new NoeudSimple((this.getAbs() + p.getAbs()) / 2, (this.getOrd() + p.getOrd()) / 2);
		return res;
	}
	//________________________________________
	
	public static NoeudSimple max(List <NoeudSimple> list)
	{
		double absMax = list.get(0).getAbs();
		double ordMax = list.get(0).getOrd();
		
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i).getAbs() > absMax)
			{
				absMax = list.get(i).getAbs();
			}
			if(list.get(i).getOrd() > ordMax)
			{
				ordMax = list.get(i).getOrd();
			}
		}
		return new NoeudSimple(absMax, ordMax);
	}
	
	public static NoeudSimple min(List <NoeudSimple> list)
	{
		double absMin = list.get(0).getAbs();
		double ordMin = list.get(0).getOrd();
		
		for(int i = 1; i < list.size(); i++)
		{
			if(list.get(i).getAbs() < absMin)
			{
				absMin = list.get(i).getAbs();
			}
			if(list.get(i).getOrd() < ordMin)
			{
				ordMin = list.get(i).getOrd();
			}
		}
		return new NoeudSimple(absMin, ordMin);
	}
	//________________________________________
}
