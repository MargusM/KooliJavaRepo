

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Tulpdiagramm extends Application {

	@Override
	public void start(Stage peaLava) throws FileNotFoundException {
		ArrayList<Integer> arvud = loeArvud(new File("arvud.txt"));
		Group g = new Group();
		Canvas c = new Canvas(arvud.size() * 30 + 30, 150);
		GraphicsContext gc = c.getGraphicsContext2D();
		
		joonistaTulbad(gc,arvud);
		
		g.getChildren().add(c);
		Scene stseen = new Scene(g);
		peaLava.setScene(stseen);
		peaLava.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static void joonistaTulbad (GraphicsContext gc, ArrayList<Integer> arvud) {
		int xcoord = 30;
		for (Integer arv : arvud) {
			if (arv > 50) {
				gc.setFill(Color.RED);
			} else {
				gc.setFill(Color.BLUE);
			}
			gc.fillRect(xcoord, 100 - arv, 20, arv);
			gc.fillText(Integer.toString(arv), xcoord + 5, 110);
			xcoord+= 30;
		}
	}
	
	public static ArrayList<Integer> loeArvud(File fail) throws FileNotFoundException {
		ArrayList<Integer> arvud = new ArrayList<>();
		Scanner sc = new Scanner(fail);
		while (sc.hasNextLine()) {
			arvud.add(Integer.parseInt(sc.nextLine()));
			
		}
		sc.close();
		return arvud;
	}
}
