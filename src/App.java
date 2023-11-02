package src;
import java.sql.*;


public class App {
    public static void main(String[] args) throws Exception {
        EasyDatabase db = new EasyDatabase();
        db.executeQuery("SELECT * FROM TestTable");
        db.printQuery();
        db.close();
    }
}
