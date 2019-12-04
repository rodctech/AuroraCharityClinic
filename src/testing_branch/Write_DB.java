package testing_branch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Write_DB {
	
	//Statement queryStatement = null;
	
	/*
	  public void addNewItem(String item_number, String main_category, String subcategory, String description, String size,
				String item_unit, String min_qty_required, String qty_on_hand, String vend_number) {
			        
			        try (Connection connection = this.getConnection()) {
			  
			        	PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO clinic_inventory(item_number, main_category, subcategory, "
			        			+ "description, size, item_unit, min_qty_required, qty_on_hand, vend_number)" + " VALUES ('" + item_number +"', '"+ main_category +"','"+ 
						subcategory +"', '"+ description +"', '"+ size +"', '"+ item_unit +"', '"+ min_qty_required+"', '"+ qty_on_hand+"', " + "'"+ vend_number+"' )");
			        	preparedStatement.execute();
			            System.out.print("\nConnected to database!\nNew item was added successfully\n");
			           // lblDisplay.setText();
			        } catch (SQLException e) {
			            System.out.print(e.getMessage());
			        }
			    }

*/
	
//	
//	connect = ConnectionEstablishment.gettingConnected();
//	Statement state = connect.createStatement();
//	ResultSet rs = state.executeQuery(sqlQuery);
	
	
	/*
	 try (Connection connection = this.getConnection()) {
		  
     	PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO csc3610_students(studentID, fname, lname)" +
     						" VALUES ('" + studentID +"', '"+ fname +"','"+ lname +"' )");
     	preparedStatement.execute();
         System.out.print("\nConnected to database!\nNew student was added successfully\n");
        // lblDisplay.setText();
     } catch (SQLException e) {
         System.out.print(e.getMessage());
     }	
	
	*/
	

	  public void addNewRecords(String item_number, String main_category, String subcategory, String description, String size,
			  String item_unit, String min_qty_required, String qty_on_hand, String vend_number) {
		  
		 Connection connecting;
		 PreparedStatement prep;
		 
		 try {
			 connecting = ConnectionEstablishment.gettingConnected();
			 prep = connecting.prepareStatement("INSERT INTO clinic_inventory(item_number, main_category, subcategory, description, size, item_unit, min_qty_required, qty_on_hand, vend_number)" +
					 " VALUES ('" + item_number +"', '"+ main_category +"','"+ subcategory +"','"+ description +"', '"+ size +"', '"+ item_unit + "', '"+ min_qty_required +"','"+ qty_on_hand + "','"+ vend_number +"')");
			
			 prep.execute();
			 
		 }
		 catch (SQLException sqlE) {
			 System.out.print(sqlE.getMessage());
			 System.out.printf("\n Cannot write to the database");
			 
		 }
	  }

}


