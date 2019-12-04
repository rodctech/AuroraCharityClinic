package finalProject;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TestControllerV3 implements Initializable {
	@FXML
	private TextField textIDNumber;
	
	@FXML
	private PasswordField textPassword;
	
	@FXML
	private Label labelDisplayMessage;
	
	//@FXML private Button button = new Button();
	
	Stage dialogStage = new Stage();
	Scene scene;
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	Stage newStage = new Stage();
	
	public TestControllerV3() {
		connection = ConnectionUtilV3.conDB();
	}
	

	
	public void loginAction(ActionEvent event) {
		String ID_NUMBER = textIDNumber.getText().toString();
		String EMP_PASSWORD = textPassword.getText().toString();
		
		String sql = "SELECT * FROM EMPLOYEE WHERE ID_NUMBER = ? and EMP_PASSWORD = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, ID_NUMBER);
			preparedStatement.setString(2, EMP_PASSWORD);
			resultSet = preparedStatement.executeQuery();
			
			
			if(!resultSet.next()) {
				labelDisplayMessage.setTextFill(Color.TOMATO);
				labelDisplayMessage.setText("Login Failed");
				
			} else {
				//labelDisplayMessage.setTextFill(Color.GREEN);
				//labelDisplayMessage.setTextFill(Color.rgb(0, 100, 0));
				labelDisplayMessage.setTextFill(Color.rgb(0, 0, 128));
				labelDisplayMessage.setText("Login Successful");
				System.out.println("Login Successful");
				//newStage.setScene(value);
				
			}
			if(textIDNumber.getText().isEmpty() || textPassword.getText().isEmpty() ) {
				labelDisplayMessage.setTextFill(Color.TOMATO);
				labelDisplayMessage.setText("Please fill out all valid fields");
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
}
