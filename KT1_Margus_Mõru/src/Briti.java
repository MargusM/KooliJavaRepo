
public class Briti extends Kass {
	
	public Briti(String nimi, int vanus, int pKarvkate, int pSilmad, int pSaba) {
		super(nimi, vanus, pKarvkate, pSilmad, pSaba);
		// TODO Auto-generated constructor stub
	}

	
	public String getTõug() {
		// TODO Auto-generated method stub
		return "briti";
	}
	
	public int punktidKokku() {
		return super.punktidKokku() + super.getpSilmad();
	}

}
