package src;
import java.sql.*;
import java.util.*;

public class FindDrivers {
  public static void main(String[] args) throws Exception {
    
    System.out.println("\nDrivers loaded as properties:");
    System.out.println(System.getProperty("jdbc.drivers"));
    System.out.println("\nDrivers loaded by DriverManager:");
    Enumeration<Driver> list = DriverManager.getDrivers();
    while (list.hasMoreElements()){
      System.out.println(list.nextElement());}

    Connection con = null;  // a Connection object
    try {
      con = DriverManager.getConnection("jdbc:mysql://stusql.dcs.shef.ac.uk/team068", "team068", "av2Iedusi");
      Statement statement = con.createStatement();

      // Execute a query to retrieve all records from your table
      String query = "SELECT * FROM TestTable";
      ResultSet resultSet = statement.executeQuery(query);

      // Get metadata to retrieve column names
      ResultSetMetaData metaData = resultSet.getMetaData();
      int columnCount = metaData.getColumnCount();

      // Print column names
      for (int i = 1; i <= columnCount; i++) {
          System.out.print(metaData.getColumnName(i) + "\t");
      }
      System.out.println();

      // Print records
      while (resultSet.next()) {
          for (int i = 1; i <= columnCount; i++) {
              System.out.print(resultSet.getString(i) + "\t");
          }
          System.out.println();
      }
    }
    catch (SQLSyntaxErrorException ex) {
      System.out.println(ex.getLocalizedMessage());
    }
    finally {
      if (con != null) con.close();
    }

  }
  
}