
public class T�� implements Comparable<T��> {

	private String nimetus;
	private int t�htsus;
	
	
	
	
	public T��(String nimetus, int t�htsus) {
		super();
		this.nimetus = nimetus;
		this.t�htsus = t�htsus;
	}


	public String toString() {
		return nimetus + " - " + t�htsus;
	}


	public int compareTo(T�� t��) {
		
		if (this.t�htsus > t��.t�htsus) {
			return 1;
		} 
		else if (this.t�htsus < t��.t�htsus) {
			return -1;
		}
		else {
			return 0;
		}
	}


	

}
