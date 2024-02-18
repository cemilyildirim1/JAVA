
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class ShowUsers extends javax.swing.JFrame {

    DefaultTableModel model;
    public ShowUsers() {
        initComponents();
        populateTable();
    }
    
    public void populateTable(){
        model = (DefaultTableModel)tblUsers.getModel();
        model.setRowCount(0);
        try {
            
            ArrayList<Users> users = getUsers();
            for(Users user : users){
                    Object [] row = {user.getId(),user.getUser_name(),user.getUser_surname(),user.getMail(),user.getPassword()};
                 model.addRow(row);
            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public ArrayList<Users> getUsers() throws SQLException{
            Connection mysqlConnection = null;
            Statement statement=null;
            ResultSet resultSet;
            ArrayList<Users> users = new ArrayList<>();
            
        try{
            mysqlConnection = DbHelperSingleton.getConnection();
            System.out.println("Baglanti basarili.");
            
            statement = mysqlConnection.createStatement();
            resultSet = statement.executeQuery("select * from users");
            System.out.println(mysqlConnection);
            System.out.println(statement);
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
            mysqlConnection.close();
        }
        
        return users;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnGoback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Ad", "Soyad", "Mail", "Şifre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblUsersAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblUsersKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        lblSearch.setText("Arama : ");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnGoback.setText("Geri Dön");
        btnGoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGobackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnGoback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoback)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblUsersAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblUsersAncestorAdded

    }//GEN-LAST:event_tblUsersAncestorAdded

    private void tblUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUsersKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblUsers.setRowSorter(tableRowSorter);
        
        Collator collator = Collator.getInstance(new Locale("tr", "TR"));
        
        tableRowSorter.setComparator(0, (o1, o2) -> collator.compare(o1.toString(), o2.toString()));
        tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+Pattern.quote(searchKey)));
    }//GEN-LAST:event_tblUsersKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblUsers.setRowSorter(tableRowSorter);

        Collator collator = Collator.getInstance(new Locale("tr", "TR"));

        tableRowSorter.setComparator(0, (o1, o2) -> collator.compare(o1.toString(), o2.toString()));
        tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+Pattern.quote(searchKey)));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnGobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGobackActionPerformed
        this.dispose();
        adminPaneli aPaneli = new adminPaneli();
        aPaneli.setVisible(true);
        aPaneli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnGobackActionPerformed

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
            java.util.logging.Logger.getLogger(ShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
