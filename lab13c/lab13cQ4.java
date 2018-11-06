package lab13c;

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

public class lab13cQ4 extends Application
{

	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override // Override the start method in the Application class
		public void start(Stage primaryStage)
		{
		    GridPane pane = new GridPane();
		    pane.setAlignment(Pos.CENTER);		 // Pos is an imported class
		    pane.setHgap(10);
		    pane.setVgap(10);
		    pane.setPadding(new Insets(25, 25, 25, 25));
		    
		    pane.add(new Label("First Name:"), 0, 1);
		    pane.add(new TextField(), 1, 1);
		    pane.add(new Label("MI:"), 0, 2);
		    
		    TextField tfMi = new TextField();
		    tfMi.setPrefColumnCount(1);
		    pane.add(tfMi, 1, 2);
		    pane.add(new Label("Last Name:"), 0, 3);
		    pane.add(new TextField(), 1, 3);
		    Button btAddName = new Button("ADD Name");
		    GridPane.setHalignment(btAddName, HPos.RIGHT); // HPos is an imported class
		    pane.add(btAddName, 1, 4);
	
		    /*Image image = new Image("file:images/y-tho.jpg");
		    pane.getChildren().add(new ImageView(image));
	
		    ImageView imageView2 = new ImageView(image);
		    pane.getChildren().add(imageView2);
	
		    ImageView imageView3 = new ImageView(image);
		    pane.getChildren().add(imageView3);
		    
		    ImageView imageView4 = new ImageView(image);
		    pane.getChildren().add(imageView4);*/
	
		    Scene scene = new Scene(pane);
		    primaryStage.setTitle("ShowImage"); // Set the stage title
		    primaryStage.setScene(scene);       // Place scene in stage
		    primaryStage.show();                // Display the stage
		}

}
