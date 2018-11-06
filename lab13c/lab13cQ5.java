package lab13c;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class lab13cQ5 extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GridPane gridPane = new GridPane();
        
        for(int i =0; i < 8; i++)
        {
            for(int j = 0; j < 8;j++)
            {
                Rectangle square = new Rectangle(50, 50);
                Color color;
                if((i + j) % 2 == 0) color = Color.WHITE;
                else color = Color.BLACK;
                square.setFill(color);
                gridPane.add(square, j, i);
                square.widthProperty().bind(gridPane.widthProperty().divide(8));
                square.heightProperty().bind(gridPane.heightProperty().divide(8));    
            }
        }
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab13cQ5");
        primaryStage.show();
    }


}
