package lab14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class lab14Q2 extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
	public void start(Stage stage) {
    	
        FlowPane flowPane = new FlowPane();
        Canvas canvas = new Canvas(300, 300);
        flowPane.getChildren().addAll(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillOval(20, 20, 300, 300);

        canvas.setOnMouseClicked((event) -> {
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillOval(event.getX(), event.getY(), 10, 10);
        });
        
        /*canvas.setOnMouseDragged((event) -> {	
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillOval(event.getX(), event.getY(), 10, 10);
        });*/

        stage.setScene(new Scene(flowPane));
        stage.show();
    }
}