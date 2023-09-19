package javadb;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.jjdb;



public class Javadb {

    public static void main(String[] args) {
        
        jjdb con =new jjdb();
        String sql ="insert into students(name, age) values (?,?)";
        
        
        try {
            PreparedStatement ps =con.getCon().prepareStatement(sql);
            ps.setString(1, "Rajin");
            ps.setInt(2, 42);
            
            ps.executeUpdate();
            System.out.println("ok");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Javadb.class.getName()).log(Level.SEVERE, null, ex);
        }
        

}

}
