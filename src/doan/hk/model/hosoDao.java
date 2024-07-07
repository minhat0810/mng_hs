/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan.hk.model;

import doan.hk.model.connectsql1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author PC
 */
public class hosoDao {
    public boolean insert(Hoso hs) throws Exception{
      String sql ="insert into ts10(MaHoSo,Ten,NgaySinh,GioiTinh,NoiSinh,SDT,TenLop,DiemXet) values (?,?,?,?,?,?,?,?) ";
       try(
            Connection conn = connectsql1.getConnection();
           // Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VQ8FO7NU\\SQLEXPRESS:1433;" + "user=sa;password=123;databaseName=DoanQLTS;encrypt=false"); 
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(1, hs.getMaHoSo());
           pst.setString(2, hs.getTenHS());
           pst.setString(3,  hs.getNgaySinh());
           pst.setString(4, hs.getGioiTinh());
           pst.setString(5, hs.getNoiSinh());
           pst.setString(6, hs.getSdt());
           pst.setString(7, hs.getTenLop());
           pst.setString(8, hs.getDiemXet());
           return pst.executeUpdate()>0;
       }
        
    }
 
    //tim kiem
        public Hoso searchById(String maHoSo) throws Exception{
      String sql ="select * from ts10 where MaHoSo = ? ";
       try(
            Connection conn = connectsql1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(1, maHoSo);
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               Hoso hoso = new Hoso();
               hoso.setMaHoSo(rs.getString("MaHoso"));
               hoso.setTenHS(rs.getString("Ten"));
               hoso.setNgaySinh(rs.getString("NgaySinh"));
               hoso.setGioiTinh(rs.getString("GioiTinh"));
               hoso.setNoiSinh(rs.getString("NoiSinh"));
               hoso.setSdt(rs.getString("SDT"));
               hoso.setTenLop(rs.getString("TenLop"));
               hoso.setDiemXet(rs.getString("DiemXet"));
               
               return hoso;
           }
           return null;
       }
        
    }
 
        // chỉnh sửa
        public boolean upDate(Hoso hs) throws Exception{
      String sql ="update ts10 set Ten=?, NgaySinh=?, GioiTinh=?, NoiSinh=?, Sdt=?, TenLop=?, DiemXet=?"
              + " where MaHoSo=?";
       try(
            Connection conn = connectsql1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(8, hs.getMaHoSo());
           pst.setString(1, hs.getTenHS());
           pst.setString(2,  hs.getNgaySinh());
           pst.setString(3, hs.getGioiTinh());
           pst.setString(4, hs.getNoiSinh());
           pst.setString(5, hs.getSdt());
           pst.setString(6, hs.getTenLop());
           pst.setString(7, hs.getDiemXet());
           return pst.executeUpdate()>0;
       }
        
    }
      
        
         public boolean delete(String maHoSo) throws Exception{
      String sql ="delete from ts10 where MaHoSo = ? ";
       try(
            Connection conn = connectsql1.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
               ){
           pst.setString(1, maHoSo);
           
           return pst.executeUpdate()>0;
       }
        
    }
}
