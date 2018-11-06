package lab13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BorderPaneDemo extends Application 
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("BorderPane Test");
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10, 20, 10, 20));

        Button btnTop = new Button("Top");
        BorderPane.setAlignment(btnTop, Pos.TOP_CENTER);
        bp.setTop(btnTop);

        Button btnLeft = new Button("Left");
        BorderPane.setAlignment(btnLeft, Pos.CENTER_LEFT);
        bp.setLeft(btnLeft);

        Button btnCentre = new Button("Centre");
        BorderPane.setAlignment(btnCentre, Pos.CENTER);
        bp.setCenter(btnCentre);

        Button btnRight = new Button("Right");
        BorderPane.setAlignment(btnRight, Pos.CENTER_RIGHT);
        bp.setRight(btnRight);

        Button btnBottom = new Button("Bottom");
        BorderPane.setAlignment(btnBottom, Pos.BOTTOM_CENTER);
        bp.setBottom(btnBottom);

        Scene scene = new Scene(bp, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
