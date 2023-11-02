package src;
import java.sql.*;


public class App {
    public static void main(String[] args) throws Exception {
        Test();
    }


    public static void Test(){
        EasyDatabase easyDatabase = new EasyDatabase();
        easyDatabase.connect();
        String query = "SELECT * FROM TestTable";
        try{
            ResultSet resultSet = easyDatabase.statement.executeQuery(query);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
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
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            easyDatabase.close();
        }
    }
    
}
