
public abstract class Telefon {
	private int telefoninumber;
	private String helin;
	public int getTelefoninumber() {
		return telefoninumber;
	}
	public String getHelin() {
		return helin;
	}
	public Telefon(int telefoninumber, String helin) {
		super();
		this.telefoninumber = telefoninumber;
		this.helin = helin;
	}
	
	abstract String tähtisInfo();
}
