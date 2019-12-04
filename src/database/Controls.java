package database;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class Controls implements Initializable {
	
	private Clinci_DAO clinic;
	
	
	@Override
	public void initialize(URL myDatabase, ResourceBundle tools) {
		clinic = new Clinci_DAO();
		
	}
	
	@FXML
	private TabPane tab;
	
	@FXML
	private TextField text;
	
	@FXML
	private Button btn;
	
	@FXML
	private Hyperlink link;
	
	
	
	
	

	
	@FXML
	public void action() {
		
		
	}

	

}

	
