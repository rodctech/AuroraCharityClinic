package ACC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Barks DB");
        AnchorPane anchor = (AnchorPane) FXMLLoader.load(getClass().getResource("GUI.fxml"));
        Scene myScene = new Scene(anchor, 300, 300);  //180
        primaryStage.setScene(myScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}