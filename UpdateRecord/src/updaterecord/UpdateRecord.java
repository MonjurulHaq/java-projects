package updaterecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3307/mydb";
        String username="root";
        String password="";
        try{
         //load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //establish connection
        Connection conn = DriverManager.getConnection(dbUrl, username, password);
        
        Statement stmt = conn.createStatement();
        String sql = "UPDATE user1 SET name='user32'WHERE userid=1002";
        int result = stmt.executeUpdate(sql);
        System.out.println(result+" Record Updated");
        conn.close();
        }catch(SQLException e){
            
        }catch(Exception e1){
        
        }
    }
    
}
