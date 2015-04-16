import java.util.ArrayList;


public class Tellimus {
	private String tellija;
	private ArrayList<Pitsa> pitsad;
	private int ootamisaeg;
	
	public Tellimus(String tellija, ArrayList<Pitsa> pitsad, int ooteaeg) {
		super();
		this.tellija = tellija;
		this.pitsad = pitsad;
		this.ootamisaeg = ooteaeg;
	}
	
	public double maksumus() throws LiigaPikkOotamineErind {
		if (ootamisaeg > 30) {
			throw new LiigaPikkOotamineErind("Liiga pikalt pidi ootama. TASUTA");
		}
		double maksumus = 0.00;
		for (Pitsa pitsa : pitsad) {
			maksumus += pitsa.getHind();
		}
		return maksumus;
	}

	@Override
	public String toString() {
		return "Tellimus [tellija=" + tellija + ", pitsad=" + pitsad
				+ ", ootamisaeg=" + ootamisaeg + "]";
	}
	
}
