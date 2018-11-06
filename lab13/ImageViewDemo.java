package lab13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageViewDemo extends Application 
{
    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
    // This is just the BODY of start()
    // Create a pane to hold the image views
    Pane pane = new HBox(10);               // HBox is covered in next section
    pane.setPadding(new Insets(5, 5, 5, 5));

    Image image = new Image("file:images/y-tho.jpg");        // Load image from file

    pane.getChildren().add(new ImageView(image)); // 1st IV gets image as-is

    ImageView imageView2 = new ImageView(image);  // 2nd IV forces image to
    imageView2.setFitHeight(100);                 // fit into 100-x-100
    imageView2.setFitWidth(100);                  // pixel area
    pane.getChildren().add(imageView2);

    ImageView imageView3 = new ImageView(image);  // 3rd IV leaves size as-is,
    imageView3.setRotate(90);                     // but rotates (CW) 90 deg,
    pane.getChildren().add(imageView3);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowImage"); // Set the stage title
    primaryStage.setScene(scene);       // Place scene in stage
    primaryStage.show();                // Display the stage
    }
}
