
class SamamargilisuseErind extends Exception {
	SamamargilisuseErind() {
		super();
	}
		
	SamamargilisuseErind(String s){
		super(s);
	}
}

public class Ülesanne4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			juhuslikudArvud();
		} catch (SamamargilisuseErind e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void juhuslikudArvud() throws SamamargilisuseErind {
		int i = (int)(Math.random()*20) - 10;
		int k = (int)(Math.random()*20) - 10;
		
		if (i*k >= 0) {
			throw new SamamargilisuseErind("Sama märgiga juhuarvud.");
		}
	}

}
