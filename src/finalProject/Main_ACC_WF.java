package finalProject;

		import java.io.IOException;

		import javafx.application.Application;
		import javafx.fxml.FXMLLoader;
		import javafx.scene.Scene;
		import javafx.scene.layout.AnchorPane;
		import javafx.stage.Stage;

public class Main_ACC_WF extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("ACC Database");
		AnchorPane anchor = (AnchorPane) FXMLLoader.load(getClass().getResource("Combine_GUI.fxml"));
		Scene myScene = new Scene(anchor, 1200, 800);  //450
		primaryStage.setScene(myScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}