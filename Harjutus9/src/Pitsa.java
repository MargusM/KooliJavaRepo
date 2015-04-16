
public class Pitsa {
	private String nimi;
	private double hind;
	public Pitsa(String nimi, double hind) {
		super();
		this.nimi = nimi;
		this.hind = hind;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public double getHind() {
		return hind;
	}
	public void setHind(double hind) {
		this.hind = hind;
	}
	
	public String toString() {
		return nimi + " - " + hind;
	}
}
