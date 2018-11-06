/*
 * Author: Calin Doran
 * Date: 2018
 * Use: CA4
 */

package cA4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrototypeOfFleetManageCoMain extends Application // Main Driver
{
	public static void main(String[] args) {
		launch(args);
	}
	Stage window;
	Scene scene1, scene2;
	TableView<Fleet> boatTable;
	TextField boatName, boatType, numOfStaff;

	private Label lblStatus = new Label("Fleet Managment");

	// Add button clicked
	public void addButtonClicked() {
		Fleet fleet = new Fleet(null, 0, null, null);
//		fleet.setFleetName(nameInput.getText());
//		table.getItems().add(fleet);
//		nameInput.clear();
		//fleetIdNum.clear();
	}

	// Delete button clicked
	public void deleteButtonClicked() {
		ObservableList<Fleet> fleetsSelected, allFleets;
//		fleetsSelected = table.getItems();
//		allFleets = table.getSelectionModel().getSelectedItems();
//		allFleets.forEach(fleetsSelected::remove);
	}

	// Get all fleets
	public ObservableList<Fleet> getFleet() {
		ObservableList<Fleet> fleet = FXCollections.observableArrayList();
		// fleet.add(new Fleet("Fleet", 1, null, null));
		return fleet;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		window = primaryStage;

		List<String> choices = new ArrayList<>();
		ChoiceDialog<String> dialog = new ChoiceDialog<>("Passanger Boat", "Freight Boat");

		//TextInputDialog boatName = new TextInputDialog("boat name");
		//TextInputDialog boatStaffNum = new TextInputDialog("number of staff");

		Menu fileMenu = new Menu("Create Fleet");
		MenuItem btCreate = new MenuItem("Create Record");
		MenuItem btPrint = new MenuItem("Print Record");
		MenuItem btExit = new MenuItem("Exit");

		btCreate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				window = primaryStage;

				TableColumn<Boat, String> boatNameColumn = new TableColumn<>("Boat Name");
				boatNameColumn.setMinWidth(100);
				boatNameColumn.setCellValueFactory(new PropertyValueFactory<>("boat name"));

				TableColumn<Boat, String> boatTypeColum = new TableColumn<>("Boat Type");
				boatTypeColum.setMinWidth(100);
				boatTypeColum.setCellValueFactory(new PropertyValueFactory<>("boat type"));

				TableColumn<Boat, Number> numbStaffColumn = new TableColumn<>("Number of Staff");
				numbStaffColumn.setMinWidth(100);
				numbStaffColumn.setCellValueFactory(new PropertyValueFactory<>("number of staff"));

				// Name input
				boatName = new TextField();
				boatName.setPromptText("Boat Name");
				boatName.setMinWidth(100);

				// Type input
				boatType = new TextField();
				boatType.setPromptText("Boat Type");
				boatType.setMinWidth(100);

				// NumOfStaff input
				numOfStaff = new TextField();
				numOfStaff.setPromptText("Number of Staff");
				numOfStaff.setMinWidth(100);

				// Button
				Button addButton = new Button("Add");
				//addButton.setOnAction(e -> addButtonClicked());
				Button deleteButton = new Button("Delete");
				//deleteButton.setOnAction(e -> deleteButtonClicked());

				HBox hBox = new HBox();
				hBox.setPadding(new Insets(10, 10, 10, 10));
				hBox.setSpacing(10);
				hBox.getChildren().addAll(boatName, boatType, numOfStaff, addButton, deleteButton);

				boatTable = new TableView<>();
				//boatTable.getColumns().addAll(boatNameColumn, boatTypeColum, numbStaffColumn);

				VBox vBox = new VBox();
				vBox.getChildren().addAll(boatTable, hBox);

				Scene scene = new Scene(vBox);
				window.setScene(scene);
				window.show();
			}

		});
		fileMenu.getItems().add(btCreate);
		btPrint.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (dialog.getResult() != null) {
					System.out.println("Boat type: " + dialog.getResult());
				}
				//if (boatName.getResult() != null) {
				//	System.out.println("Boat name: " + boatName.getResult());
				//}
				//if (boatStaffNum.getResult() != null) {
				//	System.out.println("Number of Staff: " + boatStaffNum.getResult());
				//}
			}
		});
		fileMenu.getItems().add(btPrint);
		fileMenu.getItems().add(new SeparatorMenuItem());
		btExit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		fileMenu.getItems().add(btExit);

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu);
		borderPane.setTop(menuBar);

		scene1 = new Scene(borderPane, 700, 700);
		window.setTitle("Fleet Managment");
		window.setScene(scene1);
		window.show();
		window.setResizable(false);
	}

	/*
	 * private Label lblStatus = new Label("Fleet Managment"); private Fleet[]
	 * fleetArray = new Fleet[5];
	 * 
	 * Stage window; TableView<Fleet> table;
	 * 
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * 
	 * PassangerBoat[] passangerBoat = new PassangerBoat[1]; //Object creation
	 * works!
	 * 
	 * PassangerBoat Ureboat = new PassangerBoat("Ureboat", false, 0, 0, false);
	 * passangerBoat[0] = Ureboat;
	 * 
	 * Fleet fleet= new Fleet("Fleet Name", 1, passangerBoat, null);
	 * 
	 * System.out.println(fleet.toString()); //It also prints!
	 * 
	 * launch(args); }
	 * 
	 * 
	 * //@Override public void start(Stage primaryStage) {
	 * 
	 * 
	 * List<String> choices = new ArrayList<>(); ChoiceDialog<String> dialog = new
	 * ChoiceDialog<>("Passanger Boat","Freight Boat");
	 * 
	 * TextInputDialog boatName = new TextInputDialog("boat name"); TextInputDialog
	 * boatStaffNum = new TextInputDialog("number of staff");
	 * 
	 * BorderPane borderPane = new BorderPane(); borderPane.setBottom(lblStatus);
	 * 
	 * Menu fileMenu = new Menu("Create Fleet"); MenuItem btCreate = new
	 * MenuItem("Create Record"); MenuItem btPrint = new MenuItem("Print Record");
	 * MenuItem btExit = new MenuItem("Exit");
	 * 
	 * btCreate.setOnAction(new EventHandler<ActionEvent>() {
	 * 
	 * @Override public void handle(ActionEvent e) { choices.add("Passanger");
	 * choices.add("Freight");
	 * 
	 * dialog.setTitle("Boat Creation Window");
	 * dialog.setHeaderText("Please enter boat details");
	 * dialog.setContentText("Passanger or Freight?:"); dialog.showAndWait();
	 * 
	 * boatName.setTitle("Boat Creation Window");
	 * boatName.setHeaderText("Please enter boat details");
	 * boatName.setContentText("Enter boat name:"); boatName.showAndWait();
	 * 
	 * boatStaffNum.setTitle("Boat Creation Window");
	 * boatStaffNum.setHeaderText("Please enter boat details");
	 * boatStaffNum.setContentText("Enter number of staff:");
	 * boatStaffNum.showAndWait(); } }); fileMenu.getItems().add(btCreate);
	 * btPrint.setOnAction(new EventHandler<ActionEvent>() {
	 * 
	 * @Override public void handle(ActionEvent e) { if (dialog.getResult() !=
	 * null){ System.out.println("Boat type: " + dialog.getResult()); } if
	 * (boatName.getResult() != null){ System.out.println("Boat name: " +
	 * boatName.getResult()); } if (boatStaffNum.getResult() != null){
	 * System.out.println("Number of Staff: " + boatStaffNum.getResult()); } } });
	 * fileMenu.getItems().add(btPrint); fileMenu.getItems().add(new
	 * SeparatorMenuItem()); btExit.setOnAction(new EventHandler<ActionEvent>() {
	 * 
	 * @Override public void handle(ActionEvent e) { JFrame frame = new JFrame();
	 * if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?",
	 * "Exit System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
	 * System.exit(0); } } }); fileMenu.getItems().add(btExit);
	 * 
	 * MenuBar menuBar = new MenuBar(); menuBar.getMenus().addAll(fileMenu);
	 * borderPane.setTop(menuBar);
	 * 
	 * Scene scene = new Scene(borderPane, 700, 700);
	 * primaryStage.setTitle("Fleet Managment"); primaryStage.setScene(scene);
	 * primaryStage.show(); primaryStage.setResizable(false);
	 */

}
