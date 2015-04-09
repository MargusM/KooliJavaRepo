
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ülesanne3 extends Application {

	@Override
	public void start(Stage peaLava) {
		Group juur = new Group();
		Scene stseen1 = new Scene(juur, 500, 500);
		Circle ring1 = new Circle(100, 100, 100, Color.RED);
		Circle ring2 = new Circle(250, 250, 100, Color.RED);
		juur.getChildren().add(ring1);
		juur.getChildren().add(ring2);
		peaLava.setTitle("Ring");
		peaLava.setScene(stseen1);
		
		double x2= stseen1.getWidth();
		
		class Käsitleja implements EventHandler<MouseEvent>{
			public void handle(MouseEvent me) {
				System.out.println("Hiir läks ringist välja " + stseen1.getWidth());
			}
		}
		
		
		
		ring1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				System.out.println("Hiir läks ringi peale");
			}
		});
		
		Käsitleja käsitleja1 = new Käsitleja();
		ring1.addEventHandler(MouseEvent.MOUSE_EXITED, käsitleja1);
		
		//ring1.addEventHandler(MouseEvent.MOUSE_ENTERED, new Käsitleja());
		//ring1.setOnMouseEntered(käsitleja1);
		//ring1.setOnMouseEntered(new Käsitleja());
		
		ring1.setOnMouseEntered(event -> ring1.setFill(Color.GREEN));
		ring2.setOnMouseEntered(event -> ring2.setFill(Color.GREEN));
		ring1.setOnMouseExited(event -> ring1.setFill(Color.RED));
		ring2.setOnMouseExited(event -> ring2.setFill(Color.RED));
		
		
		
		peaLava.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
