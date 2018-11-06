package lab13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ShowHBoxVBoxDemo extends Application 
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("ShowHBoxVBox");
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10, 20, 10, 20));

        Pane hBox = new HBox(10);     
        hBox.setPadding(new Insets(5, 5, 5, 5));
        hBox.setStyle("-fx-background-color: gold");

        hBox.getChildren().add(new Button("Press me"));
        hBox.getChildren().add(new Button("No press me"));
        Image image = new Image("file:images/ireland.png",100, 100,false,false);        // Load image from file
        hBox.getChildren().add(new ImageView(image)); 

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("First Name"));
        vBox.getChildren().add(new Label("Last Name"));
        vBox.getChildren().add(new Label("Address"));
        	
        // Place nodes in the pane
        bp.setTop(hBox);
        bp.setLeft(vBox);

        Scene scene = new Scene(bp, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
