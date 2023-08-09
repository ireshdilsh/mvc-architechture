
package pos.mvc.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class DBConnection {
    private static DBConnection dbconnection;
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException{
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "1234");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static DBConnection getInstance() throws ClassNotFoundException {
        if (dbconnection==null) {
            dbconnection=new DBConnection();
        } else {
        }
        return dbconnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
