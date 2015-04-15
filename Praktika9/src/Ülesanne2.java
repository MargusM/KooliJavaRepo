
public class Ülesanne2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = new int[10];
		
		try {
			i[11] = 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Erind käes nagu naksti.");
		}
	}
}
