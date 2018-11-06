package lab13;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class ChoiceInputDemo extends Application {
  
	// The main method is only needed for the IDE with limited
	   // JavaFX support. Not needed for running from the command line.
	  public static void main(String[] args) {
	    launch(args);
	  }
   @Override // Override the start method in the Application class
public void start(Stage primaryStage) 
{
	List<String> choices = new ArrayList<>();
	choices.add("a");
	choices.add("b");
	choices.add("c");
	choices.add("d");

	ChoiceDialog<String> dialog = new ChoiceDialog<>("b", choices);
	dialog.setTitle("Choice Dialog");
	dialog.setHeaderText("Look, a Choice Dialog");
	dialog.setContentText("Choose your letter:");

	dialog.showAndWait();
	if (dialog.getResult() != null){
	    System.out.println("Your choice: " + dialog.getResult());
	}
}
}
