import java.util.PriorityQueue;
import java.util.Queue;


public class �lesanne2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<T��> t��d = new PriorityQueue<>();
		
		T�� t1 = new T��("t�htis t�htis t��", 100);
		T�� t2 = new T��("m�tetu t��", 1);
		T�� t3 = new T��("ok t��", 75);
		T�� t4 = new T��("nii ja naa t��", 50);
		
		t��d.add(t1);
		t��d.add(t2);
		t��d.add(t3);
		t��d.add(t4);
		
		while (!t��d.isEmpty()) {
			System.out.println(t��d.poll());
		}
		
	}

}
