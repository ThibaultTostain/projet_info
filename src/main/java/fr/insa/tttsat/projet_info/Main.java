package main;

public class Main
{
	public static void main (String [] args)
	{
		PointTerrain a,b,c;
		a = new PointTerrain (0, 1);
		b = new PointTerrain (0, 0);
		c = new PointTerrain (0, 5);
		
		SegmentTerrain seg = new SegmentTerrain (b, c);
		
		PointTerrain p1, p2, p3, p4;
		
		p1 = new PointTerrain (0, 0);
		p2 = new PointTerrain (2, 1);
		p3 = new PointTerrain (3, 4);
		p4 = new PointTerrain (-2, 1);

		
		System.out.println(p1.getNum());
		System.out.println(p2.getNum());
		System.out.println(p3.getNum());
		System.out.println(p4.getNum());
		
	}
}
