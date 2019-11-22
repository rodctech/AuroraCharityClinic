package model;


import java.sql.Connection;
import java.sql.SQLException;

/**
 * interface DAO access
 */
public interface DAO {
    Connection getConnection() throws SQLException;
}
