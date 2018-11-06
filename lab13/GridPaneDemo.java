package lab13;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class GridPaneDemo extends Application 
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
       // Create a pane and set its properties
       GridPane pane = new GridPane();
       pane.setAlignment(Pos.CENTER);
       pane.setHgap(10);
       pane.setVgap(10);
       pane.setPadding(new Insets(25, 25, 25, 25));

       // Place nodes in the pane
       pane.add(new Label("First Name:"), 0, 1);
       pane.add(new TextField(), 1, 1);
       pane.add(new Label("MI:"), 0, 2);
       TextField tfMi = new TextField();
       tfMi.setPrefColumnCount(1);
       pane.add(tfMi, 1, 2);
       pane.add(new Label("Last Name:"), 0, 3);
       pane.add(new TextField(), 1, 3);
       Button btAddName = new Button("ADD Name");
       GridPane.setHalignment(btAddName, HPos.RIGHT);
       pane.add(btAddName, 1, 4);

       // Create a scene and place it in the stage
       Scene scene = new Scene(pane, 300, 200);
       primaryStage.setTitle("ShowGridPane"); // Set the stage title
       primaryStage.setScene(scene);          // Put scene in stage
       primaryStage.show();                   // Display the stage
    }
    
}
