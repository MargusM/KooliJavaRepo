
public class Arvutiparandus {

	static boolean url;
	public static void main(String[] args) {
		getNimekiri(args);
	}
	
	public static void getNimekiri (String[] args) {
		if (args[0].startsWith("http://") || args[0].startsWith("https://")) {
			url = true;
		}
		else {
			url = false;
		}
	}
	
	//protected Arvuti loeArvuti (String kirjeldus) {

	//}

}
