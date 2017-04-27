/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.*;

/**
 *
 * @author SteelWeapon
 */
public class KetNoiMYSQL {
    String Host="";
    String UserName="";
    String Password="";
    String Database="";
    Connection connect = null;
    Statement statement = null;
    ResultSet result = null;
    
    public KetNoiMYSQL(String Host, String UserName, String Password, String Database){
        this.Host= Host;
        this.UserName= UserName;
        this.Password= Password;
        this.Database= Database;
        
    }
    // hàm ktra driver đã ss hay chưa
    protected void DriverTest() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(java.lang.ClassNotFoundException e){
            throw new Exception ("MYSQL JDBC Driver not found");
            
        }
    }
    // Hàm lấy connnection
    protected Connection getConnect() throws Exception{
        if(this.connect == null){
            //ktra Driver
            DriverTest();
            String url = "jdbc:mysql://"+ this.Host+":3306/"+this.Database+"?useUnicode=true&characterEncoding=UTF-8";
            try{
                this.connect = DriverManager.getConnection(url,this.UserName,this.Password);
                
            }
            catch(java.sql.SQLException e){
                throw new Exception ("Không thể kết nối đến database"+ url + e.getMessage());
            }
                      
        }
        return this.connect;
    }
    // Tạo statement để thực thi câu query
    protected Statement getStatement() throws Exception{
        // KT neeys statement = null hoặc đã đóng
        if(this.statement == null ? true : this.statement.isClosed()){
            // khởi tạo một statement mới
            this.statement = this.getConnect().createStatement();
            
        }
        // trả statement ra ngoài
        return this.statement;
    }
// hàm thực thi câu lệnh Select lấy từ csdl   
    public ResultSet ExcuteQuery(String Query) throws Exception{
        try{
            // getStatement() tạo một statement để thực thi câu truy vấn
            this.result = getStatement().executeQuery(Query);
        }
        catch(Exception e){
            throw new Exception("Errow: "+ e.getMessage());
            
        }
        return this.result;
    }
    // thực thi các cây lệnh Insert Update Delete
    public int ExcuteUpdate(String Query) throws Exception{
        // bien res lưu trữ kết quả tình trạng thực thi câu truy vấn
        int res = Integer.MIN_VALUE; 
        try{
            res = getStatement().executeUpdate(Query);
        }
        catch(Exception e){
            throw new Exception ("Error: "+ e.getMessage());
        }
        finally{
            this.Close();
        }
        return res;
    }
    public void Close() throws SQLException{
        if(this.result!= null && !this.result.isClosed()){
            this.result.close();
            this.result = null;
        }
        if(this.statement != null && !this.statement.isClosed()){
            this.statement.close();
            this.statement = null;
        }
        if(this.connect != null && !this.connect.isClosed()){
            this.connect.close();
            this.connect = null;
        }
    }
}


