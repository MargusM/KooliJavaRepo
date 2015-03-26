
public class Jaava extends Kass {

	public Jaava(String nimi, int vanus, int pKarvkate, int pSilmad, int pSaba) {
		super(nimi, vanus, pKarvkate, pSilmad, pSaba);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTõug() {
		// TODO Auto-generated method stub
		return "jaava";
	}

	public int punktidKokku() {
		return super.punktidKokku() + super.getpSaba();
	}
}
