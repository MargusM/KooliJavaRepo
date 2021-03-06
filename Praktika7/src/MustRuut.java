
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MustRuut extends Application {

	public void start(Stage peaLava) {
		 
	    Group juur = new Group(); // luuakse juur
	 
	    Canvas l�uend = new Canvas(535, 535); // luuakse l�uend
	 
	    GraphicsContext gc = l�uend.getGraphicsContext2D(); // graafiline sisu
	 
	    gc.fillRect(50, 50, 435, 435); // ruut
	 
	    juur.getChildren().add(l�uend);  // l�uend lisatakse juure alluvaks
	 
	    Scene stseen1 = new Scene(juur);  // luuakse stseen  
	 
	    peaLava.setTitle("Must ruut");  // lava tiitelribale pannakse tekst
	 
	    peaLava.setScene(stseen1);  // lavale lisatakse stseen
	 
	    peaLava.show();  // lava tehakse n�htavaks
	}

	public static void main(String[] args) {
		launch(args);
	}
}
