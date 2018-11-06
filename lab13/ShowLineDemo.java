package lab13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowLineDemo extends Application {
  public static void main(String[] args) 
  {
      Application.launch(args);
  }
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new MyLinePane(), 200, 200);
    primaryStage.setTitle("ShowLine"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

}
