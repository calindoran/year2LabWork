package lab13;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class ConfirmationDemo extends Application {
  
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
	alert.setTitle("Confirmation Dialog");
	alert.setHeaderText("Look, a Confirmation Dialog");
	alert.setContentText("Are you ok with this?");
	
	alert.showAndWait();
	if (alert.getResult()== ButtonType.OK){
		// ... user chose OK
		Alert alertYouSure = new Alert(AlertType.CONFIRMATION);
		alertYouSure.setTitle("Information Dialog");
		alertYouSure.setContentText("That's OK then!");
		alertYouSure.showAndWait();
		
		if(alertYouSure.getResult()== ButtonType.OK)
		{
			Alert alertInfo = new Alert(AlertType.INFORMATION);
			alertInfo.setTitle("Information Dialog");
			alertInfo.setContentText("That's OK then!");
			alertInfo.show();
		}
		else if(alertYouSure.getResult()== ButtonType.CANCEL)
		{
			Alert alertCancel = new Alert(AlertType.INFORMATION);
			alertCancel.setTitle("Information Dialog");
			alertCancel.setContentText("That's OK then!");
			alertCancel.show();
		}
	} 
	else 
	{
		Alert alertCancel = new Alert(AlertType.INFORMATION); // ... user chose CANCEL or closed the dialog
		alertCancel.setTitle("Information Dialog");
		alertCancel.setContentText("That's OK then!");
		alertCancel.show();
	}	
}
}
