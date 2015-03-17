

public class Mobiiltelefon extends Telefon implements Ajanäitaja{
	private String omanik;
	private boolean pildistab = false;
	
	public Mobiiltelefon(int telefoninumber, String helin, String omanik,
			boolean pildistab) {
		super(telefoninumber, helin);
		this.omanik = omanik;
		this.pildistab = pildistab;
	}
	
	

	public Mobiiltelefon(int telefoninumber, String helin, String omanik) {
		super(telefoninumber, helin);
		this.omanik = omanik;
	}



	public String getOmanik() {
		return omanik;
	}

	public boolean isPildistab() {
		return pildistab;
	}

	@Override
	String tähtisInfo() {
		// TODO Auto-generated method stub
		return omanik;
	}

	@Override
	public String näitaAega() {
		// TODO Auto-generated method stub
		java.util.Calendar kalender = new java.util.GregorianCalendar();
		
		return kalender.get(java.util.Calendar.HOUR_OF_DAY) + ":" + kalender.get(java.util.Calendar.MINUTE) + ":" + kalender.get(java.util.Calendar.SECOND);
	}

}
