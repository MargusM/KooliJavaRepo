
public class Raamat extends Teos implements Trükitud {
	private String autor;
	
	public String getAutor() {
		return autor;
	}

	public Raamat(String nimi, String tähis, String laenutaja, String autor) {
		super(nimi, tähis, laenutaja);
		this.autor = autor;
	}

	public double paberiKulu(int i) {
		// TODO Auto-generated method stub
		return (double)Math.round(i/16);
	}

	boolean kasHoidlast() {
		// TODO Auto-generated method stub
		if (super.getTähis() == "sinine") {
			return true;
		} else if (super.getTähis() == "kollane") {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return autor + " - " + super.toString();
	}

}
