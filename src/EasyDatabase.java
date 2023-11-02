package src;
import java.sql.*;


public class EasyDatabase {
    private static final String JDBC_URL = "jdbc:mysql://stusql.dcs.shef.ac.uk/team068";
    private static final String USERNAME = "team068";
    private static final String PASSWORD = "av2Iedusi";

    Statement statement = null;
    Connection con = null;



    public void connect() {
        try {
            con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            statement = con.createStatement();
            // execute your SQL statements here
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
