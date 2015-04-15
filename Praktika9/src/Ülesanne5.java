
class Reede13Erind extends Exception {
	Reede13Erind() {
		super();
	}
		
	Reede13Erind(String s){
		super(s);
	}
}

public class �lesanne5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuup�ev kp1 = new Kuup�ev(13, "jaanuar", 'r');
		Kuup�ev kp2 = new Kuup�ev(5, "juuli", 'k');
		Kuup�ev kp3 = new Kuup�ev(22, "september", 'e');

		try {
			if (esimesesDekaadis(kp3)) {
				System.out.println(kp3.toString());
			}
			
			if (esimesesDekaadis(kp2)) {
				System.out.println(kp2.toString());
			}
			
			if (esimesesDekaadis(kp1)) {
				System.out.println(kp1.toString());
			}
		} catch (Reede13Erind e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static boolean esimesesDekaadis(Kuup�ev kp) throws Reede13Erind {
		if (kp.p�ev == 13 && kp.n�dalap�ev == 'r') {
			throw new Reede13Erind("REEDE 13!!!");
		}
		if (kp.p�ev < 11) {
			return true;
		} else {
			return false;
		}
	}

}
