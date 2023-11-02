package src;
import java.sql.*;
import java.util.*;


public class DatabaseReader {
    private static final String JDBC_URL = "jdbc:mysql://stusql.dcs.shef.ac.uk/team068";
    private static final String USERNAME = "team068";
    private static final String PASSWORD = "av2Iedusi";

    public static void main(String[] args) {
        String tableName = "TestTable";
        String name = "test_name";
        // insertName(tableName, name);
    }

    public static void insertName(String tableName, String name){
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query to retrieve all records from the specified table
            String query = "INSERT INTO " + tableName + " (name) VALUES ('" + name + "')";
            statement.executeUpdate(query);
            System.out.println("Inserted " + name + " into " + tableName);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
