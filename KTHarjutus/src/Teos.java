
public abstract class Teos implements Comparable<Teos> {
	private String nimi;
	private String t�his;
	private String laenutaja;
	static int roheline = 1;
	static int puudub = 14;
	static int kollane = 30;
	static int sinine = 60;
	
	public String getNimi() {
		return nimi;
	}
	public String getT�his() {
		return t�his;
	}
	public String getLaenutaja() {
		return laenutaja;
	}
	public Teos(String nimi, String t�his, String laenutaja) {
		super();
		this.nimi = nimi;
		this.t�his = t�his;
		this.laenutaja = laenutaja;
	}
	
	abstract boolean kasHoidlast();
	
	int laenutusAeg() {
		if (t�his.equals("roheline")) {
			return roheline;
		} else if (t�his.equals("puudub")) {
			return puudub;
		} else if (t�his.equals("kollane")) {
			return kollane;
		} else if (t�his.equals("sinine")) {
			return sinine;
		} else {
			return 0;
		}
	}

	public String toString() {
		return nimi + ", " + t�his + " [" + (kasHoidlast() ? "Laos" : "Kohapeal") + "]";
	}
	
	public int compareTo(Teos teos) {
		int i = this.nimi.compareTo(teos.nimi);	
		if (i==0) {
			if (this.laenutusAeg() > teos.laenutusAeg()) {
				return 1;
			} else if (this.laenutusAeg() < teos.laenutusAeg()) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return i;
		}
	}
	
}










