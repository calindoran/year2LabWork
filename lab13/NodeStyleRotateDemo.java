package lab13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class NodeStyleRotateDemo extends Application 
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        // Create a scene and place a button in the scene
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;");  // create blue-bordered button
        pane.getChildren().add(btOK);

        pane.setRotate(45); // rotate pane and set its style before adding to scene
        pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
        primaryStage.setScene(scene);                 // Place the scene in the stage
        primaryStage.show();                          // Display the stage
    }
    
}
