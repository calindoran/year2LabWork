package lab14;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagRisingAnimation extends Application
{
	// The main method is only needed for the IDE with limited
	// JavaFX support. Not needed for running from the command line.
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a pane
		Pane pane = new Pane();

		// Add an image view and add it to pane
		ImageView imageView = new ImageView("file:images/pepe.jpg");
		pane.getChildren().add(imageView);

		// Create a path transition. The path will be a line.
		PathTransition pt = new PathTransition(Duration.millis(5000), 
				new Line(240, 400, 240, 0), imageView);
		pt.setCycleCount(3);
//		pt.setAutoReverse(true);
		pt.play(); // Start animation

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 600, 800);
		primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
