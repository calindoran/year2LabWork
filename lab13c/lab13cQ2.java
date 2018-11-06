package lab13c;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

import javafx.stage.Stage;

public class lab13cQ2 extends Application
{

	public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
		StackPane pane = new StackPane();
		
		for(int i=1; i<16; i++)
		{
			Ellipse ellipse = new Ellipse(100, 50, 100, 50);
	        ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
	        ellipse.setFill(Color.WHITE);
	        ellipse.setRotate(i*360/32);
	        pane.getChildren().add(ellipse);
	        
		}
        
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("ShowEllipse"); // Set the stage title
        primaryStage.setScene(scene);        // Place the scene in the stage
        primaryStage.show();                 // Display the stage

    }
}
