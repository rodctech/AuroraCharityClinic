package controller;

import java.net.URL;	
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	
	//private Clinic_DAO clinic;
	
	
	@Override
	public void initialize(URL myDatabase, ResourceBundle tools) {
		//clinic = new Clinic_DAO();
		
	}
	
	@FXML
	private TabPane tab;
	
	@FXML
	private TextField text, item_number, main_category;
	
	@FXML
	private TextField subcategory, description;
	
	@FXML
	private TextField item_unit, min_qty_required;
	
	@FXML
	private TextField qty_on_hand, vend_number;
	
	@FXML
	private Button btn, button, button1;
	
	@FXML
	private Label addlabel;
	
	@FXML
	private Hyperlink link;
	
	
	
	
	

	
	@FXML
	public void action() {
		
		
	}

	

}

	
