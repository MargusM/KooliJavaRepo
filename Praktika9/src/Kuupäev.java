
public class Kuup�ev {
	int p�ev;
	String kuu;
	char n�dalap�ev;
	public Kuup�ev(int p�ev, String kuu, char n�dalap�ev) {
		super();
		this.p�ev = p�ev;
		this.kuu = kuu;
		this.n�dalap�ev = n�dalap�ev;
	}
	
	public String toString() {
		String p�evaNimi = "Tundmatup�ev";
		switch (n�dalap�ev) {
		case 'e':
			p�evaNimi = "Esmasp�ev";
			break;
		case 't':
			p�evaNimi = "Teisip�ev";
			break;
		case 'k':
			p�evaNimi = "Kolmap�ev";
			break;
		case 'n':
			p�evaNimi = "Neljap�ev";
			break;
		case 'r':
			p�evaNimi = "Reede";
			break;
		case 'l':
			p�evaNimi = "Laup�ev";
			break;
		case 'p':
			p�evaNimi = "P�hap�ev";
			break;
		default:
			break;
		}
		return p�evaNimi + ", " + p�ev + " " + kuu;
	}
}
