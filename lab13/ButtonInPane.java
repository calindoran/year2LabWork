package lab13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application 
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        StackPane pane = new StackPane(); // Make a pane to work with

        // create a new button, and add it to the pane�s list of children
        pane.getChildren().add(new Button("OK"));

        // Make a new scene, containing the pane
        Scene scene = new Scene(pane, 200, 50);
//        primaryStage.setResizable(false);
        primaryStage.setTitle("Button in a pane"); // Set the stage title
        primaryStage.setScene(scene);              // Put scene in the stage
        primaryStage.show();                       // Display the stage
    }
    
}
