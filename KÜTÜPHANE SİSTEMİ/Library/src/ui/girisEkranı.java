
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class girisEkranı extends javax.swing.JFrame {
    

    
    public girisEkranı() {
        initComponents();
    }

    public ArrayList<Users> getUsers() throws SQLException{
            Connection connection = null;
            Statement statement=null;
            ResultSet resultSet;
            ArrayList<Users> users = new ArrayList<>();
            
        try{
            connection = DbHelperSingleton.getConnection();
            System.out.println("Baglanti basarili.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users");
            
            while(resultSet.next()){
                users.add(new Users(
                        resultSet.getInt("id"),
                        resultSet.getString("user_name"),
                        resultSet.getString("user_surname"),
                        resultSet.getString("mail"),
                        resultSet.getString("password")
                )
                );
            }
            
        }catch(SQLException exception){
            DbHelperSingleton.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        
        return users;
    }
    
    public ArrayList<Admins> getAdmins() throws SQLException{
            Connection connection = null;
            Statement statement=null;
            ResultSet resultSet;
            ArrayList<Admins> admins = new ArrayList<>();
            
        try{
            connection = DbHelperSingleton.getConnection();
            System.out.println("Baglanti basarili.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from admin");
            
            while(resultSet.next()){
                admins.add(new Admins(
                        resultSet.getInt("id"),
                        resultSet.getString("admin_NickName"),
                        resultSet.getString("admin_mail"),
                        resultSet.getString("admin_password")
                )
                );
            }
            
        }catch(SQLException exception){
            DbHelperSingleton.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        
        return admins;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblAsk = new javax.swing.JLabel();
        btnGoToRegister = new javax.swing.JButton();
        lblMailMessage = new javax.swing.JLabel();
        lblPasswordMessage = new javax.swing.JLabel();
        btnAdminLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Ekranı");
        setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setText("Kullanıcı Girişi");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        lblMail.setText("E-mail");

        lblPassword.setText("Şifre");

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblAsk.setText("Üye değil misiniz ?");

        btnGoToRegister.setText("Kaydol");
        btnGoToRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToRegisterActionPerformed(evt);
            }
        });

        btnAdminLogin.setText("Admin Girişi");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAsk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMail)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMailMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPasswordMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGoToRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminLogin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMail)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMailMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPasswordMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin)
                            .addComponent(btnAdminLogin))
                        .addGap(27, 27, 27)
                        .addComponent(lblAsk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGoToRegister))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnGoToRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToRegisterActionPerformed
                this.dispose();
                kayıtEkranı kEkranı = new kayıtEkranı();
                kEkranı.setVisible(true);
                kEkranı.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }//GEN-LAST:event_btnGoToRegisterActionPerformed
    //kullanıcı bulunduğunda kapanmasın diye değişken oluşturma
    public boolean d;
    public void giris(){
            
            boolean kullaniciBulundu = false;
        
        try{
            for (Users user : getUsers()){
            if (user.getMail().equals(txtMail.getText()) && user.getPassword().equals(txtPassword.getText())) {
                kullaniciBulundu = true;
                break;
            }
        }
            if (kullaniciBulundu) {
            d=kullaniciBulundu;
            Connection connection1 = null;
            Statement statement1 = null;
            Statement statement2 = null;
            ResultSet resultSet1 = null;
            ResultSet resultSet2 = null;
            PreparedStatement preparedStatement1 = null;
            ArrayList<String> getName = new ArrayList<>();
            ArrayList<String> getOldName = new ArrayList<>();
            String userMail = txtMail.getText();

            try {
                connection1 = DbHelperSingleton.getConnection();
                statement1 = connection1.createStatement();

                // 1. Adım: Veriyi Çekme
                resultSet1 = statement1.executeQuery("select * from users where mail='" + userMail + "'");
                if (resultSet1.next()) {
                    getName.add(resultSet1.getString("user_name"));
                    System.err.println(getName.get(0));
                }

                // Bağlantıyı kapat
                if (resultSet1 != null) {
                    resultSet1.close();
                }
                if (statement1 != null) {
                    statement1.close();
                }
                if (connection1 != null) {
                    connection1.close();
                }

                // 2. Adım: Veriyi Güncelleme
                connection1 = DbHelperSingleton.getConnection();
                statement2 = connection1.createStatement();
                resultSet2 = statement2.executeQuery("select name from justname");
                if (resultSet2.next()) {
                    getOldName.add(resultSet2.getString("name"));
                    System.err.println(getOldName.get(0));
                }

                String newName = getName.get(0);
                String oldName = getOldName.get(0);
                System.err.println(getName.get(0));

                // SQL UPDATE ifadesini kullanarak güncelleme yap
                String updateQuery = "UPDATE justname SET name = ? WHERE name = ?";
                preparedStatement1 = connection1.prepareStatement(updateQuery);
                preparedStatement1.setString(1, newName);
                preparedStatement1.setString(2, oldName);
                int result = preparedStatement1.executeUpdate();

            } catch (SQLException exception) {
                DbHelperSingleton.showErrorMessage(exception);
            } finally {
                // Kapatma işlemleri
                try {
                    if (resultSet2 != null) {
                        resultSet2.close();
                    }
                    if (statement2 != null) {
                        statement2.close();
                    }
                    if (preparedStatement1 != null) {
                        preparedStatement1.close();
                    }
                    if (connection1 != null) {
                        connection1.close();
                    }
                } catch (SQLException exception) {
                    
                }
            }
                
                
                kullanıcıEkranı kEkranı = new kullanıcıEkranı();
                kEkranı.setVisible(true);
                kEkranı.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Kullanıcı Bulunamadı", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        
        }catch(SQLException exception){
            
        }
    }
    
    public void adminGiris(){

            boolean kullaniciBulundu = false;
        
        try{
            for (Admins admin : getAdmins()){
            if (admin.getAdmin_mail().equals(txtMail.getText()) && admin.getAdmin_password().equals(txtPassword.getText())) {
                kullaniciBulundu = true;
                break;
            }
        }
            System.err.println(kullaniciBulundu);
            if (kullaniciBulundu){
            d=kullaniciBulundu;
            Connection connection1 = null;
            Statement statement1 = null;
            Statement statement2 = null;
            ResultSet resultSet1 = null;
            ResultSet resultSet2 = null;
            PreparedStatement preparedStatement1 = null;
            DbHelper dbHelper1 = new DbHelper();
            ArrayList<String> getName = new ArrayList<>();
            ArrayList<String> getOldName = new ArrayList<>();
            String adminMail = txtMail.getText();

            try {
                connection1 = dbHelper1.getConnection();
                statement1 = connection1.createStatement();

                // 1. Adım: Veriyi Çekme
                resultSet1 = statement1.executeQuery("select * from admin where admin_mail='" + adminMail + "'");
                if (resultSet1.next()) {
                    getName.add(resultSet1.getString("admin_NickName"));
                    System.err.println(getName.get(0));
                }

                // Bağlantıyı kapat
                if (resultSet1 != null) {
                    resultSet1.close();
                }
                if (statement1 != null) {
                    statement1.close();
                }
                if (connection1 != null) {
                    connection1.close();
                }

                // 2. Adım: Veriyi Güncelleme
                connection1 = dbHelper1.getConnection();
                statement2 = connection1.createStatement();
                resultSet2 = statement2.executeQuery("select name from justname");
                if (resultSet2.next()) {
                    getOldName.add(resultSet2.getString("name"));
                    System.err.println(getOldName.get(0));
                }

                String newName = getName.get(0);
                String oldName = getOldName.get(0);
                System.err.println(getName.get(0));

                // SQL UPDATE ifadesini kullanarak güncelleme yap
                String updateQuery = "UPDATE justname SET name = ? WHERE name = ?";
                preparedStatement1 = connection1.prepareStatement(updateQuery);
                preparedStatement1.setString(1, newName);
                preparedStatement1.setString(2, oldName);
                int result = preparedStatement1.executeUpdate();

            } catch (SQLException exception) {
                dbHelper1.showErrorMessage(exception);
            } finally {
                // Kapatma işlemleri
                try {
                    if (resultSet2 != null) {
                        resultSet2.close();
                    }
                    if (statement2 != null) {
                        statement2.close();
                    }
                    if (preparedStatement1 != null) {
                        preparedStatement1.close();
                    }
                    if (connection1 != null) {
                        connection1.close();
                    }
                } catch (SQLException exception) {
                    
                }
            }
            
                adminPaneli aPaneli = new adminPaneli();
                aPaneli.setVisible(true);
                aPaneli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Giriş İçin İzniniz Yok", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        
        }catch(SQLException exception){
            
        }
    }
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        lblMailMessage.setText("");
        lblPasswordMessage.setText("");
        int t =0;
        //************************************************************
        if(txtMail.getText().isEmpty()){
            lblMailMessage.setText("Bu alanı doldurunuz.");
        }else{
            t+=1;
        }
        if(txtPassword.getText().isEmpty()){
            lblPasswordMessage.setText("Bu alanı doldurunuz.");
        }else{
            t+=1;
        }
        if(t==2){
            giris();
            if(d){
                this.dispose();
            }
        }
        
 

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
       
    }//GEN-LAST:event_txtMailActionPerformed

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        lblMailMessage.setText("");
        lblPasswordMessage.setText("");
        int t =0;
        //************************************************************
        if(txtMail.getText().isEmpty()){
            lblMailMessage.setText("Bu alanı doldurunuz.");
        }else{
            t+=1;
        }
        if(txtPassword.getText().isEmpty()){
            lblPasswordMessage.setText("Bu alanı doldurunuz.");
        }else{
            t+=1;
        }
        if(t==2){
            adminGiris();
            if(d){
                this.dispose();
            }
            
        }
        //Admin tablosundan admin mailini alma
        /*Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<String> adminMail = new ArrayList<>();
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            String sql = "select admin_mail from admin";
            resultSet = statement.executeQuery(sql);
            
            if(resultSet.next()){
                adminMail.add(resultSet.getString("admin_mail"));
            }
            System.err.println(adminMail.get(0));
            
        }catch(SQLException exception){
            System.err.println(exception);
        }
        
        if(txtMail.getText().equals(adminMail.get(0))){
            System.out.println("Giriş başarıyla gerçekleşti.");
            adminPaneli aPaneli = new adminPaneli();
            aPaneli.setVisible(true);
            aPaneli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }else{
            System.err.println("GİRİŞ İÇİN İZNİNİZ YOK");
        } */
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnGoToRegister;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAsk;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMailMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordMessage;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
