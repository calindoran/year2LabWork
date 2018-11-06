/*
 * Author: Calin Doran
 * Date: 2018
 * Use: CA4
 */

package cA4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FleetManageCoMain extends Application // Main Driver
{
	public static void main(String[] args) {
		Application.launch(args);
	}
	Stage window;
	Scene scene, scene1, scene2;
	BorderPane layout;
	Menu createMenu;
	Menu recordMenu;
	MenuBar menuBar;
	Button button;
	ComboBox<Fleet> comboBox;
	TableView<Boat> boatTable;

	TextField boatName, boatType, numOfStaff;

	// Add button clicked
	public void addButtonClicked() {
		Boat boat = new Boat("", "", 0);
		boat.setBoatName(boatName.getText());
		boat.setBoatType(boatType.getText());
		boat.setNumOfStaff(Integer.parseInt(numOfStaff.getText()));
		boatTable.getItems().add(boat);
		boatName.clear();
		boatType.clear();
		numOfStaff.clear();
	}

	// Delete button clicked
	public void deleteButtonClicked() {
		ObservableList<Boat> boatSelected, allBoats;
		allBoats = boatTable.getItems();
		boatSelected = boatTable.getSelectionModel().getSelectedItems();
		boatSelected.forEach(allBoats::remove);
	}

	// Get all of the boats
	public ObservableList<Boat> getBoat() {
		ObservableList<Boat> boat = FXCollections.observableArrayList();
		boat.add(new Boat("", "", 0));
		return boat;
	}

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Fleet Managment Co");

		createMenu = new Menu("Create");
		recordMenu = new Menu("Records");

		// Fleet menu
		MenuItem newFleet = new MenuItem("New Fleet...");
		newFleet.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				comboBox = new ComboBox<Fleet>();
				comboBox.getItems().addAll();

				comboBox.setPromptText("Fleet");
				button.setOnAction(e -> printFleet());

				// Note: ComboBoxes can generate actions if needed // get value instantly
				comboBox.setOnAction(e -> System.out.println("User selected " + comboBox.getValue()));
				button = new Button("Submit");

				// comboBox.getItems().addAll("A","B","C","D","E");
				// comboBox.setValue("A");
				// System.out.println(comboBox.getValue());

				GridPane layoutComb = new GridPane();
				// VBox layoutComb = new VBox(10);
				layoutComb.setVgap(4);
				layoutComb.setHgap(10);
				layoutComb.add(new Label("Fleet Name "), 0, 0);
				layoutComb.add(comboBox, 1, 0);
				layoutComb.setPadding(new Insets(20, 20, 20, 20));
				// layoutComb.getChildren().addAll(comboBox, button);

				layout = new BorderPane();
				layout.setTop(menuBar);
				layout.setLeft(layoutComb);
				scene = new Scene(layout, 800, 800);
				window.setScene(scene);
				window.show();
			}

			private void printFleet() {
				System.out.println(comboBox);
			}

		});
		createMenu.getItems().add(newFleet);

		// Boat menu
		MenuItem newBoat = new MenuItem("New Boat...");
		newBoat.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				TableColumn<Boat, String> boatNameColumn = new TableColumn<>("Boat Name");
				boatNameColumn.setMinWidth(100);
				boatNameColumn.setCellValueFactory(new PropertyValueFactory<>("boat name"));

				TableColumn<Boat, String> boatTypeColum = new TableColumn<>("Boat Type");
				boatTypeColum.setMinWidth(100);
				boatTypeColum.setCellValueFactory(new PropertyValueFactory<>("boat type"));

				TableColumn<Boat, Number> quantityColumn = new TableColumn<>("Number of Staff");
				quantityColumn.setMinWidth(100);
				quantityColumn.setCellValueFactory(new PropertyValueFactory<>("number of staff"));

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
				addButton.setOnAction(e -> addButtonClicked());
				Button deleteButton = new Button("Delete");
				deleteButton.setOnAction(e -> deleteButtonClicked());

				HBox hBox = new HBox();
				hBox.setPadding(new Insets(10, 10, 10, 10));
				hBox.setSpacing(10);
				hBox.getChildren().addAll(boatName, boatType, numOfStaff, addButton, deleteButton);

				boatTable = new TableView<>();
				boatTable.getColumns().addAll(boatNameColumn, boatTypeColum, quantityColumn);

				VBox vBox = new VBox();
				vBox.getChildren().addAll(boatTable, hBox);

				layout = new BorderPane();
				layout.setTop(menuBar);
				layout.setBottom(vBox);
				scene = new Scene(layout, 800, 800);
				window.setScene(scene);
				window.show();
			}
		});

		createMenu.getItems().add(newBoat);

		// Separator
		createMenu.getItems().add(new SeparatorMenuItem());

		// Exit menu
		MenuItem exitBtn = new MenuItem("Exit...");
		exitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Platform.exit();

			}
		});
		createMenu.getItems().add(exitBtn);

		// Main menu bar
		menuBar = new MenuBar();
		menuBar.getMenus().addAll(createMenu, recordMenu); // Can add more menu options here

		// Layout of Window
		layout = new BorderPane();
		layout.setTop(menuBar);
		scene = new Scene(layout, 800, 800);
		window.setScene(scene);
		window.show();
	}

}