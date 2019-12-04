package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Clinci_DAO extends ConnectDB {

	public Clinci_DAO() {
		System.out.println("ClinicDAO() Instantiated");
	}

	public void createIfNone() {

		boolean createTable = false;
		final String DATABASE_NAME = "aurora_charity_clinic";
		final String CREATE_TABLE = "CREATE TABLE  clinic_inventory";
		final String ID = "(id integer not null auto_increment, ";
		final String MAIN_CATEGORY = "MAIN_CATEGORY varchar(30) ";
		final String SUBCATEGORY = "SUBCATEGORY varchar(30) ";
		final String DESCRIPTION = "lname varchar(255), ";
		final String PRIMARY_KEY = "primary key (id))";

		try (Connection connection = this.getConnection()) {
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			System.out.println("Checking metaData for table.");
			System.out.print("\n\n");

			ResultSet resultSet = databaseMetaData.getCatalogs();
			System.out.println("Result Set returned.");
			System.out.println("Looping through Result Set.");
			System.out.print("\n\n");

			while (resultSet.next()) {

				String catalogs = resultSet.getString(1);
				if (DATABASE_NAME.equals(catalogs)) {
					System.out.print("\nDatabase exists.\n");
					createTable = false;
				} else {
					System.out.print("\nNo table of that name.\n");
					createTable = true;
					System.out.print("Variable createTable set: true");
				}
			}
			System.out.print("\n\n");
			if (createTable) {
                PreparedStatement preparedStatement = connection.prepareStatement(CREATE_TABLE + ID + STUDENTID + FIRSTNAME + LASTNAME + PRIMARY_KEY);
                preparedStatement.execute();
                System.out.print("\nPrepared Statement executed..");
                System.out.print("\nCreated new table.\n");
			}
		} catch (SQLException e) {
			System.out.print(e.getMessage());
		}

	}

}
