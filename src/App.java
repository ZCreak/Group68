package src;
import java.sql.*;
import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final SwingWindow window = new SwingWindow("Database");
                window.setVisible(true);
            }
        });
        // Note - I commented out the database querying because - well - we don't have a database. Making one is up on our priority list. Lets get this!
        EasyDatabase db = new EasyDatabase();
        //db.executeQuery("SELECT * FROM TestTable");
        //db.printQuery();
        db.close();
        
    }
}
