import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class LiigaPikaReaErind extends Exception {
	LiigaPikaReaErind() {
		super();
	}
		
	LiigaPikaReaErind(String s){
		super(s);
	}
}

public class Ülesanne3 {

	static BufferedReader lugeja;
	 
    static String loeRida() throws LiigaPikaReaErind, IOException {
       
    	String rida = lugeja.readLine();
    	if (rida.length() > 10) {
			throw new LiigaPikaReaErind("Sisestatud reas on rohkem kui 10 tähemärki.");
		} else {
			return rida;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " ";
	    lugeja = new BufferedReader(
	                       new InputStreamReader(System.in));
	    System.out.println("Väljumiseks kirjuta 'exit'");
	    while (true) {
	    try {
	    	//while (true) {
				s=loeRida();
				if (s.equals("exit")) {
					System.out.println("Da daa");
					System.exit(0);
				}
				System.out.println("<> " + s);
			//}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	    }
	}
}
