package lab13d;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

class CirclePane extends StackPane {

  private Circle circle = new Circle(50); 
  
  public CirclePane() 
  {
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
  }
  
  public void blue() 
  {
	circle.setFill(Color.BLUE);
  }
  
  public void green() 
  {
    circle.setFill(Color.GREEN); 
  }
  
  public void red() 
  {
    circle.setFill(Color.RED);
  }
}

	public class lab13dQ1 extends Application
	{
	
		class BlueHandler implements EventHandler<ActionEvent> {
			 @Override // Override the handle method
			 public void handle(ActionEvent e) {
			     circlePane.blue();
			     }
			 }
	
		  class GreenHandler implements EventHandler<ActionEvent> {
			 @Override // Override the handle method
			 public void handle(ActionEvent e) {
			     circlePane.green();
			     }
			 }
		  
		class RedHandler implements EventHandler<ActionEvent> {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				circlePane.red();
				}
			}
			    
		public static void main(String[] args) {
			launch(args);
			}
		
		private CirclePane circlePane = new CirclePane();
		
		@Override // Override the start method in the Application class
		  public void start(Stage primaryStage) 
		  {
			  HBox hBox = new HBox();
			  hBox.setSpacing(10);
			  hBox.setAlignment(Pos.CENTER);
			  Button btRed = new Button("Red");
			  Button btGreen = new Button("Green");
			  Button btBlue = new Button("Blue");
			  hBox.getChildren().add(btRed);
			  hBox.getChildren().add(btGreen);
			  hBox.getChildren().add(btBlue);
			  
			// Create and register the handlers
			  btRed.setOnAction(new RedHandler());
			  btGreen.setOnAction(new GreenHandler());
			  btBlue.setOnAction(new BlueHandler());
			  
			  BorderPane borderPane = new BorderPane();
			  borderPane.setCenter(circlePane);
			  borderPane.setBottom(hBox);
			  BorderPane.setAlignment(hBox, Pos.CENTER);
			  
			// Create a scene and place it in the stage
			  Scene scene = new Scene(borderPane, 200, 150);
			  primaryStage.setTitle("ControlCircle"); // Set the stage title
			  primaryStage.setScene(scene); // Place the scene in the stage
			  primaryStage.show(); // Display the stage
			  
		  }
	}
