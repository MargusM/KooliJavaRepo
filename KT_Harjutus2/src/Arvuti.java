import java.time.LocalDateTime;


public class Arvuti {

	private String tootja;
	private String mudel;
	private String opS�steem;
	private boolean kiirt��;
	private java.time.LocalDateTime registreerimisAeg = null;
	private double arveSumma;
	
	public Arvuti(String tootja, String mudel, String opS�steem,
			String kiirt��, LocalDateTime registreerimisAeg) {
		super();
		this.tootja = tootja;
		this.mudel = mudel;
		this.opS�steem = opS�steem;
		if (kiirt�� == "kiirt��") 
			this.kiirt�� = true;
		else
			this.kiirt�� = false;
		this.registreerimisAeg = registreerimisAeg;
	}
	
	public String getTootja() {
		return tootja;
	}
	
	public String getMudel() {
		return mudel;
	}

	public String getOpS�steem() {
		return opS�steem;
	}

	public boolean onKiirt��() {
		return kiirt��;
	}

	public java.time.LocalDateTime getRegistreerimisAeg() {
		return registreerimisAeg;
	}

	public void setRegistreerimisAeg(java.time.LocalDateTime registreerimisAeg) {
		this.registreerimisAeg = registreerimisAeg;
	}

	public void setArveSumma(double arveSumma) {
		this.arveSumma = arveSumma;
	}

	public double getArveSumma() {
		return arveSumma;
	}
	
	public void l�petaT��(int ajakulu, double hind) {
		
	}
}
