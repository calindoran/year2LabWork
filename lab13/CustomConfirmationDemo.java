package lab13;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class CustomConfirmationDemo extends Application {
  
	/**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }

  @Override // Override the start method in the Application class
public void start(Stage primaryStage) 
{
	Alert alert = new Alert(AlertType.CONFIRMATION);
	alert.setTitle("Confirmation Dialog with Custom Actions");
	alert.setHeaderText("Look, a Confirmation Dialog with Custom Actions");
	alert.setContentText("Choose your option.");

	ButtonType buttonTypeOne = new ButtonType("One");
	ButtonType buttonTypeTwo = new ButtonType("Two");
	ButtonType buttonTypeThree = new ButtonType("Three");
	ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);

	alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree, buttonTypeCancel);

	alert.showAndWait();
	int choice = 0;
	if (alert.getResult() == buttonTypeOne){
	    // ... user chose "One"
		choice = 1;
	} else if (alert.getResult() == buttonTypeTwo) {
	    // ... user chose "Two"
		choice = 2;
	} else if (alert.getResult() == buttonTypeThree) {
	    // ... user chose "Three"
		choice = 3;
	} else {
	    // ... user chose CANCEL or closed the dialog
	}
	Alert choiceAlert = new Alert(AlertType.INFORMATION);
	choiceAlert.setTitle("Confirmation Dialog");
	choiceAlert.setHeaderText(null);
	choiceAlert.setContentText("You chose button " + choice);
	choiceAlert.showAndWait();

}
}
