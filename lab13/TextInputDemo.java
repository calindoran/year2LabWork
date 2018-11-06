package lab13;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class TextInputDemo extends Application {
  
	// The main method is only needed for the IDE with limited
	   // JavaFX support. Not needed for running from the command line.
	  public static void main(String[] args) {
	    launch(args);
	  }

   @Override // Override the start method in the Application class
public void start(Stage primaryStage) 
{
	TextInputDialog dialog = new TextInputDialog("yourname");
	dialog.setTitle("Text Input Dialog");
	dialog.setHeaderText("Look, a Text Input Dialog");
	dialog.setContentText("Please enter your name:");

	dialog.showAndWait();
	if (dialog.getResult() != null){
	    System.out.println("Your name: " + dialog.getResult());
	}
}
}
