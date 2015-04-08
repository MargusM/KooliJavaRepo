package ee.ut.oop.xox;

import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Xox extends Application {
	private Image background = new Image("board.png");

	/**
	 * Hoiab mängu seisu: a) kelle käik, b) kuhu on keegi käinud, c) kas võitja
	 * on selgunud.
	 */
	private Board game;

	/** Selle lõuendi peale joonistatakse mängulaud. */
	private Canvas canvas;

	/** Vaikekonstruktor, mis algväärtustab mängulaua ja programmi enda. */
	public Xox() {
		canvas = new Canvas(300.0, 300.0);
		canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				handleClickOnBoard(event.getX(), event.getY());
			}

		});

		startNewGame();
	}

	/**
	 * Tühjendab mängulaua joonistades selle nullist uuesti, sealjuures ei
	 * arvesta mängu seisuga, st ei joonista käike.
	 */
	private void resetBoardCanvas() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.clearRect(0, 0, canvas.getHeight(), canvas.getWidth());

		gc.drawImage(background, 0.0, 0.0, canvas.getHeight(),
				canvas.getWidth());
	}

	/**
	 * Kui on selgunud võitja, siis see funktsioon lõpetab mängu ja joonistab
	 * joone/jooned, kus saadi kokku kolm järjestikust märki.
	 */
	private void finishGame() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setLineWidth(5);
		gc.setStroke(Color.BLUE);
		
		gc.save();

		for (WinLine wl : game.getWinLines()) {
			gc.strokeLine(boardToCanvasX(wl.getX1()),
					boardToCanvasY(wl.getY1()), boardToCanvasX(wl.getX2()),
					boardToCanvasY(wl.getY2()));
		}

		gc.restore();
		
		


	}

	/**
	 * Teisendab mängulaua x-koordinaadi lõuendi y-koordinaadiks leides antud
	 * mänguvälja keskme y-koordinaadi.
	 * 
	 * @param boardY
	 *            Mänguvälja y-koordinaat [0..2]
	 * @return Lõuendi koordinaat vastavalt kanvase suurusele.
	 */
	private double boardToCanvasY(int boardY) {
		return canvas.getHeight() / 6 * (1 + boardY * 2);
	}

	/**
	 * Teisendab mängulaua x-koordinaadi lõuendi x-koordinaaiks leides antud
	 * mänguvälja keskme x-koordinaadi.
	 * 
	 * @param boardY
	 *            Mänguvälja x-koordinaat [0..2]
	 * @return Lõuendi koordinaat vastavalt lõuendi suurusele.
	 */
	private double boardToCanvasX(int boardX) {
		return canvas.getWidth() / 6 * (1 + boardX * 2);
	}

	/**
	 * See funktsioon kutsutakse välja, kui kasutaja klikib mängulaual.
	 * 
	 * @param clickX
	 *            Kasutaja klikitud koha x-koordinaat.
	 * @param clickY
	 *            Kasutaja klikitud koha y-koordinaat.
	 */
	private void handleClickOnBoard(double clickX, double clickY) {
		double minDisdance = Double.MAX_VALUE;
		int nearestBoardX = 0;
		int nearestBoardY = 0;
		// Arvutame, millise mänguvälja keskpunktile kõige lähemale klikk tehti.
		for (int boardX = 0; boardX < 3; boardX++)
			for (int boardY = 0; boardY < 3; boardY++) {
				double centerX = boardToCanvasX(boardX);
				double centerY = boardToCanvasY(boardY);
				double distance = Math.sqrt(Math.pow(centerX - clickX, 2)
						+ Math.pow(centerY - clickY, 2));

				if (distance < minDisdance) {
					minDisdance = distance;
					nearestBoardX = boardX;
					nearestBoardY = boardY;
				}
			}

		react(nearestBoardX, nearestBoardY);
	}
	
	private void react(int nearestBoardX, int nearestBoardY) {
		// Reageerime klikile vaid siis, kui mäng on alustatud ja käib.
				if (game.isRunning() && !game.isOccupied(nearestBoardX, nearestBoardY)) {
					if (game.getTurn() == Player.PLAYER_X)
						drawX(canvas, nearestBoardX, nearestBoardY);
					else
						drawO(canvas, nearestBoardX, nearestBoardY);

					game.makeMove(nearestBoardX, nearestBoardY);

					if (!game.isRunning()) {
						finishGame();
					}
				}
	}

	/**
	 * Alustab uue mängu.
	 */
	private void startNewGame() {
		resetBoardCanvas();

		game = new Board();
	}

	private Pane getButtonPane() {
		Pane pane = new AnchorPane();

		Button startButton = new Button("Start");
		AnchorPane.setLeftAnchor(startButton, 10.0);
		AnchorPane.setTopAnchor(startButton, 10.0);
		AnchorPane.setRightAnchor(startButton, 10.0);

		startButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				startNewGame();
			}
		});

		Button exitButton = new Button("Exit");
		AnchorPane.setLeftAnchor(exitButton, 10.0);
		AnchorPane.setTopAnchor(exitButton, 50.0);
		AnchorPane.setRightAnchor(exitButton, 10.0);

		exitButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Platform.exit();
			}
		});
		
		
		pane.getChildren().addAll(startButton, exitButton);

		return pane;
	}

	private void drawMove(Canvas canvas, int boardX, int boardY, String file) {
		Image imageX = new Image(file);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		gc.save();

		gc.translate(boardToCanvasX(boardX), boardToCanvasY(boardY));

		Random rnd = new Random();

		gc.rotate(rnd.nextDouble() * 60 - 30);
		gc.drawImage(imageX, -imageX.getHeight() / 2, -imageX.getWidth() / 2);

		gc.restore();


	}

	private void drawX(Canvas canvas, int x, int y) {
		drawMove(canvas, x, y, "ttt_x.png");
	}

	private void drawO(Canvas canvas, int x, int y) {
		drawMove(canvas, x, y, "ttt_o.png");
	}

	private Pane getMainPane() {
		Pane pane = new FlowPane();

		Pane buttonPane = this.getButtonPane();

		pane.getChildren().addAll(canvas, buttonPane);
		return pane;
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Trips-traps-trull");

		Scene s = new Scene(getMainPane());

		// Lisame CSS'iga taustapildi ja määrame, kui suureks see pilt peaks venitatama.
		s.getRoot().setStyle("-fx-background-image: url('background.jpg'); -fx-background-size: 400px 300px;");
		stage.setMinWidth(400.0);
		stage.setResizable(false);
		stage.setScene(s);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
