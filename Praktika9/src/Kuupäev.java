
public class Kuupäev {
	int päev;
	String kuu;
	char nädalapäev;
	public Kuupäev(int päev, String kuu, char nädalapäev) {
		super();
		this.päev = päev;
		this.kuu = kuu;
		this.nädalapäev = nädalapäev;
	}
	
	public String toString() {
		String päevaNimi = "Tundmatupäev";
		switch (nädalapäev) {
		case 'e':
			päevaNimi = "Esmaspäev";
			break;
		case 't':
			päevaNimi = "Teisipäev";
			break;
		case 'k':
			päevaNimi = "Kolmapäev";
			break;
		case 'n':
			päevaNimi = "Neljapäev";
			break;
		case 'r':
			päevaNimi = "Reede";
			break;
		case 'l':
			päevaNimi = "Laupäev";
			break;
		case 'p':
			päevaNimi = "Pühapäev";
			break;
		default:
			break;
		}
		return päevaNimi + ", " + päev + " " + kuu;
	}
}
