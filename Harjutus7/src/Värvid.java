
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Värvid extends Application {

	@Override
	public void start(Stage peaLava) {
		Group juur = new Group(); // luuakse juur
		 
	    Canvas lõuend = new Canvas(535, 535); // luuakse lõuend
	 
	    GraphicsContext gc = lõuend.getGraphicsContext2D(); // graafiline sisu
	    
	    peaLava.setTitle("Värvid");
	    
	    
	}

	
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
