/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.hk.model;
import doan.hk.model.connectsql1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class ttc2Dao {
    public boolean insert(ttc2 tTc2) throws SQLException{
      String sql = "insert into ttc2(MaHoSo, Ten, Truong, HL6, HK6, DTB6,HL7, HK7, DTB7, HL8, HK8, DTB8, HL9, HK9, DTB9 ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
      try(
         Connection conn = connectsql1.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql);             
             
              ){
                pst.setString(1, tTc2.getMaHoSo());
                pst.setString(2, tTc2.getTenHS());
                pst.setString(3,tTc2.getTenTruong());
                pst.setString(4, tTc2.getHL6());
                pst.setString(5, tTc2.getHK6());
                pst.setString(6, tTc2.getDtb6());
                pst.setString(7, tTc2.getHL7());
                pst.setString(8, tTc2.getHK7());
                pst.setString(9, tTc2.getDtb7());
                pst.setString(10, tTc2.getHL8());
                pst.setString(11, tTc2.getHK8());
                pst.setString(12, tTc2.getDtb8());
                pst.setString(13, tTc2.getHL9());
                pst.setString(14, tTc2.getHK9());
                pst.setString(15, tTc2.getDtb9());
           return pst.executeUpdate()>0;
              }
      
    }
    
     public ttc2 searchById(String maHoSo) throws Exception{
      String sql ="select * from ttc2 where MaHoSo = ? ";
       try(
            Connection conn = connectsql1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(1, maHoSo);
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               ttc2 tTc2 = new ttc2();
               tTc2.setMaHoSo(rs.getString("MaHoSo"));
               tTc2.setTenHS(rs.getString("Ten"));
               tTc2.setTenTruong(rs.getString("Truong"));
               tTc2.setHL6(rs.getString("HL6"));
               tTc2.setHK6(rs.getString("HK6"));
               tTc2.setDtb6(rs.getString("DTB6"));
               tTc2.setHL7(rs.getString("HL7"));
               tTc2.setHK7(rs.getString("HK7"));
               tTc2.setDtb7(rs.getString("DTB7"));
               tTc2.setHL8(rs.getString("HL8"));
               tTc2.setHK8(rs.getString("HK8"));
               tTc2.setDtb8(rs.getString("DTB8"));
               tTc2.setHL9(rs.getString("HL9"));
               tTc2.setHK9(rs.getString("HK9"));
               tTc2.setDtb9(rs.getString("DTB9"));
               return tTc2;
           }
       }
     
           return null;
     }
     
     public boolean upDate(ttc2 Ttc2) throws Exception{
      String sql ="update ttc2 set Ten=?, Truong=?, HL6=?, HK6=?, DTB6=?,  HL7=?, HK7=?, DTB7=?,  HL8=?, HK8=?, DTB8=?,  HL9=?, HK9=?, DTB9=?"
              + " where MaHoSo=?";
       try(
            Connection conn = connectsql1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(15, Ttc2.getMaHoSo());
           pst.setString(1, Ttc2.getTenHS());
           pst.setString(2,  Ttc2.getTenTruong());
           pst.setString(3, Ttc2.getHL6());
           pst.setString(4, Ttc2.getHK6());
           pst.setString(5, Ttc2.getDtb6());
           pst.setString(6, Ttc2.getHL7());
           pst.setString(7, Ttc2.getHK7());
           pst.setString(8, Ttc2.getDtb7());
           pst.setString(9, Ttc2.getHL8());
           pst.setString(10, Ttc2.getHK8());
           pst.setString(11, Ttc2.getDtb8());
           pst.setString(12, Ttc2.getHL9());
           pst.setString(13, Ttc2.getHK9());
           pst.setString(14, Ttc2.getDtb9());
           return pst.executeUpdate()>0;
       }   
    }
     
     public boolean delete(String maHoSo) throws Exception{
      String sql ="delete from ttc2 where MaHoSo = ? ";
       try(
            Connection conn = connectsql1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(1, maHoSo);
           
           return pst.executeUpdate()>0;
       }
        
    }
}
