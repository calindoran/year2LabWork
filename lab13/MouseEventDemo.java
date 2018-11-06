package lab13;
// Author	: Oisin Cawley
// Date		: Feb 2017
// Purpose	: Demo of mouse event handling

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

	//The alternative to using a Lambda Expression is to create our own Handlerclass.
	class MouseDraggedHandlerClass implements EventHandler<MouseEvent> {
		@Override
		public void handle(MouseEvent e) {
			text.setX(e.getX());
			text.setY(e.getY());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	// The main method is only needed for the IDE with limited JavaFX support.
	// Not needed for running from the command line.
	 
	Text text; // Make it global for the handler to be able to see it.

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		Pane pane = new Pane();
		text = new Text(20, 20, "Programming is fun");
		pane.getChildren().addAll(text);
		
		// MouseDraggedHandlerClass mdh = new MouseDraggedHandlerClass(); 
		// Using a Lambda Expression instead
		text.setOnMouseDragged(e -> {
			text.setX(e.getX());
			text.setY(e.getY());
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("MouseEventDemo"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

}
