/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nizis
 */
public class Customer {
    public Customer(){}
    public boolean checkLogin(String username, String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "Select * from Customers where username = ? and password = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
           
            ResultSet rs = st.executeQuery();
            boolean result = false;
            result = rs.next();
            String user = rs.getString(1);
            String pass = rs.getString(2);
            String role=rs.getString(5);
            Role a = new Role(user,pass,role);
            rs.close();
            st.close();
            con.close();
            if (result) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    } public List<Customers> showCus(String hvt){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "Select * from Customers";
            if(hvt.length()>0 ){
                sql="Select * from Customers where Username like '%"+hvt+"%'";
                
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Customers> list = new ArrayList<Customers>();
            while(rs.next()){
               String un = rs.getString(1);
               String pass=rs.getString(2);
                String hoten=rs.getString(3);
                
                String email=rs.getString(4);
                String admin=rs.getString(5);
                Customers a = new Customers(un,pass,hoten,email,admin);
                list.add(a);
            }
            return list;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return null;
    }
      public void delete(String txtUN){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "Delete from Customers where Username = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, txtUN);
            st.executeUpdate();
            st.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    
   
    }public boolean  insert(String un, String pass, String hoten, String email, boolean admin){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = " Insert into Customers(username,password,hoten,email,role) values(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(2, pass);
            st.setString(3, hoten);
            
            st.setString(4, email);
            st.setBoolean(5, admin);
            st.setString(1, un);
            int result = st.executeUpdate();
            st.close();
            con.close();
            if(result >0){
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
      
}
