import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataBaseHandler {

    Connection connection;

    public DataBaseHandler(String url, String user, String password) throws SQLException {
        this.connection = DriverManager.getConnection(url, user, password);
    }

    public List<Object> getObjectsFromDatabase() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM TABLE_NAME"); //Table_name wird replaced
        List<Object> results = new ArrayList<>();
        while(resultSet.next()){
            String var1 = resultSet.getString("column1"); // column1(benennung!) = String als Inhalt
            int var2 = resultSet.getInt("column2"); // column2(benennung!) = Integer als Inhalt
            Object object = null;
            //object = new Object(var1,var2);
            results.add(object);

        }
        return results;
    }





}
