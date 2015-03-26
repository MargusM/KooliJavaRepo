
public abstract class Kass implements Comparable<Kass> {
	private String nimi;
	private int vanus;
	private int pKarvkate;
	private int pSilmad;
	private int pSaba;
	public Kass(String nimi, int vanus, int pKarvkate, int pSilmad, int pSaba) {
		super();
		this.nimi = nimi;
		this.vanus = vanus;
		this.pKarvkate = pKarvkate;
		this.pSilmad = pSilmad;
		this.pSaba = pSaba;
	}
	public int getpKarvkate() {
		return pKarvkate;
	}
	public void setpKarvkate(int pKarvkate) {
		this.pKarvkate = pKarvkate;
	}
	public int getpSilmad() {
		return pSilmad;
	}
	public void setpSilmad(int pSilmad) {
		this.pSilmad = pSilmad;
	}
	public int getpSaba() {
		return pSaba;
	}
	public void setpSaba(int pSaba) {
		this.pSaba = pSaba;
	}
	public String getNimi() {
		return nimi;
	}
	public int getVanus() {
		return vanus;
	}
	
	abstract public String getTõug();
	
	public int punktidKokku() {
		return pKarvkate + pSilmad + pSaba;
	}
	
	public String toString() {
		return nimi + " [" + getTõug() + "] vanus " + (vanus > 12 ? ((int)(vanus / 12) + "a " + vanus%12 + "k") : (vanus + "k")) + ". Punkte: " + punktidKokku();
	}
	
	public int compareTo(Kass kass){
		if (this.punktidKokku() > kass.punktidKokku()) {
			return 1;
		} else if (this.punktidKokku() < kass.punktidKokku()) {
			return -1;
		} else {
			return 0;
		}
	}
}
