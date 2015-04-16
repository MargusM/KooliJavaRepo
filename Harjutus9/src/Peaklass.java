import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Peaklass {
	
	static ArrayList<Tellimus> tellimused;
	
	public static ArrayList<Tellimus> loeTellimused(File fail) throws FileNotFoundException {
		
		ArrayList<Tellimus> tellimused = new ArrayList<>();
		Scanner sc = new Scanner(fail);
		Random r = new Random();
		
		while (sc.hasNextLine()) {
			
			String[] osad = sc.nextLine().split(";");
			String tellija = osad[0];
			
			int ooteaeg = 10 + r.nextInt(26);
			ArrayList<Pitsa> pitsad = new ArrayList<>();
			
			for (int i = 1; i < osad.length; i++) {
				String[] pitsaosad = osad[i].split("/");
				pitsad.add(new Pitsa(pitsaosad[0], Double.parseDouble(pitsaosad[1])));
			}
			
			tellimused.add(new Tellimus(tellija, pitsad, ooteaeg));
		}
		
		sc.close();
		return tellimused;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		tellimused = loeTellimused(new File("tellimused.txt"));
		PrintWriter pw = new PrintWriter(new File("liigaPikkOoteaeg.txt"));
		double maksumusKokku = 0;
		
		
		for (Tellimus t : tellimused) {
			System.out.println(t);
			try {
				double maksumus = t.maksumus();
				maksumusKokku += maksumus;
				System.out.println("Maksis kokku: " + maksumus + " eurot");
			} catch (LiigaPikkOotamineErind e) {
				//System.out.println(e.getMessage());
				pw.println(t);
			}
		}
		System.out.println("Maksumus kokku: " + maksumusKokku);
		pw.close();
	}

}
