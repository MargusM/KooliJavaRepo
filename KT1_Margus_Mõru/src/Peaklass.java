import java.io.FileNotFoundException;
import java.util.ArrayList;

// parima karvkatte leidmise meetodit ei ole, ei jõudnud teha.
public class Peaklass {
	static ArrayList<Kass> briti = new ArrayList<Kass>();
	static ArrayList<Kass> jaava = new ArrayList<Kass>();
	static ArrayList<Kass> muu = new ArrayList<Kass>();
	
	static void failistKassid() throws FileNotFoundException {
		java.io.File fail = new java.io.File("kassid.txt"); 
		if (fail.exists()){
			int mitu = 0;
			System.out.println("Fail on olemas");
			java.util.Scanner sc = new java.util.Scanner(fail);
			while (sc.hasNextLine()) {
			    String rida = sc.nextLine();
			    String[] tükid = rida.split(";");
			    
			    if (tükid[0].contains("Briti")) {
					Kass k1 = new Briti(tükid[1], Integer.parseInt(tükid[2]), Integer.parseInt(tükid[3]), Integer.parseInt(tükid[4]), Integer.parseInt(tükid[5]));
					briti.add(k1);
			    } else if (tükid[0].contains("Jaava")) {
					Kass k1 = new Jaava(tükid[1], Integer.parseInt(tükid[2]), Integer.parseInt(tükid[3]), Integer.parseInt(tükid[4]), Integer.parseInt(tükid[5]));
					jaava.add(k1);
			    } else {
			    	Kass k1 = new Muu(tükid[1], Integer.parseInt(tükid[2]), Integer.parseInt(tükid[3]), Integer.parseInt(tükid[4]), Integer.parseInt(tükid[5]));
					muu.add(k1);
				}
			    mitu++;
			}
			if (mitu > 0) {
				System.out.println("Failist leiti " + mitu + " kassi.");
			} else {
				System.out.println("Failis polnud ühtegi kassi.");
				System.exit(0);
			}

		}
		else {
			System.out.println("Kasside andmete faili ei leitud");
			System.exit(0);
		}
		     

	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		failistKassid();
		
		Võistlus v1 = new Võistlus("Briti kassid omavahel", briti);
		Võistlus v2 = new Võistlus("Jaava kassid omavahel", jaava);
		Võistlus v3 = new Võistlus("Tundmatu tõuga kassid omavahel", muu);
		
		
		System.out.println(v1.toString());
		System.out.println();
		System.out.println(v2.toString());
		System.out.println();
		System.out.println(v3.toString());
		System.out.println();
		
		ArrayList<Kass> kiisud = new ArrayList<Kass>();
		kiisud.addAll(briti);
		kiisud.addAll(jaava);
		kiisud.addAll(muu);
		
		Võistlus v4 = new Võistlus("Kõik kassid koos", kiisud);
		
		System.out.println(v4.toString());
		System.out.println();
		System.out.println("Kõik kiisud koos.");
		for (Kass kass : v4.getKass()) {
			System.out.println(kass.toString());
		}
	}

}
