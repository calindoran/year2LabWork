package lab13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application 
{
    // The main method is only needed for the IDE with limited JavaFX support. 
    // Not needed for running from the command line.
    public static void main(String[] args)
    {
    	Application.launch(args);
    }
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        // Create a scene and place a button in the scene

        Button btOK = new Button("OK");			// create a button
        Scene scene = new Scene(btOK, 200, 250);// create a scene WITH the button
        primaryStage.setTitle("MyJavaFX");		// Set the stage title
        primaryStage.setScene(scene);			// Place the scene in the stage
        primaryStage.setX(700.0);				// X axis position
        primaryStage.setY(100.0);				// Y axis position
        primaryStage.show();					// Display the stage
        
        Stage stage = new Stage();      // Create a new stage
        stage.setTitle("Second Stage"); // Set the stage title
        // Set a scene with a button in the stage
        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        //stage.setX(100.0);				// Puts them side by side
        stage.show();                   // Display the stage

    }
}
