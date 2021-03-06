import java.util.ArrayList;
import java.util.Collections;


//parima karvkatte leidmise meetodit ei ole, ei j�udnud teha.
public class V�istlus {
	private String kirjeldus;
	private ArrayList<Kass> kass = new ArrayList<Kass>();
	public V�istlus(String kirjeldus, ArrayList<Kass> kass) {
		super();
		this.kirjeldus = kirjeldus;
		this.kass = kass;
		Collections.sort(this.kass);
	}

	public String getKirjeldus() {
		return kirjeldus;
	}
	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}
	public ArrayList<Kass> getKass() {
		return kass;
	}
	
	public Kass getV�itja() {
		return this.kass.get(this.kass.size()-1);
	}
	
	public int tiitliSaajaid() {
		int arv = 0;
		for (Kass kass2 : kass) {
			if (kass2.punktidKokku() > 50) {
				arv++;
			}
		}
		return arv;
	}
	
	public String toString() {
		return kirjeldus + " \nV�itis " + getV�itja().toString() + " \nCH tiitli sai " + tiitliSaajaid() + " kassi.";
	}
	
}
 