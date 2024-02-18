
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class adminPaneli extends javax.swing.JFrame {
    private Map<String, CommandAbstarct> commands = null;

    public adminPaneli() {
        initComponents(); 
        Connection connection1 = null;
         Statement statement1 = null;
         ResultSet resultSet1 = null;
         DbHelper dbHelper1 = new DbHelper();
         ArrayList<String> getName = new ArrayList<>();
         
         try{
             connection1 = dbHelper1.getConnection();
             statement1 = connection1.createStatement();
             resultSet1 = statement1.executeQuery("select name from justname");
             if (resultSet1.next()) {
                    getName.add(resultSet1.getString("name"));
                    System.err.println(getName.get(0));
                }
             lblAdmin.setText(getName.get(0));
             
         }catch(SQLException exception){
             
         }
         
        commands = new HashMap<>();
        commands.put("ShowUsers", new ShowUsersCommand());
        commands.put("AddBooks", new AddBooksCommand());
        commands.put("BorrowBooks", new BorrowBooksCommand());
        commands.put("UpdateBooks", new UpdateBooksCommand());
        

    }
    private void executeCommand(String commandName) {
        CommandAbstarct command = commands.get(commandName);
        if (command != null) {
            command.execute();
        }
    }
    
    
        
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKitapEkleme = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnBarrowBooks = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        btnUpdateBooks = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKitapEkleme.setText("Kitap Ekle/Sil");
        btnKitapEkleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaOfAddBooks(evt);
            }
        });

        btnUsers.setText("Kullanıcıları Görüntüle");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowUsers(evt);
            }
        });

        btnBarrowBooks.setText("Ödünç Alınan Kitaplar");
        btnBarrowBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarrowBooksActionPerformed(evt);
            }
        });

        lblWelcome.setText("HOŞGELDİN");

        lblAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnUpdateBooks.setText("Kitap Güncelle");
        btnUpdateBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBooksActionPerformed(evt);
            }
        });

        btnOut.setText("Çıkış Yap");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnKitapEkleme, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBarrowBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(355, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOut, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnKitapEkleme)
                .addGap(28, 28, 28)
                .addComponent(btnUpdateBooks)
                .addGap(26, 26, 26)
                .addComponent(btnUsers)
                .addGap(28, 28, 28)
                .addComponent(btnBarrowBooks)
                .addGap(36, 36, 36)
                .addComponent(btnOut)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowUsers(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowUsers
        this.dispose(); // Mevcut pencereyi kapat
        executeCommand("ShowUsers");
    }//GEN-LAST:event_btnShowUsers

    private void btnAreaOfAddBooks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaOfAddBooks
        this.dispose(); // Mevcut pencereyi kapat
        executeCommand("AddBooks");
    }//GEN-LAST:event_btnAreaOfAddBooks

    private void btnBarrowBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarrowBooksActionPerformed
        this.dispose(); // Mevcut pencereyi kapat 
        executeCommand("BorrowBooks");
    }//GEN-LAST:event_btnBarrowBooksActionPerformed

    private void btnUpdateBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBooksActionPerformed
        this.dispose(); // Mevcut pencereyi kapat
        executeCommand("UpdateBooks");
    }//GEN-LAST:event_btnUpdateBooksActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed

        this.dispose(); // Mevcut pencereyi kapat
        // Yeni ekranı oluşturup görünür hale getir
        girisEkranı gEkranı = new girisEkranı();
        gEkranı.setVisible(true);
        gEkranı.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_btnOutActionPerformed

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
            java.util.logging.Logger.getLogger(adminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarrowBooks;
    private javax.swing.JButton btnKitapEkleme;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnUpdateBooks;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
