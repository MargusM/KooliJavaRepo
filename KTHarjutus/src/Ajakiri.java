
public class Ajakiri extends Teos implements Trükitud {
	private int aasta;
	private int number;
	
	public int getAasta() {
		return aasta;
	}

	public int getNumber() {
		return number;
	}

	public Ajakiri(String nimi, String tähis, String laenutaja, int aasta,
			int number) {
		super(nimi, tähis, laenutaja);
		this.aasta = aasta;
		this.number = number;
	}

	@Override
	public double paberiKulu(int i) {
		// TODO Auto-generated method stub
		return (double)Math.round(i*50/8);
	}

	@Override
	boolean kasHoidlast() {
		// TODO Auto-generated method stub
		if (aasta > 2000) {
			return false;
		} else {
			return true;
		}
	}
	
	public String toString(){
		return aasta + "/" + number + " " + super.toString();
	}

}
