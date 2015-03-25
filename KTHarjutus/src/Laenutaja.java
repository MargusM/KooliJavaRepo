import java.util.ArrayList;

public class Laenutaja {
	private String nimi;

	public Laenutaja(String nimi) {
		super();
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}
	
	public double viivis(ArrayList<Teos> teos) {
		double d = 0;
		double viivisPäevas;
		int päevadeArv = new Integer(Peaklass.päevadeArv);
		
		for (int i = 0; i < teos.size(); i++) {
			int laenutusAeg = new Integer(teos.get(i).laenutusAeg());
			if (laenutusAeg < päevadeArv && laenutusAeg != 0) {
				switch (teos.get(i).getTähis()) {
				case "roheline":
					viivisPäevas = 2;
					break;
				case "puudub":
					viivisPäevas = 0.15;
					break;
				case "kollane":
					viivisPäevas = 0.05;
					break;
				case "sinine":
					viivisPäevas = 0.05;
				default:
					viivisPäevas = 0;
					break;
				}
				
				d = d + ((päevadeArv - laenutusAeg) * viivisPäevas);
			}
		}
		
		return d;
	}
	
	public int iseVõetud(ArrayList<Teos> teos) {
		int hulk = 0;
		for (int i = 0; i < teos.size(); i++) {
			if (teos.get(i).getLaenutaja() == this.nimi) {
				hulk ++;
			}
		}
		
		return hulk;
	}
}
