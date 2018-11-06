package lab13f;

import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class lab13fQ1 extends Application {
	
	public static void main(String[] args) {
	    launch(args);
	  }
	TextField cel;
	TextField fah;
	
	boolean control = false;
	
	public float getCelsius(float f)
	{
		float celsius = (f-32)*5/9;
		cel.setText(String.valueOf(celsius));
		return celsius;
	}
	
	public float getFahrenheit(float c)
	{
		float fahrenheit = (c*9/5)+32;
		fah.setText(String.valueOf(fahrenheit));
		return fahrenheit;
	}
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) 
	{
		GridPane gPane = new GridPane();
		cel = new TextField();
		fah = new TextField();
		//Label celLabel = new Label("Cel");
		
		gPane.setAlignment(Pos.CENTER);
		gPane.setVgap(10);
		gPane.setHgap(10);
		gPane.add(new Label("Cel: "), 0, 1);
		gPane.add(cel, 1, 1);
		gPane.add(new Label("Fah: "), 2, 1);
		gPane.add(fah, 3, 1);
		
		cel.textProperty().addListener(ov -> {
			if (!control && cel.getText().length() > 0)
		{
				control = true;
				float c = Float.parseFloat(cel.getText());		//convets cel.getText() to a float value
				cel.setText(String.valueOf(getFahrenheit(c)));
				control = false;
				}
		});
		
		fah.textProperty().addListener(ov -> {
			if (!control && fah.getText().length() > 0)
		{
				control = true;
				float f = Float.parseFloat(fah.getText());		//convets fah.getText() to a float value
				fah.setText(String.valueOf(getCelsius(f)));
				control = false;
				}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(gPane, 600, 80);
		primaryStage.setTitle("Listeners Demos"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
}
