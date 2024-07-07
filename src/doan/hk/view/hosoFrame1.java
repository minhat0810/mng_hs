/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doan.hk.view;





import doan.hk.model.Hoso;
import doan.hk.model.connectsql1;
import doan.hk.model.hosoDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import com.sun.jdi.connect.spi.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author PC
 */
public class hosoFrame1 extends javax.swing.JFrame {
   
    /**
     * Creates new form hosoFrame
     * @return 
     * @throws java.sql.SQLException 
     */
  final String header[] = {"Mã hồ sơ","Tên","Ngày sinh", "Giới tính","Nơi sinh", "Số điện thoại", "Lớp", "Điểm xét"};
  final DefaultTableModel tb = new DefaultTableModel(header,0);
  connectsql1 cns = new connectsql1();  
  Connection conn ;
  public void loadBang(){
        try {
      
            conn = cns.getConnection();
            int number;
            Vector row;
            String sql = "select * from ts10";
            java.sql.Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            java.sql.ResultSetMetaData metaData = rs.getMetaData();
            number = metaData.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()){
               row = new Vector();
               for (int i=1; i <= number; i++)
                  row.addElement(rs.getString(i));
                  tb.addRow(row);
                  showTable.setModel(tb);
                
               }
            st.close();
            conn.close();
        } catch (Exception e) {
        }
               showTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {              
                if(showTable.getSelectedRow() >= 0){
                  mahsField.setText(showTable.getValueAt(showTable.getSelectedRow(), 0)+ "");
                  tenhsField.setText(showTable.getValueAt(showTable.getSelectedRow(), 1)+ "");
                  nsField.setText(showTable.getValueAt(showTable.getSelectedRow(), 2)+ "");
                  gtField.setText(showTable.getValueAt(showTable.getSelectedRow(), 3)+"");
                  qqField.setText(showTable.getValueAt(showTable.getSelectedRow(), 4)+ "");         
                  sdtField.setText(showTable.getValueAt(showTable.getSelectedRow(), 5)+ "");
                  lopField.setText(showTable.getValueAt(showTable.getSelectedRow(), 6)+ "");
                  dxField.setText(showTable.getValueAt(showTable.getSelectedRow(), 7)+ "");
                  
                }
            }
        } );
    }
  public hosoFrame1() throws SQLException {
        //createTable();
        initComponents();
     setLocationRelativeTo(null);
      loadBang();
    }

//     public void getDatabase() throws SQLException{ 
//         connectsql cns = new connectsql();
//        Connection conn = cns.getConnection();
//       try{
//           
//           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//           Connection  conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VQ8FO7NU\\SQLEXPRESS:1433;" + "user=sa;password=123;databaseName=DoanQLTS;encrypt=false");
//         connectsql cns = new connectsql();
//         Connection conn = cns.getConnection();
//         PreparedStatement pst = conn.prepareStatement("Select * from ts10");
//         ResultSet rs = pst.executeQuery();
//         DefaultTableModel model = (DefaultTableModel) showTable.getModel();
//         while(rs.next()){
//           Object objList[] = {rs.getString("MaHoSo"), rs.getString("Ten"), rs.getDate("NgaySinh"), rs.getString("GioiTinh")
//                          , rs.getString("NoiSinh"),rs.getString("SDT"), rs.getString("TenLop"), rs.getFloat("DiemXet")};
//           model.addRow(objList);
//         }
//       }catch(SQLException ex){
//           Logger.getLogger(hosoFrame.class.getName()).log(Level.SEVERE, null, ex);
//       }
//       showTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//            @Override
//            public void valueChanged(ListSelectionEvent e) {              
//                if(showTable.getSelectedRow() >= 0){
//                  mahsField.setText(showTable.getValueAt(showTable.getSelectedRow(), 0)+ "");
//                  tenhsField.setText(showTable.getValueAt(showTable.getSelectedRow(), 1)+ "");
//                  nsField.setText(showTable.getValueAt(showTable.getSelectedRow(), 2)+ "");
//                  qqField.setText(showTable.getValueAt(showTable.getSelectedRow(), 4)+ "");         
//                  sdtField.setText(showTable.getValueAt(showTable.getSelectedRow(), 5)+ "");
//                  lopField.setText(showTable.getValueAt(showTable.getSelectedRow(), 6)+ "");
//                  dxField.setText(showTable.getValueAt(showTable.getSelectedRow(), 7)+ "");
//                  
//                }
//            }
//        } );
//       
//    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mahsField = new javax.swing.JTextField();
        tenhsField = new javax.swing.JTextField();
        nsField = new javax.swing.JTextField();
        qqField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sdtField = new javax.swing.JTextField();
        lopField = new javax.swing.JTextField();
        dxField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetBt = new javax.swing.JButton();
        timBtn = new javax.swing.JButton();
        gtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HỒ SƠ HỌC SINH");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 787, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jScrollPane1ComponentAdded(evt);
            }
        });

        showTable.setAutoCreateRowSorter(true);
        showTable.setBackground(new java.awt.Color(242, 242, 242));
        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HS", "Tên học sinh", "Ngày sinh", "Giới tính", "Quê quán", "SĐT", "Lớp", "Điểm xét"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        showTable.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                showTableComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(showTable);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Mã hồ sơ");

        jLabel3.setText("Tên học sinh");

        jLabel4.setText("Giới tính");

        jLabel5.setText("Quê quán");

        tenhsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenhsFieldActionPerformed(evt);
            }
        });

        nsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nsFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Ngày sinh");

        jLabel7.setText("Số điện thoại");

        jLabel8.setText("Lớp");

        jLabel9.setText("Điểm xét");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        editBtn.setText("Sửa");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteButton.setText("Xóa");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        resetBt.setText("Quay lai");
        resetBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editBtn)
                .addGap(274, 274, 274)
                .addComponent(deleteButton)
                .addGap(138, 138, 138)
                .addComponent(resetBt)
                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(deleteButton)
                    .addComponent(resetBt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        timBtn.setText("Tìm kiếm");
        timBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timBtnActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\IconNet\\search_24px.png")); // NOI18N

        addBtn.setText("Thêm");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(gtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(qqField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addComponent(tenhsField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mahsField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lopField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dxField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nsField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdtField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(mahsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(nsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(timBtn))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tenhsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sdtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(gtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qqField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(dxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Pictures\\New folder\\istockphoto-1266638415-1024x1024.jpg")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 1060, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents


//  xóa trắng sau khi thêm
    public  void xoaTrang(){
       mahsField.setText("");
       tenhsField.setText("");
       nsField.setText("");
       gtField.setText("");
       qqField.setText("");
       sdtField.setText("");
       lopField.setText("");
       dxField.setText("");
    }
    
    private void showTableComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_showTableComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_showTableComponentAdded

    private void jScrollPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1ComponentAdded

    private void timBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timBtnActionPerformed
        // TODO add your handling code here:
        if(mahsField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn cần nhập mã hồ sơ cần tìm. ");
            return;
        }

        try {

            hosoDao hsDao = new hosoDao();
            Hoso hs = hsDao.searchById(mahsField.getText());

            if(hs != null){//nếu tìm thấy set các giá trị vào ô text

                mahsField.setText(hs.getMaHoSo());
                tenhsField.setText(hs.getTenHS());
                nsField.setText(hs.getNgaySinh());
                gtField.setText(hs.getGioiTinh());
                qqField.setText(hs.getNoiSinh());
                sdtField.setText(hs.getSdt());
                lopField.setText(hs.getTenLop());
                dxField.setText(hs.getDiemXet());
            }else JOptionPane.showMessageDialog(this, "Không tìm thấy hồ sơ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_timBtnActionPerformed

    private void resetBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtActionPerformed
        // TODO add your handling code here:
        quanliFrame1 qlf = new quanliFrame1 ();
        qlf.show();
        dispose();
    }//GEN-LAST:event_resetBtActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(mahsField.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Hãy nhập hồ sơ cần xóa. ");
        }else{
            if(sb.length()>0){
                JOptionPane.showMessageDialog(this, sb.toString());
            }

            try{
                hosoDao hsDao = new hosoDao();
                hsDao.delete(mahsField.getText());
                JOptionPane.showMessageDialog(this, "Xóa thành công. ");
                hosoFrame1 hsf = new hosoFrame1();
                hsf.show();
                dispose();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Errol: "+ e.getMessage());
                e.printStackTrace();
                
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(mahsField.getText().equals("") || tenhsField.getText().equals("") ||nsField.getText().equals("")
            || qqField.getText().equals("") || sdtField.getText().equals("")|| lopField.getText().equals("") || dxField.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Hãy nhập đủ dữ liệu. ");
        }else{
            if(sb.length()>0){
                JOptionPane.showMessageDialog(this, sb.toString());
            }

            try{
                Hoso hs = new Hoso();
                hs.setMaHoSo(mahsField.getText());
                hs.setTenHS(tenhsField.getText());
                hs.setNgaySinh(nsField.getText());
                hs.setGioiTinh(gtField.getText());
                hs.setNoiSinh(qqField.getText());
                hs.setSdt(sdtField.getText());
                hs.setTenLop(lopField.getText());
                hs.setDiemXet(dxField.getText());
                hosoDao hsDao = new hosoDao();
                hsDao.upDate(hs);
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                hosoFrame1 hsf = new hosoFrame1();
                hsf.show();
                dispose();
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Errol: "+ e.getMessage());
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_editBtnActionPerformed

    //   String sql =" SELECT * FROM dangnhap";
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
          
        //Validate cho hồ sơ bị bỏ trống
        
        try{
            if(mahsField.getText().equals("") || tenhsField.getText().equals("") ||nsField.getText().equals("")
                || qqField.getText().equals("") || sdtField.getText().equals("")|| lopField.getText().equals("") 
                    || dxField.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Hãy nhập đủ dữ liệu. ");
              validateDate();
            }else{
                // check khóa chính
                connectsql1 cns = new connectsql1();
                Connection conn = cns.getConnection();
                StringBuilder sb = new StringBuilder();
                String sql_check_pk = "Select MaHoSo from ts10 where MaHoSo = '"+mahsField.getText()+ "'";
                java.sql.Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql_check_pk);
                if (rs.next()){
                    sb.append("Học sinh này đã tồn tại.");
                }
                if(sb.length()>0){// ktr độ dài của sb. >0 thì  tồn tại và in ra tb
                    JOptionPane.showMessageDialog(this, sb.toString());

                }else {
                    try {
                        Hoso hs = new Hoso();

                        hs.setMaHoSo(mahsField.getText());
                        hs.setTenHS(tenhsField.getText());
                        hs.setNgaySinh(nsField.getText());
                        hs.setGioiTinh(gtField.getText());
                        hs.setNoiSinh(qqField.getText());
                        hs.setSdt(sdtField.getText());
                        hs.setTenLop(lopField.getText());
                        hs.setDiemXet(dxField.getText());
                        hosoDao hsD = new hosoDao();
                        hsD.insert(hs);
                        xoaTrang();
                        JOptionPane.showMessageDialog(this, "Thêm thành công. ");
                        hosoFrame1 hsf = new hosoFrame1();
                hsf.show();
                dispose();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Error"+e.getMessage());
                        e.printStackTrace();
                    }
                }
           
            }
        }catch (Exception e){}

    }//GEN-LAST:event_addBtnActionPerformed

    private void tenhsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenhsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenhsFieldActionPerformed

    private void nsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nsFieldActionPerformed

     public void validateDate(){
       SimpleDateFormat dateF = new SimpleDateFormat();
       try{
       String strDate = nsField.getText().toString();
       dateF.applyPattern("yyyy-MM-dd");
       Date date = dateF.parse(strDate);
       dateF.format(date);
       StringBuilder sb = new StringBuilder();
       
     //  sb.append("Ngày sinh không hợp lệ. ");
       if(sb.length()>0){
         sb.append("Ngày sinh không hợp lệ. ");
         JOptionPane.showMessageDialog(this, sb.toString());
       }
       } catch (Exception e){
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
      
     }
 
    /**
     * @param args the command line arguments
     */
    
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(hosoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(hosoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(hosoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(hosoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new hosoFrame1().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(hosoFrame1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    //     hosoFrame hsf = new hosoFrame();
//   //      hsf.show();
//         //dispose();
//    }
    
     }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField dxField;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField gtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lopField;
    private javax.swing.JTextField mahsField;
    private javax.swing.JTextField nsField;
    private javax.swing.JTextField qqField;
    private javax.swing.JButton resetBt;
    private javax.swing.JTextField sdtField;
    private javax.swing.JTable showTable;
    private javax.swing.JTextField tenhsField;
    private javax.swing.JButton timBtn;
    // End of variables declaration//GEN-END:variables

   
}
