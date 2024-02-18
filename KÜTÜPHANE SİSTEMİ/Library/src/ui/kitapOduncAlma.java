
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class kitapOduncAlma extends javax.swing.JFrame {

    DefaultTableModel model;
    DefaultTableModel b_model;
    public kitapOduncAlma() {
        initComponents();
        populateTable();
        populateTableOfBarrowBooks();
        
    }
    public void populateTable(){
        model = (DefaultTableModel)tblBooks.getModel();
        model.setRowCount(0);
        try {
            // Books verilerini çekme
            BooksDAO booksDAO = new BooksDAO();
            ArrayList<Books> booksList = booksDAO.getAll();
            ArrayList<Books> books = booksList;
            for(Books book : books){
                    Object [] row = {book.getId(),book.getBook_name(),book.getWriter_name(),book.getPage_number(),book.getBook_type()};
                 model.addRow(row);
            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public void populateTableOfBarrowBooks(){
        b_model = (DefaultTableModel)tblBarrowBooks.getModel();
        b_model.setRowCount(0);
        try {
            // BarrowBooks verilerini çekme
            BarrowBooksDAO barrowBooksDAO = new BarrowBooksDAO();
            ArrayList<BarrowBooks> barrowBooksList = barrowBooksDAO.getAll();
            ArrayList<BarrowBooks> barrowBooks = barrowBooksList;
            for(BarrowBooks barrowBook : barrowBooks){
                    Object [] row = {barrowBook.getB_id(),barrowBook.getB_book_name(),barrowBook.getB_writer_name(),barrowBook.getB_page_number(),barrowBook.getB_book_type(),barrowBook.getTimestamp(),barrowBook.getTaker()};
                 b_model.addRow(row);
            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarrowBooks = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBarrowSelected = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearchForBarrowBooks = new javax.swing.JLabel();
        txtSearchForBarrowBooks = new javax.swing.JTextField();
        btnGiveBack = new javax.swing.JButton();
        btnGoback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBarrowBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Numarası", "Kitap", "Yazar ", "Sayfa Sayısı", "Kitap Türü", "Ödünç Alınma Tarihi", "Ödünç Alan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBarrowBooks.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblBarrowBooksAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblBarrowBooks);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("          Kütüphanede Bulunan Kitaplar");

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Kitap", "Yazar ", "Sayfa Sayısı", "Kitap Türü"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tblBooks.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblBooksAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tblBooks);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("      Kütüphaneden Ödünç Alınan Kitaplar");

        btnBarrowSelected.setText("SEÇİLİ ÖDÜNÇ ALMA");
        btnBarrowSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarrowSelectedActionPerformed(evt);
            }
        });

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

        lblSearchForBarrowBooks.setText("Arama : ");

        txtSearchForBarrowBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchForBarrowBooksActionPerformed(evt);
            }
        });
        txtSearchForBarrowBooks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchForBarrowBooksKeyReleased(evt);
            }
        });

        btnGiveBack.setText("SEÇİLİ GERİ VERME");
        btnGiveBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveBackActionPerformed(evt);
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
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnBarrowSelected)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGiveBack, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSearchForBarrowBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSearchForBarrowBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 151, 151))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(617, 617, 617)
                                .addComponent(btnGoback)))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBarrowSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchForBarrowBooks)
                            .addComponent(txtSearchForBarrowBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiveBack, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnGoback)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblBarrowBooksAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblBarrowBooksAncestorAdded

    }//GEN-LAST:event_tblBarrowBooksAncestorAdded

    private void tblBooksAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblBooksAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBooksAncestorAdded

    private void btnBarrowSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarrowSelectedActionPerformed
      // Seçilen satırın indeksi
    int selectedRow = tblBooks.getSelectedRow();
    
    if(selectedRow == -1){
        JOptionPane.showMessageDialog(null, "SATIR SEÇİLMEDİ" , "", JOptionPane.ERROR_MESSAGE);
    }

    // Seçili satırın verilerini çekme
    String id =tblBooks.getValueAt(selectedRow, 0).toString();
    String bookName = tblBooks.getValueAt(selectedRow, 1).toString();
    String writer = tblBooks.getValueAt(selectedRow, 2).toString();
    String page_number = tblBooks.getValueAt(selectedRow, 3).toString();
    String type = tblBooks.getValueAt(selectedRow, 4).toString();
    
    
    //KÜTÜPHANEDEN SİLME
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        int ctrl=1;
        try{
            connection = dbHelper.getConnection();
            String sql = "DELETE FROM books WHERE id = ? AND book_name = ? AND writer = ? AND page_number = ? AND type = ?;";
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, bookName);
            preparedStatement.setString(3, writer);
            preparedStatement.setString(4, page_number);
            preparedStatement.setString(5, type);
            
            int result = preparedStatement.executeUpdate();
            ctrl = result;
            populateTable();
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try{
                preparedStatement.close();
                connection.close();
            }catch(SQLException exception){
                
            }
        }
        if(ctrl==0){
            JOptionPane.showMessageDialog(null, "Kitap Bulunamadı", "Hata", JOptionPane.ERROR_MESSAGE);
        }else{
            //ÖDÜNÇ ALINANLAR KISMINA EKLEME
        Connection connection2 = null;
        DbHelper dbHelper2 = new DbHelper();
        PreparedStatement preparedStatement2 = null;
        
        String takerName = "TEMP"; // burada kim hangi kitabı aldıysa onun ismi yazcak
        Connection connection3 = null;
        DbHelper dbHelper3 = new DbHelper();
        Statement statement3 = null;
        ResultSet resultSet3 = null;
        ArrayList<String> getName = new ArrayList<>();
        
        
        try{
            connection3 = dbHelper3.getConnection();
            statement3 = connection3.createStatement();
            resultSet3 = statement3.executeQuery("select name from justname");
            
            if(resultSet3.next()){
                getName.add(resultSet3.getString("name"));
                takerName = getName.get(0);
            }
        }catch(SQLException exception){
            System.err.println(exception);
        }
        
        try{
            connection2 = dbHelper2.getConnection();
            String sql2 = "insert into barrowbooks (id,book_name,writer,page_number,type,barrowTime,taker) values(?,?,?,?,?,NOW(),?)";
            preparedStatement2 = connection2.prepareStatement(sql2);
            preparedStatement2.setString(1, id);
            preparedStatement2.setString(2, bookName);
            preparedStatement2.setString(3, writer);
            preparedStatement2.setString(4, page_number);
            preparedStatement2.setString(5, type);
            preparedStatement2.setString(6,takerName);
            
            int result2 = preparedStatement2.executeUpdate();
            populateTableOfBarrowBooks();
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try{
                preparedStatement2.close();
                connection2.close();
            }catch(SQLException exception){
                
            }
        }
        }
    
    }//GEN-LAST:event_btnBarrowSelectedActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblBooks.setRowSorter(tableRowSorter);

        Collator collator = Collator.getInstance(new Locale("tr", "TR"));

        tableRowSorter.setComparator(0, (o1, o2) -> collator.compare(o1.toString(), o2.toString()));
        tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+Pattern.quote(searchKey)));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchForBarrowBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchForBarrowBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchForBarrowBooksActionPerformed

    private void txtSearchForBarrowBooksKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchForBarrowBooksKeyReleased
        String searchKey = txtSearchForBarrowBooks.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(b_model);
        tblBarrowBooks.setRowSorter(tableRowSorter);

        Collator collator = Collator.getInstance(new Locale("tr", "TR"));

        tableRowSorter.setComparator(0, (o1, o2) -> collator.compare(o1.toString(), o2.toString()));
        tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)"+Pattern.quote(searchKey)));
    }//GEN-LAST:event_txtSearchForBarrowBooksKeyReleased

    private void btnGiveBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveBackActionPerformed
          
    String takerName = "TEMP"; // burada kim hangi kitabı aldıysa onun ismi yazcak
        Connection connection3 = null;
        DbHelper dbHelper3 = new DbHelper();
        Statement statement3 = null;
        ResultSet resultSet3 = null;
        ArrayList<String> getName = new ArrayList<>();
        
        
        try{
            connection3 = dbHelper3.getConnection();
            statement3 = connection3.createStatement();
            resultSet3 = statement3.executeQuery("select name from justname");
            
            if(resultSet3.next()){
                getName.add(resultSet3.getString("name"));
                takerName = getName.get(0);
            }
        }catch(SQLException exception){
            System.err.println(exception);
        }
        int selectedRowForCTRL = tblBarrowBooks.getSelectedRow();
        String table_taker = tblBarrowBooks.getValueAt(selectedRowForCTRL, 6).toString();
        System.err.println(table_taker);
        System.err.println(takerName);
        
        if(table_taker.equals(takerName)){
            // Seçilen satırın indeksi
    int selectedRow = tblBarrowBooks.getSelectedRow();
    
    if(selectedRow == -1){
        JOptionPane.showMessageDialog(null, "SATIR SEÇİLMEDİ" , "", JOptionPane.ERROR_MESSAGE);
    }

    // Seçili satırın verilerini çekme
    String id =tblBarrowBooks.getValueAt(selectedRow, 0).toString();
    String bookName = tblBarrowBooks.getValueAt(selectedRow, 1).toString();
    String writer = tblBarrowBooks.getValueAt(selectedRow, 2).toString();
    String page_number = tblBarrowBooks.getValueAt(selectedRow, 3).toString();
    String type = tblBarrowBooks.getValueAt(selectedRow, 4).toString();
    
    
    //ÖDÜNÇ ALINANLARDAN SİLME
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        int ctrl=1;
        try{
            connection = dbHelper.getConnection();
            String sql = "DELETE FROM barrowbooks WHERE id = ? AND book_name = ? AND writer = ? AND page_number = ? AND type = ?;";
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, bookName);
            preparedStatement.setString(3, writer);
            preparedStatement.setString(4, page_number);
            preparedStatement.setString(5, type);
            
            int result = preparedStatement.executeUpdate();
            ctrl = result;
            populateTableOfBarrowBooks();
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try{
                preparedStatement.close();
                connection.close();
            }catch(SQLException exception){
                
            }
        }
        if(ctrl==0){
            JOptionPane.showMessageDialog(null, "Kitap Bulunamadı", "Hata", JOptionPane.ERROR_MESSAGE);
        }else{
            //KÜTÜPHANEYE EKLEME
        Connection connection2 = null;
        DbHelper dbHelper2 = new DbHelper();
        PreparedStatement preparedStatement2 = null;
        
    
        
        try{
            connection2 = dbHelper2.getConnection();
            String sql2 = "insert into books (id,book_name,writer,page_number,type) values(?,?,?,?,?)";
            preparedStatement2 = connection2.prepareStatement(sql2);
            preparedStatement2.setString(1, id);
            preparedStatement2.setString(2, bookName);
            preparedStatement2.setString(3, writer);
            preparedStatement2.setString(4, page_number);
            preparedStatement2.setString(5, type);
            
            
            int result2 = preparedStatement2.executeUpdate();
            populateTable();
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try{
                preparedStatement2.close();
                connection2.close();
            }catch(SQLException exception){
                
            }
        }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Bu kitabı iade edemezsiniz.\nÇünkü siz almadınız :/ \nLütfen aldığınız kitaplardan işlem yapınız.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        
        /////////////////////////////////////////////////////////////////////////
          
        
    }//GEN-LAST:event_btnGiveBackActionPerformed

    private void btnGobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGobackActionPerformed
        try {
            this.dispose();
            kullanıcıEkranı kEkranı = new kullanıcıEkranı();
            kEkranı.setVisible(true);
            kEkranı.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(kitapOduncAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitapOduncAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitapOduncAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitapOduncAlma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitapOduncAlma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarrowSelected;
    private javax.swing.JButton btnGiveBack;
    private javax.swing.JButton btnGoback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSearchForBarrowBooks;
    private javax.swing.JTable tblBarrowBooks;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchForBarrowBooks;
    // End of variables declaration//GEN-END:variables
}
