package controller;

import java.net.URL;			
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.ClinicDAO;

public class Controller implements Initializable{

    private ClinicDAO clinicDAO;

    /**
     * Use this to set up the table for the database.
     * @param location url passed in.
     * @param resources resource bundle passed in.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Calling here to check if table exists.
        clinicDAO = new ClinicDAO();
        clinicDAO.createIfNone();
    }
	
	@FXML
	private TabPane tab;
	
	@FXML
	private ComboBox<String> cboMainCat = new ComboBox<>();
	
	@FXML
	private ComboBox<String> cboSubCat = new ComboBox<>();
	
	@FXML
	private TextField item_number;
	
	@FXML
	private TextField description, item_unit;
	
	@FXML
	private TextField min_qty_required, qty_on_hand, vend_number;
	
	@FXML
	private Button btn, addButton, clearButton;
	
	@FXML
	private Label addlabel,desclabel, numlabel;
	
	@FXML
	private Label vendlabel,minlabel, unitlabel;
	
	@FXML
	private Label countlabel;
	
	@FXML
	private Hyperlink link;
	
	@FXML
	private TextArea textArea;
	
	
	@FXML
	public void initialize(){
		
		String[] main_category = {" ", "Gloves", "PPE", "Wounds"};
		
		cboMainCat.getItems().addAll(main_category);
		
		String[] subcategory  = {" ", "Sterile", "Non-Sterile", "Bandage"};
		
		cboSubCat.getItems().addAll(subcategory);
		
		clearButton.setOnAction(e -> ClearData(e));
		
	}
	
	@FXML
    public void addAction() {
    	clinicDAO.addNewItem(item_number.getText(),
    	cboMainCat.getValue(),
    	cboSubCat.getValue(),
    	description.getText(),
    	item_unit.getText(),
    	min_qty_required.getText(),
    	qty_on_hand.getText(),
    	vend_number.getText());}
	
	public void ClearData(ActionEvent e) {
		item_number.clear();
		cboMainCat.setValue(null);
		cboSubCat.setValue(null);
		description.clear();
		item_unit.clear();
		min_qty_required.clear();
		qty_on_hand.clear();
		vend_number.clear();
	}

	

}

	
