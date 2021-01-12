/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dbHelper;

import controller.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qrcode.Register;

/**
 *
 * @author Thomas
 */
public class DBHandler extends Config {

    Connection dbConnection;

    public Connection getdbConnection() {

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String conString = ("jdbc:mysql://" + dbHost + dbPort + dbName);
            dbConnection = DriverManager.getConnection(conString, dbUser, dbPass);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dbConnection;
    }
    
    public void inserUser() {
        Register generator = new Register();
        
    }
}
