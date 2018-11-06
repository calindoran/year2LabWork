// Author 			: Calin Doran
// Date 			: 2018
// Purpose 			: Some javafx

package lab13a;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
public class lab13aQ2 extends Application
{
	public static void main(String[] args) 
	{
		launch(args);
	}
		  
	@Override
	public void start(Stage primaryStage) {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("My Message Box");
		alert.setHeaderText(null);
		
		String text = "Num "+"\t"+"Square "+"\t"+"Cube"+"\n";
		for(int i=1; i<=10; i++)
		{
			text += i+"\t\t"+(i*i)+"\t\t"+(i*i*i)+"\n";
		}
		alert.setContentText(text);
		alert.showAndWait();
	}

}
