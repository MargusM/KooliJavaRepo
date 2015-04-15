import java.io.BufferedReader;
import java.io.IOException;


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
	 
    static String loeRida() {
        try {
            return lugeja.readLine();
        }
        catch (IOException e) {
            System.out.println("Sisendi-väljundiviga1.");
            return "";
        }
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
