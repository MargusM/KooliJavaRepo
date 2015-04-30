import java.util.PriorityQueue;
import java.util.Queue;


public class Ülesanne2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Töö> tööd = new PriorityQueue<>();
		
		Töö t1 = new Töö("tähtis tähtis töö", 100);
		Töö t2 = new Töö("mõtetu töö", 1);
		Töö t3 = new Töö("ok töö", 75);
		Töö t4 = new Töö("nii ja naa töö", 50);
		
		tööd.add(t1);
		tööd.add(t2);
		tööd.add(t3);
		tööd.add(t4);
		
		while (!tööd.isEmpty()) {
			System.out.println(tööd.poll());
		}
		
	}

}
