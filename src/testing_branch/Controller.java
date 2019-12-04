package testing_branch;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controller implements Initializable {
	
	//private Clinic_DAO clinic;
	
	
	private ObservableList<String> observableList = FXCollections.observableArrayList("Item_Unit","Main_Category", "Vend_Number");
	
	@FXML private TabPane tab;
	@FXML private TextField item_number, main_category, size;
	@FXML private TextField subcategory, description;
	@FXML private TextField item_number_tf, min_qty_required;
	@FXML private TextField qty_on_hand, vend_number;
	
	@FXML private TextField read_item_number, read_category, read_item_name;
	@FXML private Button btn, button, button1;
	@FXML private Label addlabel;
	@FXML private Hyperlink link;
	@FXML private ComboBox combo;
	@FXML private Label comboBoxLabel;

	
	@FXML private Label lab = new Label("Results:");
	@FXML private Label newRecords = new Label("");


	@Override
	public void initialize(URL myDatabase, ResourceBundle tools) {
		
		combo.setItems(observableList);
		
	}
	

	@FXML
	public void comboInserted() throws SQLException {
		
		switch(combo.getValue().toString() ) {
		
		case "Item_Unit" : { System.out.println("Item_Unit ComboBox selected");
		findItemUnit(read_item_number,lab);  break; }
		
		case "Main_Category" : { System.out.println("Main_Category was selected"); 
		findMainCategory(read_category, lab); break; }
		
		
		case "Vend_Number" : { System.out.println("Qty_On_Hand was selected"); break; }
		
		default : {System.out.println("No such value in this database"); break; }
		
		}
		
		
		/*
		if((combo.getValue().toString().equals("Item_Unit")) && read_item_number != null) {
			
			//ConnectionQueries.connectItemUnit(combo, read_item_number);
			ConnectionQueries.Query();
		
		}
		*/
	}
	
	public static void findItemUnit(TextField read_item_number, Label lab) {
		
		if (!(read_item_number.getText().isEmpty())) {
			ConnectionQueries.Query(read_item_number,lab);
			
		}
		
		
	}
	
	public static void findMainCategory(TextField read_category, Label lab) {
		
		if (!(read_category.getText().isEmpty())) {
			ConnectionQueries.getMinQty(read_category,lab);
		}
	}
	
	//@FXML
	public void clear() {
		// Clear all values from the TextField
		//button1.setOnMouseClicked(e -> {
			item_number.clear();
			main_category.clear();
			subcategory.clear();
			description.clear();
			item_number_tf.clear();
			min_qty_required.clear();
			qty_on_hand.clear();
			vend_number.clear();
			
		//});
	}
	
	@FXML
	public void addItems() {
		
		//item_number,main_category,subcategory,
		//description,text,min_qty_required,
		//qty_on_hand,vend_number
		
		Write_DB writing = new Write_DB();
		
		button.setOnMouseClicked(e -> {
			/*
			public void addNewRecords(TextField item_number, TextField main_category, TextField subcategory, TextField description, TextField size,
					  TextField item_unit, TextField min_qty_required, TextField qty_on_hand, TextField vend_number) {
			*/
			
			
			writing.addNewRecords(item_number.getText(), main_category.getText(), subcategory.getText(),
					description.getText(), size.getText(), item_number_tf.getText(), min_qty_required.getText(),
					qty_on_hand.getText(), vend_number.getText());
				
			clear();
			
		});
		newRecords.setTextFill(Color.rgb(0, 0, 128));
		newRecords.setText("Successfully Added new record to the Database");
		
	}

	
	@FXML
	public void action() {
		
		Stage stage = new Stage();
		DynamicTable dynamic = new DynamicTable();
		
		link.setOnMouseClicked(e -> {
			try {
				dynamic.start(stage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	
	}

}