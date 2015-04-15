
class Reede13Erind extends Exception {
	Reede13Erind() {
		super();
	}
		
	Reede13Erind(String s){
		super(s);
	}
}

public class Ülesanne5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kuupäev kp1 = new Kuupäev(13, "jaanuar", 'r');
		Kuupäev kp2 = new Kuupäev(5, "juuli", 'k');
		Kuupäev kp3 = new Kuupäev(22, "september", 'e');

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
	
	public static boolean esimesesDekaadis(Kuupäev kp) throws Reede13Erind {
		if (kp.päev == 13 && kp.nädalapäev == 'r') {
			throw new Reede13Erind("REEDE 13!!!");
		}
		if (kp.päev < 11) {
			return true;
		} else {
			return false;
		}
	}

}
