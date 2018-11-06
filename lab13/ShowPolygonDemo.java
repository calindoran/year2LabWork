package lab13;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class ShowPolygonDemo extends Application {
  // The main method is only needed for the IDE with limited
  // JavaFX support. Not needed for running from the command line.
  public static void main(String[] args) {
    launch(args);
  }
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    // Create a pane, a polygon, and place polygon to pane
    Pane pane = new Pane();
    Polygon polygon = new Polygon();
    pane.getChildren().add(polygon); 
    polygon.setFill(Color.WHITE);
    polygon.setStroke(Color.BLACK);
    ObservableList<Double> list = polygon.getPoints();
    
    final double WIDTH = 250, HEIGHT = 250;
    double centerX = WIDTH / 2, centerY = HEIGHT / 2;
    double radius = Math.min(WIDTH, HEIGHT) * 0.4;

    // Add points to the polygon list
    for (int i = 0; i < 6; i++) {
      list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6)); 
      list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
    }     
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, WIDTH, HEIGHT);
    primaryStage.setTitle("ShowPolygon"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
}
