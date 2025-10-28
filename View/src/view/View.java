package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Student
 */
public class View {

    /**
     * @param args the command line arguments
     */
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
        String sql="SELECT * FROM user1";
        ResultSet rst;
        rst = stmt.executeQuery(sql);
        int uid;
        String name,email;
        while(rst.next()){
            uid = rst.getInt("userid");
            name = rst.getString("name");
            email = rst.getString("email");
            System.out.println("User id: "+uid+ " User name: "+ name + " User email: "+email);
        }
        rst.close();
        stmt.close();
        //close connection
        conn.close();
        }catch(SQLException e){
            
        }catch(Exception e1){
        
        }
    
    }
    
}
