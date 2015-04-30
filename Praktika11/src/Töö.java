
public class Töö implements Comparable<Töö> {

	private String nimetus;
	private int tähtsus;
	
	
	
	
	public Töö(String nimetus, int tähtsus) {
		super();
		this.nimetus = nimetus;
		this.tähtsus = tähtsus;
	}


	public String toString() {
		return nimetus + " - " + tähtsus;
	}


	public int compareTo(Töö töö) {
		
		if (this.tähtsus > töö.tähtsus) {
			return 1;
		} 
		else if (this.tähtsus < töö.tähtsus) {
			return -1;
		}
		else {
			return 0;
		}
	}


	

}
