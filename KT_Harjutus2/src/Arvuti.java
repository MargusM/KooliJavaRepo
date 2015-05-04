import java.time.LocalDateTime;


public class Arvuti {

	private String tootja;
	private String mudel;
	private String opSüsteem;
	private boolean kiirtöö;
	private java.time.LocalDateTime registreerimisAeg = null;
	private double arveSumma;
	
	public Arvuti(String tootja, String mudel, String opSüsteem,
			String kiirtöö, LocalDateTime registreerimisAeg) {
		super();
		this.tootja = tootja;
		this.mudel = mudel;
		this.opSüsteem = opSüsteem;
		if (kiirtöö == "kiirtöö") 
			this.kiirtöö = true;
		else
			this.kiirtöö = false;
		this.registreerimisAeg = registreerimisAeg;
	}
	
	public String getTootja() {
		return tootja;
	}
	
	public String getMudel() {
		return mudel;
	}

	public String getOpSüsteem() {
		return opSüsteem;
	}

	public boolean onKiirtöö() {
		return kiirtöö;
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
	
	public void lõpetaTöö(int ajakulu, double hind) {
		
	}
}
