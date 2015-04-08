
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
	 
	    Canvas lõuend = new Canvas(535, 535); // luuakse lõuend
	 
	    GraphicsContext gc = lõuend.getGraphicsContext2D(); // graafiline sisu
	 
	    gc.fillRect(50, 50, 435, 435); // ruut
	 
	    juur.getChildren().add(lõuend);  // lõuend lisatakse juure alluvaks
	 
	    Scene stseen1 = new Scene(juur);  // luuakse stseen  
	 
	    peaLava.setTitle("Must ruut");  // lava tiitelribale pannakse tekst
	 
	    peaLava.setScene(stseen1);  // lavale lisatakse stseen
	 
	    peaLava.show();  // lava tehakse nähtavaks
	}

	public static void main(String[] args) {
		launch(args);
	}
}
