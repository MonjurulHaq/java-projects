
package dbconnect;

import java.sql.*;


public class DbConnect {

   
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3307/mydb";
        String username="root";
        String password="";
        try{
         //load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //establish connection
        Connection conn = DriverManager.getConnection(dbUrl, username, password);
        if(conn != null){
            System.out.println("Connection established");
   
        }
        Statement stmt = conn.createStatement();
        String sql="INSERT INTO user1 VALUES(1002,'MONJU1','test1@test.com')";
        int result = stmt.executeUpdate(sql);
        if(result>0){
            System.out.println("Record inserted");
        }
        else{
            System.out.println("Can't insert");
        }
        //close connection
        conn.close();
        }catch(SQLException e){
            
        }catch(Exception e1){
        
        }
    }
    
}
