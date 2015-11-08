/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.*;

/**
 *
 * @author Victor
 */
public class Connection {
    
     public Connection getConnection()
            throws SQLException {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return (Connection) DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Estoque", "root", "senha");
     } 
}