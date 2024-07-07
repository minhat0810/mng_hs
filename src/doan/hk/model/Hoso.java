package doan.hk.model;

import java.util.Date;


public class Hoso {
    private String maHoSo;
    private String tenHS;
    private String ngaySinh;
    private String gioiTinh;
    private String noiSinh;
    private String sdt;
    private String diemXet;
    private String tenLop;

    public Hoso() {
    }

    public Hoso(String maHoSo, String tenHS, String ngaySinh, String gioiTinh, String noiSinh, String sdt, String diemXet, String tenLop) {
        this.maHoSo = maHoSo;
        this.tenHS = tenHS;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
       // this.nam = nam;
        this.noiSinh = noiSinh;
        this.sdt = sdt;
        this.diemXet = diemXet;
        this.tenLop = tenLop;
    }

    public String getMaHoSo() {
        return maHoSo;
    }

    public void setMaHoSo(String maHoSo) {
        this.maHoSo = maHoSo;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

//    public boolean isNam() {
//        return nam;
//    }

//    public void setNam(boolean nam) {
//        this.nam = nam;
//    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiemXet() {
        return diemXet;
    }

    public void setDiemXet(String diemXet) {
        this.diemXet = diemXet;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "hoso{" +
                "maHoSo=" + maHoSo +
                ", tenHS='" + tenHS + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
              //  ", nam=" + nam +
                ", noiSinh='" + noiSinh + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diemXet=" + diemXet +
                ", tenLop='" + tenLop + '\'' +
                '}';
    }

    public String getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Hoso searchById(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
