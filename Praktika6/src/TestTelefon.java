
public class TestTelefon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lauatelefon t1 = new Lauatelefon(123456789, "til tol", "K�la");
		Lauatelefon t2 = new Lauatelefon(1234, "Tiigi tn");
		Lauatelefon t3 = new Lauatelefon(123614587, "trr trr", "Tamme tn");
		Lauatelefon t4 = new Lauatelefon(120781232, "la la laa", "Mustika p�ik");
		Lauatelefon t5 = new Lauatelefon(120786012, "li la lo", "Tartu");
		Lauatelefon t6 = new Lauatelefon(1202342, "tirilipsti", "Firmas");
		Lauatelefon t7 = new Lauatelefon(1207082345, "Linn");
		Mobiiltelefon m1 = new Mobiiltelefon(12341234, "bzz bzz", "Peeter", true);
		Mobiiltelefon m2 = new Mobiiltelefon(1234124, "til til", "Onu");
		System.out.println(t1.t�htisInfo());
		System.out.println(((Lauatelefon)t1).viimasedNumbrid(3));
		System.out.println(m1.n�itaAega());
		
		System.out.println(m2.getHelin());
		System.out.println(m1.t�htisInfo());
		
		Lauatelefon[] tel = new Lauatelefon[] {t1, t2, t3, t4, t5, t6, t7} ;
		
		System.out.println("Enne sorteerimist:");
		for (Lauatelefon lauatelefon : tel) {
			System.out.println(lauatelefon.toString());
		}
		
		//
		java.util.Arrays.sort(tel);
		
		System.out.println("Peale sorteerimist: ");
		for (Lauatelefon lauatelefon : tel) {
			System.out.println(lauatelefon.toString());
		}
	
	}

}
