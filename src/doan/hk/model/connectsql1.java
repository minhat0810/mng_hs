/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.hk.model;



//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
public class connectsql1 {
 
    public static Connection getConnection() throws SQLException{
         Connection conn = null;
        try{
      
       // Class.forName("com.mysql.sqlserver.jdbc.SQLServerDriver");
       conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VQ8FO7NU\\SQLEXPRESS:1433;" + "user=sa;password=123;databaseName=DoanQLTS;encrypt=false");
       if(conn != null) System.out.println("Ket noi thanh cong");
        } catch(Exception e){
            System.out.println("Kết nối thất bại");
        }
        return conn;
    }
    
//    public boolean login(String taikhoan, String matkhau){
//         Connection conn= getJDBCConnection();
//        String sql =" SELECT * FROM accounts WHERE taikhoan = ? and matkhau= ?";
//        try {
//            PreparedStatement ps=conn.prepareStatement(sql);
//            ps.setString(1, taikhoan);
//            ps.setString(2, matkhau);
//            ResultSet rs =ps.executeQuery();
//            if(rs.next()){
//                return true;
//            }else
//                return false;
//        } catch (SQLException ex) {
//            Logger.getLogger(connectsql.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    
//    }
    
    public static void main(String[] args) {
     connectsql1 c = new connectsql1();
    }
    

}