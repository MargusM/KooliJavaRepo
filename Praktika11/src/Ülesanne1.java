import java.util.ArrayDeque;
import java.util.Deque;


public class �lesanne1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kontroll("(((((((()))))");
		kontroll(")(");
		kontroll("()");
		kontroll("((()(())())())");
		kontroll("(())) ");
		
	}
	
	public static void kontroll(String avaldis){
		
		Deque<Character> magasin = new ArrayDeque<>();
		Boolean b = true;
		
		for (int i = 0; i < avaldis.length(); i++) {
			if (avaldis.charAt(i) == '(') {
				magasin.push(avaldis.charAt(i));
			}
			else {
				if (!magasin.isEmpty()) {
					magasin.pop();
				}
				else {
					b = false;
				}
			}
		}
		
		if (!magasin.isEmpty() || !b) {
			System.out.println("Ei ole v�rdne");
		}
		else {
			System.out.println("V�rdne");
		}
		
		
		
	}

}
