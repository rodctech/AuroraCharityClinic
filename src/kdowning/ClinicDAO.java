package kdowning;

import java.sql.*;

/**
 * Student database access object.
 *
 */

public class ClinicDAO extends BaseDAO {

    public ClinicDAO(){
        System.out.println("ClinicDAO Instantiated");
    }

    /**
     * Create table if it does not exist.
     */
    public void createIfNone(){

        boolean createTable = false;
        final String DATABASE_NAME= "aurora_charity_clinic";
        final String CREATE_TABLE = "create table clinic_inventory ";
        final String ID = "(id integer not null auto_increment, ";
        final String ITEM_NUMBER = "item_number varchar(11), ";
        final String MAIN_CATEGORY = "main_category varchar(30), ";
        final String SUBCATEGORY = "subcategory varchar(30), ";
	final String DESCRIPTION = "description varchar(75), ";
	final String SIZE = "size varchar(8), ";
	final String ITEM_UNIT = "item_unit varchar(20), ";
	final String MIN_QTY_REQUIRED = "min_qty_required varchar(11), ";
	final String QTY_ON_HAND = "qty_on_hand varchar(11), ";
	final String VEND_NUMBER = "vend_number varchar(11), ";
        final String PRIMARY_KEY =  "primary key (ID))";

        try (Connection connection = this.getConnection()) {
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            System.out.println("Checking metaData for table.");
            System.out.print("\n\n");

            //Find a list of all table contained on the MySQL database server using catalogs
            ResultSet resultSet = databaseMetaData.getCatalogs();
            System.out.println("Result Set returned.");
            System.out.println("Looping through Result Set.");
            System.out.print("\n\n");

            //Search for the name of table
            while(resultSet.next()){
                String catalogs = resultSet.getString(1);
                if(DATABASE_NAME.equals(catalogs)) {
                    System.out.print("\nDatabase exists.\n");
                    createTable = false;
                }else{
                    System.out.print("\nNo table of that name.\n");
                    createTable = true;
                    System.out.print("Variable createTable set: true");
                }
            }

            System.out.print("\n\n");
            if(createTable){
                PreparedStatement preparedStatement = connection.prepareStatement(CREATE_TABLE + ID + ITEM_NUMBER + MAIN_CATEGORY +
		 SUBCATEGORY + DESCRIPTION + SIZE + ITEM_UNIT + MIN_QTY_REQUIRED + QTY_ON_HAND + VEND_NUMBER + PRIMARY_KEY);
                preparedStatement.execute();
                System.out.print("\nPrepared Statement executed..");
                System.out.print("\nCreated new table.\n");
            }
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

    }

	
    /**
     * Add a new item to the database.
     * @param .
     */
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

	


}
