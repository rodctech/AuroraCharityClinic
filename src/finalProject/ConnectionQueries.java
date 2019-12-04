package finalProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConnectionQueries {
	
	public static Label Query(TextField read_item_number, Label lab) {
		HashMap<Integer, Clinic_Inventory> map = new HashMap<Integer, Clinic_Inventory>();
		String sqlQuery = "SELECT * FROM clinic_inventory";
		Connection connect;
		Clinic_Inventory clinic;
		lab.setVisible(true);
		try {
			connect = ConnectionEstablishment.gettingConnected();
			Statement state = connect.createStatement();
			ResultSet rs = state.executeQuery(sqlQuery);
			
			
			while (rs.next() ) {
	
				Integer ITEM_NUMBER = rs.getInt("ITEM_NUMBER");
				String  MAIN_CATEGORY = rs.getString("MAIN_CATEGORY");
				String SUBCATEGORY = rs.getString("SUBCATEGORY");
				String DESCRIPTION = rs.getString("DESCRIPTION");
				String SIZE = rs.getString("SIZE");
				String  ITEM_UNIT = rs.getString("ITEM_UNIT");
				Integer MIN_QTY_REQUIRED = rs.getInt("MIN_QTY_REQUIRED");
				Integer QTY_ON_HAND = rs.getInt("QTY_ON_HAND");
				Integer VEND_NUMBER = rs.getInt("VEND_NUMBER");
				
				clinic = new Clinic_Inventory(ITEM_NUMBER, MAIN_CATEGORY, SUBCATEGORY,
						DESCRIPTION, SIZE, ITEM_UNIT, MIN_QTY_REQUIRED, QTY_ON_HAND, VEND_NUMBER);
						
				map.put(ITEM_NUMBER, clinic);
		
				//System.out.println("Successfully accessed the database");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went wrong with this query attempt");
		}
			

		
		for(Integer i : map.keySet()) {
			if (Integer.parseInt(read_item_number.getText()) == i) {
				System.out.println(map.get(i).toMapString());
				//System.out.print("\n " + i.g);
				//lab.setVisible(true);
				lab.setText(map.get(i).toMapString());
			}
			
			else {
				
			//	System.out.println("Sorry, not here");
			//	lab.setText("Sorry, no such record in this database");
				continue;
			}
		}
		
		return lab;
	}
	
	public static void getMinQty(TextField read_category) {
		
		String sqlQuery = "SELECT * FROM clinic_inventory";
		Connection connect;
		Clinic_Inventory clinic;
		LinkedList<Clinic_Inventory> list = new LinkedList<Clinic_Inventory>();  //<String>
		Clinic_Inventory items;
		
		try {
			
			connect = ConnectionEstablishment.gettingConnected();
			Statement state = connect.createStatement();
			ResultSet rs = state.executeQuery(sqlQuery);
			
			
			while (rs.next() ) {
				
				Integer ITEM_NUMBER = rs.getInt("ITEM_NUMBER");
				String  MAIN_CATEGORY = rs.getString("MAIN_CATEGORY");
				String SUBCATEGORY = rs.getString("SUBCATEGORY");
				String DESCRIPTION = rs.getString("DESCRIPTION");
				String SIZE = rs.getString("SIZE");
				String  ITEM_UNIT = rs.getString("ITEM_UNIT");
				Integer MIN_QTY_REQUIRED = rs.getInt("MIN_QTY_REQUIRED");
				Integer QTY_ON_HAND = rs.getInt("QTY_ON_HAND");
				Integer VEND_NUMBER = rs.getInt("VEND_NUMBER");
				
				//Integer MIN_QTY_REQUIRED = rs.getInt("MIN_QTY_REQUIRED");
				
				items = new Clinic_Inventory(ITEM_NUMBER, MAIN_CATEGORY, SUBCATEGORY,
						DESCRIPTION, SIZE, ITEM_UNIT, MIN_QTY_REQUIRED, QTY_ON_HAND, VEND_NUMBER);
						
				
				//Need to add LinkedList toString in the Clinic_Inventory class.
				list.add(items); //list.add(items.LinkedListString());
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went wrong with this query attempt");
		}
		
		Iterator<Clinic_Inventory> itera = list.iterator();
		
		while(itera.hasNext()) {
			
			
			System.out.println(itera.next().getDESCRIPTION());
			
		}
		
		//Uncomment as soon as bubble sort is done
		//Sorting.bubbleSort(list);
		
	}
}

