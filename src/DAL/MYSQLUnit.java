/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import java.util.HashMap;
import javax.swing.text.TabExpander;
/**
 *
 * @author SteelWeapon
 */
public class MYSQLUnit {
    private KetNoiMYSQL connect;
    public MYSQLUnit(String Host, String User, String Password, String Database){
       
        connect = new KetNoiMYSQL(Host, User, Password, Database);
    }
    public ResultSet Select(String TableName, String Condition, String Orderby) throws Exception{
        StringBuilder qry = new StringBuilder("SELECT * FROM " + TableName);
        this.addCondition(qry, Condition);
        this.addOrderBy(qry, Orderby);
        qry.append(";");
        return this.connect.ExcuteQuery(qry.toString());
        
        
    }
    private void addCondition(StringBuilder qry,String condition ){
        if(condition!= null){
           qry.append(" WHERE "+ condition);
        }
    }
    private void addOrderBy(StringBuilder qry, String orderby){
        if(orderby!= null){
            qry.append(" ORDER BY "+ orderby);
        }
    }
    public ResultSet Select(String TableName, String Condition) throws Exception{
        return this.Select(TableName, Condition,null);
    }
    public ResultSet Select(String TableName) throws Exception{
        return this.Select(TableName, null,null);
    }
    public Boolean Insert(String TableName, HashMap<String,Object> ColumValues) throws Exception{
        StringBuilder qry = new StringBuilder("INSERT INTO "+ TableName); 
        StringBuilder valueInsert  = new StringBuilder();
        qry.append("(");
        for(String key : ColumValues.keySet()){
            qry.append(key+","); // qry lưu tất cả các tiêu đề (key) của bảng;
            valueInsert.append("'"+ColumValues.get(key).toString()+"',");// valueInsert lưu tất cả các giá trị của bảng
        }
        qry= qry.delete(qry.length()-1, qry.length());
        valueInsert = valueInsert.delete(valueInsert.length()-1, valueInsert.length());
        qry.append(") VALUE("+ valueInsert.toString()+")");
        qry.append(";");
        return this.connect.ExcuteUpdate(qry.toString())>0;
    }
    public Boolean InsertNull(String TableName, HashMap<String,Object> ColumValues) throws Exception{
        StringBuilder qry = new StringBuilder("INSERT INTO "+ TableName); 
        StringBuilder valueInsert  = new StringBuilder();
        qry.append("(");
        for(String key : ColumValues.keySet()){
            qry.append(key+","); // qry lưu tất cả các tiêu đề (key) của bảng;
            valueInsert.append("'"+ColumValues.get(key).toString()+"',");// valueInsert lưu tất cả các giá trị của bảng
        }
        qry= qry.delete(qry.length()-1, qry.length());
        valueInsert = valueInsert.delete(valueInsert.length()-1, valueInsert.length());
        qry.append(") VALUE("+ valueInsert.toString()+")");
        qry.append(";");
        String t = qry.substring(0);
        char a[] = t.toCharArray();
        int f=0;
        int l=0;
        for (int i = 0; i < qry.length(); i++) {
            if(a[i]=='0'&& a[i+1]!='0'&&a[i-1]!='0'&&a[i-1]!='1'){
                f=i-1;
                l=i+1;
                break;
            } 
        }
        qry.replace(f,++l,"null");
        return this.connect.ExcuteUpdate(qry.toString())>0;
    }
    // Update TableName  Set ColumnName = ColumnValue Where Condition 
    public Boolean Update(String TableName, HashMap<String,Object> ColumValues,String Condition) throws Exception{
        StringBuilder qry = new StringBuilder("Update " + TableName + " SET "); 
        for(String key : ColumValues.keySet()){
            qry.append(key + " = '" +ColumValues.get(key).toString()+"',");
        }
        qry= qry.delete(qry.length()-1, qry.length());
        this.addCondition(qry, Condition);
        qry.append(";");
        return this.connect.ExcuteUpdate(qry.toString())>0;
    }
    public Boolean Delete(String TableName,String Condition) throws Exception{
        StringBuilder qry = new StringBuilder("DELETE FROM " + TableName); 
        this.addCondition(qry, Condition);
        qry.append(";");
        return this.connect.ExcuteUpdate(qry.toString())>0;
    }
    
}
