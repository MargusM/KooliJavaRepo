
public abstract class Teos implements Comparable<Teos> {
	private String nimi;
	private String tähis;
	private String laenutaja;
	static int roheline = 1;
	static int puudub = 14;
	static int kollane = 30;
	static int sinine = 60;
	
	public String getNimi() {
		return nimi;
	}
	public String getTähis() {
		return tähis;
	}
	public String getLaenutaja() {
		return laenutaja;
	}
	public Teos(String nimi, String tähis, String laenutaja) {
		super();
		this.nimi = nimi;
		this.tähis = tähis;
		this.laenutaja = laenutaja;
	}
	
	abstract boolean kasHoidlast();
	
	int laenutusAeg() {
		if (tähis.equals("roheline")) {
			return roheline;
		} else if (tähis.equals("puudub")) {
			return puudub;
		} else if (tähis.equals("kollane")) {
			return kollane;
		} else if (tähis.equals("sinine")) {
			return sinine;
		} else {
			return 0;
		}
	}

	public String toString() {
		return nimi + ", " + tähis + " [" + (kasHoidlast() ? "Laos" : "Kohapeal") + "]";
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










