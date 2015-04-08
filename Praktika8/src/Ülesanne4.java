
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ülesanne4 extends Application {

	@Override
	public void start(Stage peaLava) {
		Group juur = new Group();
		Scene stseen1 = new Scene(juur, 500, 500);
		
		Button nupp1 = new Button();
		nupp1.setText("Vajuta");
		
		juur.getChildren().add(nupp1);
		peaLava.setTitle("Nupp");
		peaLava.setScene(stseen1);
		peaLava.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
