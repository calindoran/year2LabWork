package lab13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonImageDemo extends Application
{

	public static void main(String[] args) 
    {
        Application.launch(args);
    }
	
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
		
		Pane pane = new HBox(10);
	    pane.setPadding(new Insets(5, 5, 5, 5));

	    Image image = new Image("file:images/y-tho.jpg",100,100,false,false); // Load image from file
	    
	    // create a new button, and add it to the pane�s list of children
	    Button button = new Button("");
	    button.setStyle("-fx-border-color: blue;");
	    button.setGraphic(new ImageView(image));
        pane.getChildren().add(button);
        
        Scene scene = new Scene(pane, 500, 500);		// Make a new scene, containing the pane
	    primaryStage.setTitle("Button with an image");	// Set the stage title
	    primaryStage.setScene(scene);       			// Place scene in stage
	    primaryStage.show();							// Display the stage
    }
}
