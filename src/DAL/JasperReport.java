/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;

/**
 *
 * @author py
 */
public class JasperReport extends KetNoiMYSQL {
    
    public JasperReport(String Host, String UserName, String Password, String Database) {
        super(Host, UserName, Password, Database);
    }
    
    public Connection getConnection() throws Exception
    {
        return getConnect();
    }
    
}
