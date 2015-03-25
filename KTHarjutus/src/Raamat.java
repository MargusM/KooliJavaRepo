
public class Raamat extends Teos implements Tr�kitud {
	private String autor;
	
	public String getAutor() {
		return autor;
	}

	public Raamat(String nimi, String t�his, String laenutaja, String autor) {
		super(nimi, t�his, laenutaja);
		this.autor = autor;
	}

	public double paberiKulu(int i) {
		// TODO Auto-generated method stub
		return (double)Math.round(i/16);
	}

	boolean kasHoidlast() {
		// TODO Auto-generated method stub
		if (super.getT�his() == "sinine") {
			return true;
		} else if (super.getT�his() == "kollane") {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return autor + " - " + super.toString();
	}

}
