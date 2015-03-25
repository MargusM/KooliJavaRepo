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
		double viivisP�evas;
		int p�evadeArv = new Integer(Peaklass.p�evadeArv);
		
		for (int i = 0; i < teos.size(); i++) {
			int laenutusAeg = new Integer(teos.get(i).laenutusAeg());
			if (laenutusAeg < p�evadeArv && laenutusAeg != 0) {
				switch (teos.get(i).getT�his()) {
				case "roheline":
					viivisP�evas = 2;
					break;
				case "puudub":
					viivisP�evas = 0.15;
					break;
				case "kollane":
					viivisP�evas = 0.05;
					break;
				case "sinine":
					viivisP�evas = 0.05;
				default:
					viivisP�evas = 0;
					break;
				}
				
				d = d + ((p�evadeArv - laenutusAeg) * viivisP�evas);
			}
		}
		
		return d;
	}
	
	public int iseV�etud(ArrayList<Teos> teos) {
		int hulk = 0;
		for (int i = 0; i < teos.size(); i++) {
			if (teos.get(i).getLaenutaja() == this.nimi) {
				hulk ++;
			}
		}
		
		return hulk;
	}
}