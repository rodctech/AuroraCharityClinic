package controller;

import javafx.fxml.FXML;	
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.ClinicDAO;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller class for main operations
**
 */

//TODO Remove my user name password database name from properties.

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
    private TextField item_number;
    
    @FXML
    private TextField main_category;
    
    @FXML 
    private TextField subcategory;

    @FXML 
    private TextField description;

    @FXML 
    private TextField size;

    @FXML 
    private TextField item_unit;

    @FXML 
    private TextField min_qty_required;

    @FXML 
    private TextField qty_on_hand;

    @FXML 
    private TextField vend_number;

    @FXML
    private Label lblDisplay, addlabel, searchlabel;
    
    @FXML
    private Button button;
    
    @FXML
    public void addAction() {
    	clinicDAO.addNewItem(item_number.getText(),
    	main_category.getText(),
    	subcategory.getText(),
    	description.getText(),
    	size.getText(),
    	item_unit.getText(),
    	min_qty_required.getText(),
    	qty_on_hand.getText(),
    	vend_number.getText());}


}
