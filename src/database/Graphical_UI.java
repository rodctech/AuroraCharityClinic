package database;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Graphical_UI extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		primaryStage.setTitle("Barks DB");
		AnchorPane anchor = (AnchorPane) FXMLLoader.load(getClass().getResource("Load_SB.fxml"));
		Scene myScene = new Scene(anchor, 200, 200);  //180
		primaryStage.setScene(myScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}