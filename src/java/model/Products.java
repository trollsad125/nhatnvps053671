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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nizis
 */
public class Products {
    public Products(){}
    public List<Product> showProduct(String tensp){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "Select * from Products";
            if(tensp.length()>0){
                sql="Select * from Products where Name like '%"+tensp+"%'";
                
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Product> list = new ArrayList<Product>();
            while(rs.next()){
                String code = rs.getString(1);
                String image = rs.getString(4);
                String name = rs.getString(2);
                Float price=rs.getFloat(3);
                
                Product sp = new Product(code,name,price,image);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
             e.printStackTrace();
        }
        return null;
    }
    public void delete(String masp){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = "Delete from Products where Code = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, masp);
            st.executeUpdate();
            st.close();
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }public void insert(String masp,String  tensp, float gia, String image){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = " Insert into Products values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,masp);
            st.setString(2, tensp);
            st.setFloat(3, gia);
            st.setString(4, image);
            st.executeUpdate();
            st.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void update(String masp,String  tensp, float gia, String image){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=asm_java4_ps05367";
            Connection con = DriverManager.getConnection(url,"sa","123");
            String sql = " update Products set Name = ?,Price = ?, Image = ? where Code = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(4,masp);
            st.setString(1, tensp);
            st.setFloat(2, gia);
            st.setString(3, image);
            st.executeUpdate();
            st.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
