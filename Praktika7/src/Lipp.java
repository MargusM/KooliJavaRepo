
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Lipp extends Application {

	@Override
	public void start(Stage peaLava) {
		
		Group juur = new Group(); // luuakse juur
		
		Rectangle ristkülik1 = new Rectangle(50, 50, 500, 105);
		Rectangle ristkülik2 = new Rectangle(50, 155, 500, 105);
		Rectangle ristkülik3 = new Rectangle(50, 260, 500, 105);
		
		ristkülik1.setFill(Color.BLUE);
		ristkülik3.setFill(Color.WHITE);
		
		Bloom bloom = new Bloom();
        bloom.setThreshold(0);
        Lighting l = new Lighting();
        
        ristkülik1.setEffect(bloom);
        ristkülik1.setEffect(l);
        l.setSurfaceScale(4.0);
        ristkülik3.setEffect(l);
		
		juur.getChildren().add(ristkülik1); //ristkülik lisatakse juure alluvaks
		juur.getChildren().add(ristkülik2);
		juur.getChildren().add(ristkülik3);
		
		Scene stseen1 = new Scene(juur, 600, 535, Color.SNOW); // luuakse stseen
		
		peaLava.setTitle("Must Ruut"); // lava tiitelribale pannakse tekst
		
		peaLava.setScene(stseen1); // lavale lisatakse stseen
		
		peaLava.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
