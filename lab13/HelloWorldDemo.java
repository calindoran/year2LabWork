package lab13;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class HelloWorldDemo extends Application {
  
	/**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
  Alert alert = new Alert(AlertType.INFORMATION);
  alert.setTitle("Information Dialog");
  alert.setHeaderText(null);
  alert.setContentText("Hello World!");

  alert.showAndWait();  

  Alert alertWarning = new Alert(AlertType.WARNING);
  alertWarning.setTitle("Warning Dialog");
  alertWarning.setHeaderText("Look a Warning Dialog");
  alertWarning.setContentText("Watch out now!");

  alertWarning.showAndWait();  }
}
