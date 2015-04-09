
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HiireAsukoht extends Application {

	@Override
	public void start(Stage peaLava) {
		FlowPane flow = new FlowPane();
		Scene stseen = new Scene(flow, 500, 500, Color.SNOW);
		Label kiri = new Label();
		
		
		flow.setOnMousePressed( new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				asukoht(kiri, me.getX(), me.getY());
			}
		});
		
		flow.getChildren().add(kiri);
		peaLava.setScene(stseen);
		peaLava.show();
		
	}
	
	
	public void asukoht(Label kiri, double x, double y) {
		kiri.setText("(" + x + ";" + y + ")");
		kiri.setLayoutX(x);
		kiri.setLayoutY(y);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
