package lab13c;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class lab13cQ1 extends Application
{

	public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
		// Create a circle and set its properties
        Circle circle = new Circle();
        Text text = new Text();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
        text.setText("Calins wild ride!");
        text.setFont(Font.font(12.0));
        text.setFill(Color.AQUA);

        // Create a pane to hold the circle
        StackPane pane = new StackPane();
        pane.getChildren().addAll(circle,text);

        // Create a 200-x-200 scene from the pane, and place the scene in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle"); // Set the stage title
        primaryStage.setScene(scene);        // Place the scene in the stage
        primaryStage.show();                 // Display the stage

    }
}
