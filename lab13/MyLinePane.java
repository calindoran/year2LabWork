package lab13;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

//We create a new type of pane which simple inherits from the Pane class
public class MyLinePane extends Pane 
{
	public MyLinePane()
	{
		Line line1 = new Line(10, 10, 10, 10);
		line1.endXProperty().bind(widthProperty().subtract(10));
		line1.endYProperty().bind(heightProperty().subtract(10));
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		getChildren().add(line1);
    
		Line line2 = new Line(10, 10, 10, 10);
		line2.startXProperty().bind(widthProperty().subtract(10));
		line2.endYProperty().bind(heightProperty().subtract(10));
		line2.setStrokeWidth(5);
		line2.setStroke(Color.RED);
		getChildren().add(line2);
	}
}
