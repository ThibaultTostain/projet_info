package fr.insa.tttsat.projet_info;

public class SegmentTerrain {
	
    
    // Test github
    
	private PointTerrain start, end;

	public SegmentTerrain(PointTerrain start, PointTerrain end) {
		this.start = start;
		this.end = end;
	}

	public PointTerrain getStart() {
		return start;
	}

	public void setStart(PointTerrain start) {
		this.start = start;
	}

	public PointTerrain getEnd() {
		return end;
	}

	public void setEnd(PointTerrain end) {
		this.end = end;
	}
}
