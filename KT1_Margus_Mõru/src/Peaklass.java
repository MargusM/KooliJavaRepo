import java.io.FileNotFoundException;
import java.util.ArrayList;

// parima karvkatte leidmise meetodit ei ole, ei j�udnud teha.
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
			    String[] t�kid = rida.split(";");
			    
			    if (t�kid[0].contains("Briti")) {
					Kass k1 = new Briti(t�kid[1], Integer.parseInt(t�kid[2]), Integer.parseInt(t�kid[3]), Integer.parseInt(t�kid[4]), Integer.parseInt(t�kid[5]));
					briti.add(k1);
			    } else if (t�kid[0].contains("Jaava")) {
					Kass k1 = new Jaava(t�kid[1], Integer.parseInt(t�kid[2]), Integer.parseInt(t�kid[3]), Integer.parseInt(t�kid[4]), Integer.parseInt(t�kid[5]));
					jaava.add(k1);
			    } else {
			    	Kass k1 = new Muu(t�kid[1], Integer.parseInt(t�kid[2]), Integer.parseInt(t�kid[3]), Integer.parseInt(t�kid[4]), Integer.parseInt(t�kid[5]));
					muu.add(k1);
				}
			    mitu++;
			}
			if (mitu > 0) {
				System.out.println("Failist leiti " + mitu + " kassi.");
			} else {
				System.out.println("Failis polnud �htegi kassi.");
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
		
		V�istlus v1 = new V�istlus("Briti kassid omavahel", briti);
		V�istlus v2 = new V�istlus("Jaava kassid omavahel", jaava);
		V�istlus v3 = new V�istlus("Tundmatu t�uga kassid omavahel", muu);
		
		
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
		
		V�istlus v4 = new V�istlus("K�ik kassid koos", kiisud);
		
		System.out.println(v4.toString());
		System.out.println();
		System.out.println("K�ik kiisud koos.");
		for (Kass kass : v4.getKass()) {
			System.out.println(kass.toString());
		}
	}

}
