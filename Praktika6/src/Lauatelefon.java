
public class Lauatelefon extends Telefon implements Comparable<Lauatelefon> {

	private String aadress;
	
	
	
	public Lauatelefon(int telefoninumber, String helin, String aadress) {
		super(telefoninumber, helin);
		this.aadress = aadress;
	}
	
	

	public Lauatelefon(int telefoninumber, String aadress) {
		super(telefoninumber, "blop, blop");
		this.aadress = aadress;
	}



	public String getAadress() {
		return aadress;
	}

	public int viimasedNumbrid(int n) {
		return super.getTelefoninumber() % (int)Math.pow(10, n);
	}

	@Override
	String tähtisInfo() {
		// TODO Auto-generated method stub
		return this.aadress;
	}

	@Override
	public int compareTo(Lauatelefon lt) {
		// TODO Auto-generated method stub
		if (this.viimasedNumbrid(3) > lt.viimasedNumbrid(3)) {
			return 1;
		} else if (this.viimasedNumbrid(3) < lt.viimasedNumbrid(3)) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return "Lauatelefon ("+viimasedNumbrid(3) + ") asub " + tähtisInfo() + " ja teeb " + super.getHelin();
	}
}
