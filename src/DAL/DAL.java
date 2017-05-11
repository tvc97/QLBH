/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SteelWeapon
 */
public class DAL {
    private static String hostname = "localhost";
    private static String username = "root";
    private static String password = "";
    private static String database = "qlbh";
    
    private JasperReport jr;
    
    public static MYSQLUnit getDAL(){
        return new MYSQLUnit(hostname,username,password,database);
    }
    public Connection getConnection() {
        jr = new JasperReport(hostname, username, password, database);
        try {
            return jr.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
