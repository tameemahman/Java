
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class jdb {
    
    
         
    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/mysql";
    private String userName = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {

        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, userName, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jdb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jdb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    
}
