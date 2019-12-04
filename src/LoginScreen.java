
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreen extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//Set title of the Login Page
		primaryStage.setTitle("Aurora Charity Login Page");
		
		
		//Adding Nodes
		Label text1 = new Label("User ID:");
		Label text2 = new Label("Password");
		TextField textField1 = new TextField();
		PasswordField textField2 = new PasswordField();
		Button button1 = new Button("Submit");
		//Button button2 = new Button("Clear");
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(400, 200);
		gridPane.setPadding(new Insets(15));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.add(text1, 0, 0);
		gridPane.add(textField1, 1, 0);
		gridPane.add(text2, 0, 1);
		gridPane.add(textField2, 1, 1);
		gridPane.add(button1, 0, 2);
		//gridPane.add(button2, 1, 2);
		gridPane.setGridLinesVisible(true);
		
		
		/*
		Image barkz = new Image("Images/BARKS.JPG");
		ImageView barkzImage = new ImageView(barkz);
		barkzImage.setFitHeight(45);
		barkzImage.setFitWidth(65);
		
		gridPane.add(barkzImage, 3, 5);
		
		*/

		BorderPane border = new BorderPane(gridPane);
		border.setCenter(gridPane);
		border.setStyle("-fx-background-color: silver;");
		
		Scene scene = new Scene(border);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
