package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bank_IO extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("De uduelige's bank er mega gay");

		primaryStage.show();

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Scene scene = new Scene(grid, 400, 375);
		StackPane root = new StackPane();
		root.setId("pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setScene(scene);
		Text scenetitle = new Text("De uduelige's bank");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 10, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1, 10, 1);

		TextField TextField = new TextField();
		// setEditable(false)
		grid.add(TextField, 1, 2, 10, 1);
		TextField.setEditable(false);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
