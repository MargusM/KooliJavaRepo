
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class V�rvid extends Application {

	@Override
	public void start(Stage peaLava) {
		Group juur = new Group(); // luuakse juur
		 
	    Canvas l�uend = new Canvas(535, 535); // luuakse l�uend
	 
	    GraphicsContext gc = l�uend.getGraphicsContext2D(); // graafiline sisu
	    
	    peaLava.setTitle("V�rvid");
	    
	    
	}

	
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
