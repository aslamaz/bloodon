/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodon.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author BlackPearl
 */
public class DB {
//   public static Connection getConnection() throws SQLException{
//        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodon","root","root");
//        return con;
//   }
   public static Connection getConnection() throws SQLException{
        String host = System.getenv("DB_HOST");
        String port = System.getenv("DB_PORT");
        String name = System.getenv("DB_NAME");
        String username = System.getenv("DB_USER");
        String password = System.getenv("DB_PASS");
        String connStr =  String.format("jdbc:mysql://%s:%s/%s", host, port, name);
        Connection con=DriverManager.getConnection(connStr,username,password);
        return con;
   }
}
